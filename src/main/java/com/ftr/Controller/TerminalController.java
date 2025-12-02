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

import com.ftr.DTO.TerminalDTO;
import com.ftr.Exception.FtrException;
import com.ftr.Service.TerminalService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/ftrterminal")
public class TerminalController {
	
	@Autowired
	private TerminalService terminalService;
	
	@PostMapping(value = "/addterminal")
	public ResponseEntity<String> addTerminal(@RequestBody @Valid TerminalDTO terminalDTO) throws FtrException{
		String success = terminalService.addTerminal(terminalDTO);
		return new ResponseEntity<>(success, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/updateterminal/{terminalId}")
	public ResponseEntity<String> updateTerminal(@PathVariable String terminalId, @RequestBody TerminalDTO terminalDTO) throws FtrException{
		String success = terminalService.updateTerminal(terminalId, terminalDTO);
		return new ResponseEntity<>(success, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(value = "/deleteterminal/{terminalId}")
	public ResponseEntity<String> deleteTerminal(@PathVariable String terminalId) throws FtrException{
		String success = terminalService.deleteTerminal(terminalId);
		return new ResponseEntity<>(success, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getterminal/{terminalId}")
	public ResponseEntity<TerminalDTO> getTerminal(@PathVariable String terminalId) throws FtrException{
		TerminalDTO terminalDTO = terminalService.getTerminal(terminalId);
		return new ResponseEntity<>(terminalDTO, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getterminalbyitem/{itemType}")
	public ResponseEntity<TerminalDTO> getTerminalByType(@PathVariable String itemType) throws FtrException{
		TerminalDTO terminalDTO = terminalService.getTerminalByType(itemType);
		return new ResponseEntity<>(terminalDTO, HttpStatus.OK);
	}

}
