package com.ftr.Service;



import com.ftr.DTO.UserDTO;
import com.ftr.Exception.FtrException;


public interface UserService {
	
	public String addUser(UserDTO userDTO) throws FtrException;
	
	public String updateUser(Integer userId, UserDTO userDTO) throws FtrException;
	
	public UserDTO viewProfile(Integer userId) throws FtrException;
	
	public String deleteUser(Integer userId) throws FtrException;

}
