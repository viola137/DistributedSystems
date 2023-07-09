//package com.esslingen.dsSystems;
//
//import java.util.HashMap;
//import java.util.Properties;
//
//import javax.sql.DataSource;
//
//import org.hibernate.cfg.AvailableSettings;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//
//@Configuration
//@PropertySource({ "classpath:application.yml" })
//@EnableJpaRepositories(basePackages = "com.esslingen.dsSystems", entityManagerFactoryRef = "dsEntityManager", transactionManagerRef = "dsTransactionManager")
//public class JpaConfiguration {
//
//	@Value("${spring.datasource.url}")
//	private String url;
//
//	@Value("${spring.datasource.username}")
//	private String username;
//
//	@Value("${spring.datasource.password}")
//	private String password;
//
//	@Value("${spring.datasource.driverClassName}")
//	private String driver;
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean dsEntityManager() {
//		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//		em.setDataSource(dsDataSource());
//		em.setPackagesToScan("com.esslingen.dsSystems");
//		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//		em.setJpaVendorAdapter(vendorAdapter);
//		HashMap<String, Object> properties = new HashMap<>();
//		properties.put(AvailableSettings.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
//		em.setJpaPropertyMap(properties);
//		return em;
//	}
//
//	@Bean
//	public DataSource dsDataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(driver);
//		dataSource.setUrl(url);
//		dataSource.setUsername(username);
//		dataSource.setPassword(password);
//		Properties properties = new Properties();
//		properties.put(AvailableSettings.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
//		dataSource.setConnectionProperties(properties);
//		return dataSource;
//	}
//	
//	@Bean
//	public PlatformTransactionManager dsTransactionManager() {
//		JpaTransactionManager transactionManager = new JpaTransactionManager();
//		transactionManager.setEntityManagerFactory(dsEntityManager().getObject());
//		return transactionManager;
//	}
//}
