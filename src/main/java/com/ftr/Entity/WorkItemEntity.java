package com.ftr.Entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "WorkItem")
public class WorkItemEntity {
	
	@Id
	private String workItemId;
	private String itemName;
	private String itemType;
	private String itemDescription;
	private String messageToRecipient;
	private String quantity;
	private String collectionCountry;
	private String destinationCountry;
	private String originHarborLocation;
	private String selectedHarborLocation;
	private LocalDate shippingDate;
	private Integer amount;
	private Long userId;
	
	public WorkItemEntity() {
		
	}

	public WorkItemEntity(String workItemId, String itemName, String itemType, String itemDescription,
			String messageToRecipient, String quantity, String collectionCountry, String destinationCountry,
			String originHarborLocation, String selectedHarborLocation, LocalDate shippingDate, Integer amount,
			Long userId) {
		super();
		this.workItemId = workItemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemDescription = itemDescription;
		this.messageToRecipient = messageToRecipient;
		this.quantity = quantity;
		this.collectionCountry = collectionCountry;
		this.destinationCountry = destinationCountry;
		this.originHarborLocation = originHarborLocation;
		this.selectedHarborLocation = selectedHarborLocation;
		this.shippingDate = shippingDate;
		this.amount = amount;
		this.userId = userId;
	}

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

	@Override
	public String toString() {
		return "WorkItemEntity [workItemId=" + workItemId + ", itemName=" + itemName + ", itemType=" + itemType
				+ ", itemDescription=" + itemDescription + ", messageToRecipient=" + messageToRecipient + ", quantity="
				+ quantity + ", collectionCountry=" + collectionCountry + ", destinationCountry=" + destinationCountry
				+ ", originHarborLocation=" + originHarborLocation + ", selectedHarborLocations="
				+ selectedHarborLocation + ", shippingDate=" + shippingDate + ", amount=" + amount + ", userId="
				+ userId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, collectionCountry, destinationCountry, itemDescription, itemName, itemType,
				messageToRecipient, originHarborLocation, quantity, selectedHarborLocation, shippingDate, userId,
				workItemId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WorkItemEntity other = (WorkItemEntity) obj;
		return Objects.equals(amount, other.amount) && Objects.equals(collectionCountry, other.collectionCountry)
				&& Objects.equals(destinationCountry, other.destinationCountry)
				&& Objects.equals(itemDescription, other.itemDescription) && Objects.equals(itemName, other.itemName)
				&& Objects.equals(itemType, other.itemType)
				&& Objects.equals(messageToRecipient, other.messageToRecipient)
				&& Objects.equals(originHarborLocation, other.originHarborLocation)
				&& Objects.equals(quantity, other.quantity)
				&& Objects.equals(selectedHarborLocation, other.selectedHarborLocation)
				&& Objects.equals(shippingDate, other.shippingDate) && Objects.equals(userId, other.userId)
				&& Objects.equals(workItemId, other.workItemId);
	}

}
