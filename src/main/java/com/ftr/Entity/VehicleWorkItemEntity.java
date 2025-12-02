package com.ftr.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VehicleWorkItem")
public class VehicleWorkItemEntity {
	
	@Id
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
	
	@Override
	public String toString() {
		return "VehicleWorkItemEntity [vehicleNumber=" + vehicleNumber + ", workItemId=" + workItemId
				+ ", assignedworkItemStatus=" + assignedworkItemStatus + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(assignedworkItemStatus, vehicleNumber, workItemId);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VehicleWorkItemEntity other = (VehicleWorkItemEntity) obj;
		return Objects.equals(assignedworkItemStatus, other.assignedworkItemStatus)
				&& Objects.equals(vehicleNumber, other.vehicleNumber) && Objects.equals(workItemId, other.workItemId);
	}

}
