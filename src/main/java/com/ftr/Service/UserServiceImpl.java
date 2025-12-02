package com.ftr.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftr.DTO.UserDTO;
import com.ftr.Entity.UserEntity;
import com.ftr.Exception.FtrException;
import com.ftr.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public String addUser(UserDTO userDTO) throws FtrException{
		UserEntity userEntity = new UserEntity();
		userEntity.setUserId(userDTO.getUserId());
		userEntity.setFirstName(userDTO.getFirstName());
		userEntity.setEmailId(userDTO.getEmailId());
		userEntity.setLastName(userDTO.getLastName());
		userEntity.setMobileNumber(userDTO.getMobileNumber());
		userEntity.setNationality(userDTO.getNationality());
		userEntity.setOfficeAddress(userDTO.getOfficeAddress());
		userEntity.setPassportNumber(userDTO.getPassportNumber());
		userEntity.setPassword(userDTO.getPassword());
		userEntity.setPermanentAddress(userDTO.getPermanentAddress());
		userEntity.setPersonalIdentificationNumber(userDTO.getPersonalIdentificationNumber());
		userRepository.save(userEntity);
		return "Your account has been created Successfully";
	}

	@Override
	public String updateUser(Integer userId, UserDTO userDTO) throws FtrException{
		Optional<UserEntity> userEntityOptional = userRepository.findById(userId);
		UserEntity userEntity = userEntityOptional.orElseThrow();
		userEntity.setEmailId(userDTO.getEmailId());
		userRepository.save(userEntity);
		return "Your email id is updated Successfully";
	}

	@Override
	public UserDTO viewProfile(Integer userId) throws FtrException{
		Optional<UserEntity> userEntityOptional = userRepository.findById(userId);
		UserDTO userDTO = new UserDTO();
		userDTO.setEmailId(userEntityOptional.get().getEmailId());
		userDTO.setFirstName(userEntityOptional.get().getFirstName());
		userDTO.setLastName(userEntityOptional.get().getLastName());
		userDTO.setMobileNumber(userEntityOptional.get().getMobileNumber());
		userDTO.setNationality(userEntityOptional.get().getNationality());
		userDTO.setOfficeAddress(userEntityOptional.get().getOfficeAddress());
		userDTO.setPassportNumber(userEntityOptional.get().getPassportNumber());
		userDTO.setPassword(userEntityOptional.get().getPassword());
		userDTO.setPermanentAddress(userEntityOptional.get().getPermanentAddress());
		userDTO.setPersonalIdentificationNumber(userEntityOptional.get().getPersonalIdentificationNumber());
		userDTO.setUserId(userEntityOptional.get().getUserId());
		return userDTO;
	}

	@Override
	public String deleteUser(Integer userId) throws FtrException{
		userRepository.deleteById(userId);
		return "Your account has been deleted Successfully";
	}

}
