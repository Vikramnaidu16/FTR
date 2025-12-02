package com.ftr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftr.DTO.WorkItemDTO;
import com.ftr.Exception.FtrException;
import com.ftr.Service.WorkItemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/ftrworkitem")
public class WorkItemController {
	
	@Autowired
	private WorkItemService workItemService;
	
	@PostMapping(value = "/addworkitem")
	public ResponseEntity<String> addWorkItem(@RequestBody @Valid WorkItemDTO workItemDTO) throws FtrException{
		String success = workItemService.addWorkItem(workItemDTO);
		return new ResponseEntity<>(success, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/updateworkitem/{workItemId}")
	public ResponseEntity<String> updateWorkItem(@PathVariable String workItemId, @RequestBody @Valid WorkItemDTO workItemDTO) throws FtrException{
		String success = workItemService.updateWorkItem(workItemId, workItemDTO);
		return new ResponseEntity<>(success, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getworkitem/{workItemId}")
	public ResponseEntity<WorkItemDTO> getWorkItem(@PathVariable String workItemId) throws FtrException{
		WorkItemDTO workItemDTO = workItemService.getWorkItem(workItemId);
		return new ResponseEntity<>(workItemDTO, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getharborslist/{country}")
	public ResponseEntity<List<String>> getAvailableHarborLocations(@PathVariable String country) throws FtrException{
		List<String> harborsList = workItemService.getAvailableHarborLocations(country);
		return new ResponseEntity<>(harborsList, HttpStatus.OK);
	}

}
