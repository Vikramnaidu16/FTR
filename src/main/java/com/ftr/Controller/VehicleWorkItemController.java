package com.ftr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftr.DTO.VehicleWorkItemDTO;
import com.ftr.Exception.FtrException;
import com.ftr.Service.VehicleWorkItemService;

@RestController
@RequestMapping(value = "/ftrvehicleworkitem")
public class VehicleWorkItemController {
	
	@Autowired
	private VehicleWorkItemService vehicleWorkItemService;
	
	@PostMapping(value = "/addvehicleworkitem")
	public ResponseEntity<String> addVehicleWorkItem(@RequestBody VehicleWorkItemDTO vehicleWorkItemDTO) throws FtrException{
		String success = vehicleWorkItemService.addVehicleWorkItem(vehicleWorkItemDTO);
		return new ResponseEntity<>(success, HttpStatus.CREATED);
	}

}
