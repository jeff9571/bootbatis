package com.example.demo.config.dao;

import java.beans.PropertyVetoException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@MapperScan("com.example.demo.dao")
public class DataSourceConfiguration {

	@Value("${spring.datasource.driver-class-name}")
	private String driverClass;
	
	@Value("${spring.datasource.url}")
	private String jdbcUrl;
	
	@Value("${spring.datasource.username}")
	private String user;
	
	@Value("${spring.datasource.password}")
	private String password;

	@Bean(name="dataSource")
	public ComboPooledDataSource createDataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		dataSource.setAutoCommitOnClose(false);
		return dataSource;
	}
}
