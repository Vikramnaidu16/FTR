package com.ftr.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftr.DTO.WorkItemTerminalDTO;
import com.ftr.Entity.WorkItemTerminalEntity;
import com.ftr.Exception.FtrException;
import com.ftr.Repository.WorkItemTerminalRepository;

@Service
public class WorkItemTerminalServiceImpl implements WorkItemTerminalService{
	@Autowired
	private WorkItemTerminalRepository workItemTerminalRepository;

	@Override
	public String addWorkItemTerminal(WorkItemTerminalDTO workItemTerminalDTO) throws FtrException{
		WorkItemTerminalEntity workItemTerminalEntity = new WorkItemTerminalEntity();
		workItemTerminalEntity.setTerminalId(workItemTerminalDTO.getTerminalId());
		workItemTerminalEntity.setWorkItemId(workItemTerminalDTO.getWorkItemId());
		workItemTerminalRepository.save(workItemTerminalEntity);
		return "New Work Item Terminal is added Successfully";
	}

}
