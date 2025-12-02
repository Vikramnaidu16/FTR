package com.ftr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftr.DTO.WorkItemTerminalDTO;
import com.ftr.Exception.FtrException;
import com.ftr.Service.WorkItemTerminalService;

@RestController
@RequestMapping(value = "/ftrworkitemterminal")
public class WorkItemTerminalController {
	
	@Autowired
	private WorkItemTerminalService workItemTerminalService;
	
	@PostMapping(value = "/addworkitemterminal")
	public ResponseEntity<String> addWorkItemTerminal(@RequestBody WorkItemTerminalDTO workItemTerminalDTO) throws FtrException{
		String success = workItemTerminalService.addWorkItemTerminal(workItemTerminalDTO);
		return new ResponseEntity<>(success, HttpStatus.CREATED);
	}

}
