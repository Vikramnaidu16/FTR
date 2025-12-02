package com.ftr.DTO;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public class VehicleDTO {
	
	@NotNull(message = "{vehicle.vehicleNumber.must}")
	private String vehicleNumber;
	
	@NotNull(message = "{vehicle.vehicleName.must}")
	private String vehicleName;
	
	@NotNull(message = "{vehicle.maxLiftingCapacity.must}")
	private Integer maxLiftingCapacity;
	
	@NotNull(message = "{vehicle.retireDate.must}")
	private LocalDate retireDate;
	
	@NotNull(message = "{vehicle.vehicleStatus.must}")
	private String vehicleStatus;
	
	@NotNull(message = "Country should be present, please check")
	private String country;
	
	@NotNull(message = "Harbor location should be present, please check")
	private String harborLocation;
	
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public Integer getMaxLiftingCapacity() {
		return maxLiftingCapacity;
	}
	public void setMaxLiftingCapacity(Integer maxLiftingCapacity) {
		this.maxLiftingCapacity = maxLiftingCapacity;
	}
	public LocalDate getRetireDate() {
		return retireDate;
	}
	public void setRetireDate(LocalDate retireDate) {
		this.retireDate = retireDate;
	}
	public String getVehicleStatus() {
		return vehicleStatus;
	}
	public void setVehicleStatus(String vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHarborLocation() {
		return harborLocation;
	}
	public void setHarborLocation(String harborLocation) {
		this.harborLocation = harborLocation;
	}

}
