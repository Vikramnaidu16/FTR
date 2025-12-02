package com.ftr.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class UserEntity {
	
	@Id
	private Integer userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private Long mobileNumber;
	private String password;
	private String nationality;
	private String passportNumber;
	private String permanentAddress;
	private String officeAddress;
	private Long personalIdentificationNumber;
	
	public UserEntity() {
		
	}

	public UserEntity(Integer userId, String firstName, String lastName, String emailId, Long mobileNumber,
			String password, String nationality, String passportNumber, String permanentAddress, String officeAddress,
			Long personalIdentificationNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.nationality = nationality;
		this.passportNumber = passportNumber;
		this.permanentAddress = permanentAddress;
		this.officeAddress = officeAddress;
		this.personalIdentificationNumber = personalIdentificationNumber;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Long getPersonalIdentificationNumber() {
		return personalIdentificationNumber;
	}

	public void setPersonalIdentificationNumber(Long personalIdentificationNumber) {
		this.personalIdentificationNumber = personalIdentificationNumber;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", mobileNumber=" + mobileNumber + ", password=" + password + ", nationality=" + nationality
				+ ", passportNumber=" + passportNumber + ", permanentAddress=" + permanentAddress + ", officeAddress="
				+ officeAddress + ", personalIdentificationNumber=" + personalIdentificationNumber + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailId, firstName, lastName, mobileNumber, nationality, officeAddress, passportNumber,
				password, permanentAddress, personalIdentificationNumber, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEntity other = (UserEntity) obj;
		return Objects.equals(emailId, other.emailId) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(mobileNumber, other.mobileNumber)
				&& Objects.equals(nationality, other.nationality) && Objects.equals(officeAddress, other.officeAddress)
				&& Objects.equals(passportNumber, other.passportNumber) && Objects.equals(password, other.password)
				&& Objects.equals(permanentAddress, other.permanentAddress)
				&& Objects.equals(personalIdentificationNumber, other.personalIdentificationNumber)
				&& Objects.equals(userId, other.userId);
	}

}
