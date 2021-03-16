package com.erp.financial.maximus.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
	
	private static final Logger LOG = LoggerFactory.getLogger(DBConfiguration.class);
	
	@Value("${spring.datasource.driverClassName:}")
	private String driverClassName;
	
	@Value("${spring.datasource.url:}")
	private String url;
	
	@Value("${welcome.mesage:}")
	private String wmsg;
	
	@Value("${trgt.db:}")
	private String targetDb;
	
	@Value("${spring.jpa.properties.hibernate.jdbc.batch_size}")
	private String dbBatchLimiter;
	
	
	@Profile("local")
	@Bean
	public String localDatabaseConnBean() {
		LOG.info(wmsg);
		LOG.info("DB Connection for local - target db: " + targetDb);
		LOG.info(driverClassName);
		LOG.info(url);
		return "local";
		
	}
	
	@Profile("dev")
	@Bean
	public String devDatabaseConnBean() {
		LOG.info(wmsg);
		LOG.info("DB Connection for DEV - target db: " + targetDb);
		LOG.info(driverClassName);
		LOG.info(url);
		return "dev";
		
	}
	
	@Profile("staging")
	@Bean
	public String staginDatabaseConnBean() {
		LOG.info(wmsg);
		LOG.info("DB Connection for STAGING - target db: " + targetDb);
		LOG.info(driverClassName);
		LOG.info(url);
		return "staging";
		
	}
	
	@Profile("prod")
	@Bean
	public String prodDatabaseConnBean() {
		LOG.info(wmsg);
		LOG.info("DB Connection for PROD - target db: " + targetDb);
		LOG.info(driverClassName);
		LOG.info(url);
		return "prod";
		
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getWmsg() {
		return wmsg;
	}

	public void setWmsg(String wmsg) {
		this.wmsg = wmsg;
	}

	public String getTargetDb() {
		return targetDb;
	}

	public void setTargetDb(String targetDb) {
		this.targetDb = targetDb;
	}

	public String getDbBatchLimiter() {
		return dbBatchLimiter;
	}

	public void setDbBatchLimiter(String dbBatchLimiter) {
		this.dbBatchLimiter = dbBatchLimiter;
	}
	
	

}
