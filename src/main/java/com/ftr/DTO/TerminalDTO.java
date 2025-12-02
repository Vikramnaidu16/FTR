package com.ftr.DTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class TerminalDTO {
	
	private String terminalId;
	
	@NotNull(message = "Terminal Name should be present, please check")
	@Min(value = 3, message = "Terminal Name should be minimum of 3 characters and maximum of 20 characters")
	@Max(value = 20, message = "Terminal Name should be minimum of 3 characters and maximum of 20 characters")
	private String terminalName;
	
	@NotNull(message = "Country Name should be present, please check")
	@Min(value = 3, message = "Country Name should be minimum of 3 characters and maximum of 20 characters")
	@Max(value = 20, message = "Country Name should be minimum of 3 characters and maximum of 20 characters.")
	private String country;
	
	@NotNull(message = "Item type should be present, please check")
	@Min(value = 4, message = "Item type should be minimum of 4 characters and maximum of 30 characters")
	@Max(value = 30, message = "Item type should be minimum of 4 characters and maximum of 30 characters")
	private String itemType;
	
	@NotNull(message = "Terminal Description should be present, please check")
	@Max(value = 25, message = "Terminal Description should be maximum of 25 characters")
	private String terminalDescription;
	
	@NotNull(message = "Terminal Capacity should be present, please check")
	private Integer capacity;
	
	@NotNull(message = "Terminal available capacity should be present, please check")
	private Integer availableCapacity;
	
	@NotNull(message = "Terminal Status should be present, please check")
	private String status;
	
	@NotNull(message = "Harbor Location should be present, please check")
	private String harborLocation;
	
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getTerminalDescription() {
		return terminalDescription;
	}
	public void setTerminalDescription(String terminalDescription) {
		this.terminalDescription = terminalDescription;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Integer getAvailableCapacity() {
		return availableCapacity;
	}
	public void setAvailableCapacity(Integer availableCapacity) {
		this.availableCapacity = availableCapacity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHarborLocation() {
		return harborLocation;
	}
	public void setHarborLocation(String harborLocation) {
		this.harborLocation = harborLocation;
	}

}
