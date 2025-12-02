package com.ftr.Service;

import com.ftr.DTO.WorkItemTerminalDTO;
import com.ftr.Exception.FtrException;

public interface WorkItemTerminalService {
	
	public String addWorkItemTerminal(WorkItemTerminalDTO workItemTerminalDTO) throws FtrException;

}
