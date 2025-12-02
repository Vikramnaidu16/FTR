package com.ftr.DTO;

public class VehicleWorkItemDTO {
	
	private String vehicleNumber;
	private String workItemId;
	private String assignedworkItemStatus;
	
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getWorkItemId() {
		return workItemId;
	}
	public void setWorkItemId(String workItemId) {
		this.workItemId = workItemId;
	}
	public String getAssignedworkItemStatus() {
		return assignedworkItemStatus;
	}
	public void setAssignedworkItemStatus(String assignedworkItemStatus) {
		this.assignedworkItemStatus = assignedworkItemStatus;
	}
	
}
