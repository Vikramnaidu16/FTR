package com.ftr.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftr.DTO.VehicleDTO;
import com.ftr.Exception.FtrException;
import com.ftr.Service.VehicleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/ftrvehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping(value = "/addvehicle")
	public ResponseEntity<String> addVehicle(@RequestBody @Valid VehicleDTO vehicleDTO) throws FtrException{
		String success = vehicleService.addvehicle(vehicleDTO);
		return new ResponseEntity<>(success, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/getvehiclebystatus/{vehicleStatus}")
	public ResponseEntity<List<VehicleDTO>> findByVehicleStatus(@PathVariable String vehicleStatus) throws FtrException{
		List<VehicleDTO> vehicleDTO = vehicleService.findByVehicleStatus(vehicleStatus);
		return new ResponseEntity<>(vehicleDTO, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getvehiclebyname/{vehicleName}")
	public ResponseEntity<List<VehicleDTO>> findByVehicleName(@PathVariable String vehicleName) throws FtrException{
		List<VehicleDTO> vehicleDTO = vehicleService.findByVehicleName(vehicleName);
		return new ResponseEntity<>(vehicleDTO, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getvehicle/{vehicleNumber}")
	public ResponseEntity<VehicleDTO> getVehicle(@PathVariable String vehicleNumber) throws FtrException{
		VehicleDTO vehicleDTO = vehicleService.getVehicle(vehicleNumber);
		return new ResponseEntity<>(vehicleDTO, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deletevehicle/{vehicleNumber}")
	public ResponseEntity<String> deleteVehicle(@PathVariable String vehicleNumber) throws FtrException{
		String success = vehicleService.deleteVehicle(vehicleNumber);
		return new ResponseEntity<>(success, HttpStatus.OK);
	}

}
