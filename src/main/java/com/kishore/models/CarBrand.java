package com.kishore.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CAR_BRAND")
public class CarBrand implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer brandId;
	private String brand;
	private String logo;
	private Date createdDate;

	private Set<CarModel> carModels = new HashSet<>();

	public CarBrand() {
		super();
	}

	public CarBrand(Integer brandId, String brand, String logo, Date createdDate, Set<CarModel> carModels) {
		super();
		this.brandId = brandId;
		this.brand = brand;
		this.logo = logo;
		this.createdDate = createdDate;
		this.carModels = carModels;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Set<CarModel> getCarModels() {
		return carModels;
	}

	public void setCarModels(Set<CarModel> carModels) {
		this.carModels = carModels;
	}

}
