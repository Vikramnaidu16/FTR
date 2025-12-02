package com.ftr.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftr.Entity.VehicleEntity;

@Repository
public interface VehicleRepository extends CrudRepository<VehicleEntity, String>{
	
	public List<VehicleEntity> findByVehicleStatus(String vehicleStatus);
	
	public List<VehicleEntity> findByVehicleName(String vehicleName);

}
