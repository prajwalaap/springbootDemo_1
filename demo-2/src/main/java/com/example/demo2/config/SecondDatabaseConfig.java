package com.example.demo2.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(
		basePackages = "{com.example.demo2.second.dao}",
		entityManagerFactoryRef = "SecondEntityManagerFactory",transactionManagerRef = "secondTransactionManager")
@EnableTransactionManagement
public class SecondDatabaseConfig {
	
	@Bean(name = "secondDataSource")
	  @ConfigurationProperties(prefix = "datasource.second")
	  public DataSource seconddataSource() {
	    return DataSourceBuilder.create().build();
	  }
	  
	  @Bean(name = "SecondEntityManagerFactory")
	  public LocalContainerEntityManagerFactoryBean 
	  secondEntityManagerFactory(
	    EntityManagerFactoryBuilder builder,
	    @Qualifier("secondDataSource") DataSource dataSource
	  ) {
	    return
	      builder
	        .dataSource(dataSource)
	        .packages("com.example.demo2.second.model")
	        .persistenceUnit("second")
	        .build();
	  }
	  @Bean(name = "secondTransactionManager")
	  public PlatformTransactionManager secondTransactionManager(
	    @Qualifier("SecondEntityManagerFactory") EntityManagerFactory
	    secondEntityManagerFactory
	  ) {
	    return new JpaTransactionManager(secondEntityManagerFactory);
	  }

}
