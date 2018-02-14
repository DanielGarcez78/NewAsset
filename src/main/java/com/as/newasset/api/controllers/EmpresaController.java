package com.as.newasset.api.controllers;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.as.newasset.api.dtos.EmpresaDTO;
import com.as.newasset.api.responses.Response;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

	@PostMapping
	public ResponseEntity<Response<EmpresaDTO>> cadastrar(@Valid @RequestBody EmpresaDTO empresaDTO, BindingResult bindingResult) {
		
	    Response<EmpresaDTO> response = new 	Response<EmpresaDTO>();

	    if (bindingResult.hasErrors()) {
	    		bindingResult.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
	    		return ResponseEntity.badRequest().body(response);
	    }
	    
		empresaDTO.setEmpresaID(1L);		
		response.setData(empresaDTO);
		
		return ResponseEntity.ok(response);
	}
	
}
