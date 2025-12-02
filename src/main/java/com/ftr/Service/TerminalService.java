package com.ftr.Service;

import com.ftr.DTO.TerminalDTO;
import com.ftr.Exception.FtrException;

public interface TerminalService {
	
	public String addTerminal(TerminalDTO terminalDTO) throws FtrException;
	
	public String updateTerminal(String terminalId, TerminalDTO terminalDTO) throws FtrException;
	
	public String deleteTerminal(String terminalId) throws FtrException;
	
	public TerminalDTO getTerminal(String terminalId) throws FtrException;
	
	public TerminalDTO getTerminalByType(String itemType) throws FtrException;

}
