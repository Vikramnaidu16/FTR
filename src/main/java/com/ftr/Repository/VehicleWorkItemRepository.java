package com.ftr.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftr.Entity.VehicleWorkItemEntity;

@Repository
public interface VehicleWorkItemRepository extends CrudRepository<VehicleWorkItemEntity, String>{

}
