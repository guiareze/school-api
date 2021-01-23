package br.com.guiareze.school.service;

import br.com.guiareze.school.model.dto.StudentsRequestDTO;
import br.com.guiareze.school.model.dto.StudentsResponseDTO;

public interface StudentsService {
	
	 StudentsResponseDTO create(StudentsRequestDTO studentsRequestDTO);

}
