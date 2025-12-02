package com.ftr.Service;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftr.DTO.TerminalDTO;
import com.ftr.Entity.TerminalEntity;
import com.ftr.Exception.FtrException;
import com.ftr.Repository.TerminalRepository;

@Service
public class TerminalServiceImpl implements TerminalService{
	
	private static final Logger LOGGER = LogManager.getLogger(TerminalServiceImpl.class);
	
	@Autowired
	private TerminalRepository terminalRepository;

	@Override
	public String addTerminal(TerminalDTO terminalDTO) throws FtrException{
		TerminalEntity terminalEntity = new TerminalEntity();
		terminalEntity.setAvailableCapacity(terminalDTO.getAvailableCapacity());
		terminalEntity.setCapacity(terminalDTO.getCapacity());
		terminalEntity.setCountry(terminalDTO.getCountry());
		terminalEntity.setHarborLocation(terminalDTO.getHarborLocation());
		terminalEntity.setItemType(terminalDTO.getItemType());
		terminalEntity.setStatus(terminalDTO.getStatus());
		terminalEntity.setTerminalDescription(terminalDTO.getTerminalDescription());
		terminalEntity.setTerminalId(terminalDTO.getTerminalId());
		terminalEntity.setTerminalName(terminalDTO.getTerminalName());
		terminalRepository.save(terminalEntity);
		return "New Terminal is added Successfully";
	}

	@Override
	public String updateTerminal(String terminalId, TerminalDTO terminalDTO) throws FtrException{
		LOGGER.info("In update Terminal method for terminalId: " + terminalId);
		Optional<TerminalEntity> terminalEntityOptional = terminalRepository.findById(terminalId);
		TerminalEntity terminalEntity = terminalEntityOptional.orElseThrow(() -> new FtrException("Service.TERMINAL_NOTFOUND"));
		terminalEntity.setCapacity(terminalDTO.getCapacity());
		if(!terminalDTO.getStatus().equals(null)) {
			terminalEntity.setStatus(terminalDTO.getStatus());
		}
		terminalRepository.save(terminalEntity);
		return "The terminal has been Successfully updated";
	}

	@Override
	public String deleteTerminal(String terminalId) throws FtrException{
		Optional<TerminalEntity> terminalEntityOptional = terminalRepository.findById(terminalId);
		if(!terminalEntityOptional.equals(null)) {
			terminalRepository.deleteById(terminalId);
		}else {
			throw new FtrException("Service.TERMINAL_NOTFOUND");
		}
		return "The terminal has been deleted";
	}

	@Override
	public TerminalDTO getTerminal(String terminalId) throws FtrException{
		Optional<TerminalEntity> terminalEntityOptional = terminalRepository.findById(terminalId);
		TerminalEntity terminalEntity = terminalEntityOptional.orElseThrow(() -> new FtrException("Service.TERMINAL_NOTFOUND"));
		TerminalDTO terminalDTO = new TerminalDTO();
		if(!terminalEntity.equals(null)) {
			terminalDTO.setAvailableCapacity(terminalEntityOptional.get().getAvailableCapacity());
			terminalDTO.setCapacity(terminalEntityOptional.get().getCapacity());
			terminalDTO.setCountry(terminalEntityOptional.get().getCountry());
			terminalDTO.setHarborLocation(terminalEntityOptional.get().getHarborLocation());
			terminalDTO.setItemType(terminalEntityOptional.get().getItemType());
			terminalDTO.setStatus(terminalEntityOptional.get().getStatus());
			terminalDTO.setTerminalDescription(terminalEntityOptional.get().getTerminalDescription());
			terminalDTO.setTerminalId(terminalEntityOptional.get().getTerminalId());
			terminalDTO.setTerminalName(terminalEntityOptional.get().getTerminalName());
		}
		return terminalDTO;
	}

	@Override
	public TerminalDTO getTerminalByType(String itemType) throws FtrException{
		TerminalEntity terminalEntity = terminalRepository.getByItemType(itemType);
		TerminalDTO terminalDTO = new TerminalDTO();
		if(terminalEntity.equals(null)) {
			throw new FtrException("There is no termianl with this itemtype");
		}else {
			
			terminalDTO.setAvailableCapacity(terminalEntity.getAvailableCapacity());
			terminalDTO.setCapacity(terminalEntity.getCapacity());
			terminalDTO.setCountry(terminalEntity.getCountry());
			terminalDTO.setHarborLocation(terminalEntity.getHarborLocation());
			terminalDTO.setItemType(terminalEntity.getItemType());
			terminalDTO.setStatus(terminalEntity.getStatus());
			terminalDTO.setTerminalDescription(terminalEntity.getTerminalDescription());
			terminalDTO.setTerminalId(terminalEntity.getTerminalId());
			terminalDTO.setTerminalName(terminalEntity.getTerminalName());
		}
		return terminalDTO;
	}

}
