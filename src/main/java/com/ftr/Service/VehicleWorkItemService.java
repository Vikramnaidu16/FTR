package com.ftr.Service;

import com.ftr.DTO.VehicleWorkItemDTO;
import com.ftr.Exception.FtrException;

public interface VehicleWorkItemService {
	
	public String addVehicleWorkItem(VehicleWorkItemDTO vehicleWorkItemDTO) throws FtrException;

}
