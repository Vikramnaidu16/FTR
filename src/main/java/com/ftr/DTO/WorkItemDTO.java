package com.ftr.DTO;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

public class WorkItemDTO {
	
	private String workItemId;
	
	@NotNull(message = "Workitem name should be present, please check")
	private String itemName;
	
	@NotNull(message = "Workitem type should be present, please check")
	private String itemType;
	
	@NotNull(message = "Workitem description should be present, please check")
	private String itemDescription;
	
	@NotNull(message = "Message to recipient should be present, please check")
	private String messageToRecipient;
	
	@NotNull(message = "Workitem quantity should be present, please check")
	private String quantity;
	
	@NotNull(message = "Source country should be present, please check")
	private String collectionCountry;
	
	@NotNull(message = "Destination country should be present, please check")
	private String destinationCountry;
	
	@NotNull(message = "Origin Harbor location should be present, please check")
	private String originHarborLocation;
	
	@NotNull(message = "Selected Harbor location should be present, please check")
	private String selectedHarborLocation;
	
	@NotNull(message = "Shipping data should be present, please check")
	private LocalDate shippingDate;
	
	@NotNull(message = "Amount should be present, please check")
	private Integer amount;
	
	@NotNull(message = "User id should be present, please check")
	private Long userId;
	
	
	public String getWorkItemId() {
		return workItemId;
	}
	public void setWorkItemId(String workItemId) {
		this.workItemId = workItemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getMessageToRecipient() {
		return messageToRecipient;
	}
	public void setMessageToRecipient(String messageToRecipient) {
		this.messageToRecipient = messageToRecipient;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getCollectionCountry() {
		return collectionCountry;
	}
	public void setCollectionCountry(String collectionCountry) {
		this.collectionCountry = collectionCountry;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public String getOriginHarborLocation() {
		return originHarborLocation;
	}
	public void setOriginHarborLocation(String originHarborLocation) {
		this.originHarborLocation = originHarborLocation;
	}
	public String getSelectedHarborLocation() {
		return selectedHarborLocation;
	}
	public void setSelectedHarborLocation(String selectedHarborLocation) {
		this.selectedHarborLocation = selectedHarborLocation;
	}
	public LocalDate getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(LocalDate shippingDate) {
		this.shippingDate = shippingDate;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
