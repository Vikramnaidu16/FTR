package com.ftr.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftr.DTO.VehicleDTO;
import com.ftr.Entity.VehicleEntity;
import com.ftr.Exception.FtrException;
import com.ftr.Repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public String addvehicle(VehicleDTO vehicleDTO) throws FtrException{
		VehicleEntity vehicleEntity = new VehicleEntity();
		vehicleEntity.setCountry(vehicleDTO.getCountry());
		vehicleEntity.setHarborLocation(vehicleDTO.getHarborLocation());
		vehicleEntity.setMaxLiftingCapacity(vehicleDTO.getMaxLiftingCapacity());
		vehicleEntity.setRetireDate(vehicleDTO.getRetireDate());
		vehicleEntity.setVehicleName(vehicleDTO.getVehicleName());
		vehicleEntity.setVehicleNumber(vehicleDTO.getVehicleNumber());
		vehicleEntity.setVehicleStatus(vehicleDTO.getVehicleStatus());
		vehicleRepository.save(vehicleEntity);
		return "New Vehicle is added Successfully";
	}

	@Override
	public List<VehicleDTO> findByVehicleStatus(String vehicleStatus) throws FtrException{
		List<VehicleEntity> vehicleEntityList = vehicleRepository.findByVehicleStatus(vehicleStatus);
		List<VehicleDTO> vehicleDTOList = new ArrayList<>();
		for(VehicleEntity vehicle : vehicleEntityList) {
			VehicleDTO vehicleDTO = new VehicleDTO();
			vehicleDTO.setCountry(vehicle.getCountry());
			vehicleDTO.setHarborLocation(vehicle.getHarborLocation());
			vehicleDTO.setMaxLiftingCapacity(vehicle.getMaxLiftingCapacity());
			vehicleDTO.setRetireDate(vehicle.getRetireDate());
			vehicleDTO.setVehicleName(vehicle.getVehicleName());
			vehicleDTO.setVehicleNumber(vehicle.getVehicleNumber());
			vehicleDTO.setVehicleStatus(vehicle.getVehicleStatus());
			vehicleDTOList.add(vehicleDTO);
		}
		return vehicleDTOList;
	}

	@Override
	public List<VehicleDTO> findByVehicleName(String vehicleName) throws FtrException{
		List<VehicleEntity> vehicleEntityList = vehicleRepository.findByVehicleName(vehicleName);
		List<VehicleDTO> vehicleDTOList = new LinkedList<>();
		for(VehicleEntity vehicle : vehicleEntityList) {
			VehicleDTO vehicleDTO = new VehicleDTO();
			vehicleDTO.setCountry(vehicle.getCountry());
			vehicleDTO.setHarborLocation(vehicle.getHarborLocation());
			vehicleDTO.setMaxLiftingCapacity(vehicle.getMaxLiftingCapacity());
			vehicleDTO.setRetireDate(vehicle.getRetireDate());
			vehicleDTO.setVehicleName(vehicle.getVehicleName());
			vehicleDTO.setVehicleNumber(vehicle.getVehicleNumber());
			vehicleDTO.setVehicleStatus(vehicle.getVehicleStatus());
			vehicleDTOList.add(vehicleDTO);
		}
		return vehicleDTOList;
	}

	@Override
	public VehicleDTO getVehicle(String vehicleNumber) throws FtrException{
		Optional<VehicleEntity> vehicleEntityOptional = vehicleRepository.findById(vehicleNumber);
		VehicleDTO vehicleDTO = new VehicleDTO();
		vehicleDTO.setCountry(vehicleEntityOptional.get().getCountry());
		vehicleDTO.setHarborLocation(vehicleEntityOptional.get().getHarborLocation());
		vehicleDTO.setMaxLiftingCapacity(vehicleEntityOptional.get().getMaxLiftingCapacity());
		vehicleDTO.setRetireDate(vehicleEntityOptional.get().getRetireDate());
		vehicleDTO.setVehicleName(vehicleEntityOptional.get().getVehicleName());
		vehicleDTO.setVehicleNumber(vehicleEntityOptional.get().getVehicleNumber());
		vehicleDTO.setVehicleStatus(vehicleEntityOptional.get().getVehicleStatus());
		return vehicleDTO;
	}

	@Override
	public String deleteVehicle(String vehicleNumber) throws FtrException{
		vehicleRepository.deleteById(vehicleNumber);
		return "The vehicle has been deleted";
	}

}
