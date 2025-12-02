package com.ftr.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ftr.DTO.UserDTO;
import com.ftr.Exception.FtrException;
import com.ftr.Service.UserService;

@RestController
@RequestMapping(value = "/ftruser")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/adduser")
	public ResponseEntity<String> addUser(@RequestBody UserDTO userDTO) throws FtrException{
		String success = userService.addUser(userDTO);
		return new ResponseEntity<>(success, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/updateuser/{userId}")
	public ResponseEntity<String> updateUser(@PathVariable Integer userId, @RequestBody UserDTO userDTO) throws FtrException{
		String success = userService.updateUser(userId, userDTO);
		return new ResponseEntity<>(success, HttpStatus.OK);
	}
	
	@GetMapping(value = "/viewprofile/{userId}")
	public ResponseEntity<UserDTO> viewProfile(@PathVariable Integer userId) throws FtrException{
		UserDTO userDTO = userService.viewProfile(userId);
		return new ResponseEntity<>(userDTO, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/deleteuser/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer userId) throws FtrException{
		String success = userService.deleteUser(userId);
		return new ResponseEntity<>(success, HttpStatus.OK);
	}

}
