package com.ftr.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftr.Entity.WorkItemEntity;

@Repository
public interface WorkItemRepository extends CrudRepository<WorkItemEntity, String>{
	
	

}
