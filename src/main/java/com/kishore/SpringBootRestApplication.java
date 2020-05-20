package com.kishore;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kishore.utill.DataSourceConfiguration;

@SpringBootApplication
public class SpringBootRestApplication implements CommandLineRunner {

	@Autowired
	private DataSourceConfiguration dataSourceConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Map<String, String> dbConnectionProperties = new HashMap<>();

		dbConnectionProperties.put("DB_NAME", dataSourceConfiguration.getDbName());
		dbConnectionProperties.put("USERNAME", dataSourceConfiguration.getDbName());
		dbConnectionProperties.put("PASSWORD", dataSourceConfiguration.getDbName());
		dbConnectionProperties.put("CONNECTION_URL", dataSourceConfiguration.getDbName());
		dbConnectionProperties.put("POOL_MAX_SIZE", dataSourceConfiguration.getDbName());
		dbConnectionProperties.put("POOL_MIN_SIZE", dataSourceConfiguration.getDbName());

	}

}
