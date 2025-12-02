package com.ftr.Entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class VehicleEntity {
	
	@Id
	private String vehicleNumber;
	private String vehicleName;
	private Integer maxLiftingCapacity;
	private LocalDate retireDate;
	private String vehicleStatus;
	private String country;
	private String harborLocation;
	
	public VehicleEntity() {
		
	}

	public VehicleEntity(String vehicleNumber, String vehicleName, Integer maxLiftingCapacity, LocalDate retireDate,
			String vehicleStatus, String country, String harborLocation) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.maxLiftingCapacity = maxLiftingCapacity;
		this.retireDate = retireDate;
		this.vehicleStatus = vehicleStatus;
		this.country = country;
		this.harborLocation = harborLocation;
	}

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

	@Override
	public String toString() {
		return "VehicleEntity [vehicleNumber=" + vehicleNumber + ", vehicleName=" + vehicleName
				+ ", maxLiftingCapacity=" + maxLiftingCapacity + ", retireDate=" + retireDate + ", vehicleStatus="
				+ vehicleStatus + ", country=" + country + ", harborLocation=" + harborLocation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, harborLocation, maxLiftingCapacity, retireDate, vehicleName, vehicleNumber,
				vehicleStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleEntity other = (VehicleEntity) obj;
		return Objects.equals(country, other.country) && Objects.equals(harborLocation, other.harborLocation)
				&& Objects.equals(maxLiftingCapacity, other.maxLiftingCapacity)
				&& Objects.equals(retireDate, other.retireDate) && Objects.equals(vehicleName, other.vehicleName)
				&& Objects.equals(vehicleNumber, other.vehicleNumber)
				&& Objects.equals(vehicleStatus, other.vehicleStatus);
	}

}
