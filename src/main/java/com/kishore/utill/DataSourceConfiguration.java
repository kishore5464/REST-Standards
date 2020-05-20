package com.kishore.utill;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataSourceConfiguration {

	@Value("${DB_NAME}")
	private String dbName;
	
	@Value("${USERNAME}")
	private String userName;
	
	@Value("${PASSWORD}")
	private String password;
	
	@Value("${CONNECTION_URL}")
	private String connectionURL;
	
	@Value("${POOL_MAX_SIZE}")
	private String maxPool;
	
	@Value("${POOL_MIN_SIZE}")
	private String minPool;

	public DataSourceConfiguration() {
		super();
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConnectionURL() {
		return connectionURL;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}

	public String getMaxPool() {
		return maxPool;
	}

	public void setMaxPool(String maxPool) {
		this.maxPool = maxPool;
	}

	public String getMinPool() {
		return minPool;
	}

	public void setMinPool(String minPool) {
		this.minPool = minPool;
	}

}
