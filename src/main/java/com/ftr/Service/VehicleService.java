package com.ftr.Service;

import java.util.List;

import com.ftr.DTO.VehicleDTO;
import com.ftr.Exception.FtrException;

public interface VehicleService {
	
	public String addvehicle(VehicleDTO vehicleDTO) throws FtrException;
	
	public List<VehicleDTO> findByVehicleStatus(String vehicleStatus) throws FtrException;
	
	public List<VehicleDTO> findByVehicleName(String vehicleName) throws FtrException;
	
	public VehicleDTO getVehicle(String vehicleNumber) throws FtrException;
	
	public String deleteVehicle(String vehicleNumber) throws FtrException;

}
