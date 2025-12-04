package com.ftr.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftr.DTO.WorkItemDTO;
import com.ftr.Entity.WorkItemEntity;
import com.ftr.Exception.FtrException;
import com.ftr.Repository.TerminalRepository;
import com.ftr.Repository.WorkItemRepository;

@Service
public class WorkItemServiceImpl implements WorkItemService{
	
	@Autowired
	private WorkItemRepository workItemRepository;
	
	@Autowired
	private TerminalRepository terminalRepository;

	@Override
	public String addWorkItem(WorkItemDTO workItemDTO) throws FtrException{
		WorkItemEntity workItemEntity = new WorkItemEntity();
		workItemEntity.setAmount(workItemDTO.getAmount());
		workItemEntity.setCollectionCountry(workItemDTO.getCollectionCountry());
		workItemEntity.setDestinationCountry(workItemDTO.getDestinationCountry());
		workItemEntity.setItemDescription(workItemDTO.getItemDescription());
		workItemEntity.setItemName(workItemDTO.getItemName());
		workItemEntity.setItemType(workItemDTO.getItemType());
		workItemEntity.setMessageToRecipient(workItemDTO.getMessageToRecipient());
		workItemEntity.setOriginHarborLocation(workItemDTO.getOriginHarborLocation());
		workItemEntity.setQuantity(workItemDTO.getQuantity());
		workItemEntity.setSelectedHarborLocation(workItemDTO.getSelectedHarborLocation());
		workItemEntity.setShippingDate(workItemDTO.getShippingDate());
		workItemEntity.setUserId(workItemDTO.getUserId());
		workItemEntity.setWorkItemId(workItemDTO.getWorkItemId());
		workItemRepository.save(workItemEntity);
		
		return "Your work item is added Successfully";
	}

	@Override
	public String updateWorkItem(String workItemId, WorkItemDTO workItemDTO) throws FtrException{
		Optional<WorkItemEntity> workItemEntityOptional = workItemRepository.findById(workItemId);
		WorkItemEntity workItemEntity = workItemEntityOptional.orElseThrow();
		workItemEntity.setAmount(workItemDTO.getAmount());
		workItemRepository.save(workItemEntity);
		return "Your work item has been updated Successfully";
	}

	@Override
	public WorkItemDTO getWorkItem(String workItemId) throws FtrException{
		Optional<WorkItemEntity> workItemEntityOptional = workItemRepository.findById(workItemId);
		WorkItemDTO workItemDTO = new WorkItemDTO();
		workItemDTO.setAmount(workItemEntityOptional.get().getAmount());
		workItemDTO.setCollectionCountry(workItemEntityOptional.get().getCollectionCountry());
		workItemDTO.setDestinationCountry(workItemEntityOptional.get().getDestinationCountry());
		workItemDTO.setItemDescription(workItemEntityOptional.get().getItemDescription());
		workItemDTO.setItemName(workItemEntityOptional.get().getItemName());
		workItemDTO.setItemType(workItemEntityOptional.get().getItemType());
		workItemDTO.setMessageToRecipient(workItemEntityOptional.get().getMessageToRecipient());
		workItemDTO.setOriginHarborLocation(workItemEntityOptional.get().getOriginHarborLocation());
		workItemDTO.setQuantity(workItemEntityOptional.get().getQuantity());
		workItemDTO.setSelectedHarborLocation(workItemEntityOptional.get().getSelectedHarborLocation());
		workItemDTO.setShippingDate(workItemEntityOptional.get().getShippingDate());
		workItemDTO.setUserId(workItemEntityOptional.get().getUserId());
		workItemDTO.setWorkItemId(workItemEntityOptional.get().getWorkItemId());
		return workItemDTO;
	}

	@Override
	public List<String> getAvailableHarborLocations(String country) throws FtrException{
		return terminalRepository.getAvailableHarborLocations(country);
	}

}
