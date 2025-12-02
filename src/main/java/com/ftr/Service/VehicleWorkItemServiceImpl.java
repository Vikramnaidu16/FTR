package com.ftr.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftr.DTO.VehicleWorkItemDTO;
import com.ftr.Entity.VehicleWorkItemEntity;
import com.ftr.Exception.FtrException;
import com.ftr.Repository.VehicleWorkItemRepository;

@Service
public class VehicleWorkItemServiceImpl implements VehicleWorkItemService{
	
	@Autowired
	private VehicleWorkItemRepository vehicleWorkItemRepository;

	@Override
	public String addVehicleWorkItem(VehicleWorkItemDTO vehicleWorkItemDTO) throws FtrException{
		VehicleWorkItemEntity vehicleWorkItemEntity = new VehicleWorkItemEntity();
		vehicleWorkItemEntity.setWorkItemId(vehicleWorkItemDTO.getWorkItemId());
		vehicleWorkItemEntity.setVehicleNumber(vehicleWorkItemDTO.getVehicleNumber());
		vehicleWorkItemEntity.setAssignedworkItemStatus(vehicleWorkItemDTO.getAssignedworkItemStatus());
		vehicleWorkItemRepository.save(vehicleWorkItemEntity);
		return "New Vehicle work item is added Successfully";
	}

}
