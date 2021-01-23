package br.com.guiareze.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guiareze.school.model.dto.StudentsRequestDTO;
import br.com.guiareze.school.model.dto.StudentsResponseDTO;
import br.com.guiareze.school.service.StudentsService;

@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	private StudentsService studentsService;
	
	@PostMapping
	public StudentsResponseDTO create(@RequestBody StudentsRequestDTO studentsRequestDTO) {
		return studentsService.create(studentsRequestDTO);
	}

}
