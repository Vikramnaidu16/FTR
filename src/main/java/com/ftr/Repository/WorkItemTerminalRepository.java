package com.ftr.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ftr.Entity.WorkItemTerminalEntity;

@Repository
public interface WorkItemTerminalRepository extends CrudRepository<WorkItemTerminalEntity, String>{

}
