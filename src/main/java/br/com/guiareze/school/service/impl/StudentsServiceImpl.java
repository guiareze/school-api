package br.com.guiareze.school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.guiareze.school.model.Students;
import br.com.guiareze.school.model.dto.StudentsRequestDTO;
import br.com.guiareze.school.model.dto.StudentsResponseDTO;
import br.com.guiareze.school.repository.StudentsRepository;
import br.com.guiareze.school.service.StudentsService;

@Service
public class StudentsServiceImpl implements StudentsService {

	@Autowired
	private StudentsRepository studentsRepository;

	@Override
	public StudentsResponseDTO create(StudentsRequestDTO studentsRequestDTO) {
		try {
			Students student = Students.builder()
					                   .name(studentsRequestDTO.getName())
					                   .age(studentsRequestDTO.getAge())
									   .birthdayDate(studentsRequestDTO.getBirthdayDate()).build();
			studentsRepository.save(student);
			StudentsResponseDTO studentsResponseDTO = StudentsResponseDTO.builder()
																		 .responseCode("OK")
																		 .responseDescription("Inserido com sucesso")
																		 .build();
			return studentsResponseDTO;
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Erro ao inserir");
		}
	}

}
