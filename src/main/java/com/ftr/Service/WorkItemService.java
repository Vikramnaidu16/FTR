package com.ftr.Service;

import java.util.List;

import com.ftr.DTO.WorkItemDTO;
import com.ftr.Exception.FtrException;

public interface WorkItemService {
	
	public String addWorkItem(WorkItemDTO workItemDTO) throws FtrException;
	
	public String updateWorkItem(String workItemId, WorkItemDTO workItemDTO) throws FtrException;
	
	public WorkItemDTO getWorkItem(String workItemId) throws FtrException;
	
	public List<String> getAvailableHarborLocations(String country) throws FtrException;

}
