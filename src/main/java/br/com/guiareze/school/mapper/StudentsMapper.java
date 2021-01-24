package br.com.guiareze.school.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.guiareze.school.model.Students;
import br.com.guiareze.school.model.dto.StudentsRequestDTO;

@Mapper(componentModel = "spring")
public interface StudentsMapper {

	StudentsMapper INSTANCE = Mappers.getMapper(StudentsMapper.class);

	Students studentsRequestDTOToStudents(StudentsRequestDTO studentsRequestDTO);

}
