package br.com.guiareze.school.model.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentsRequestDTO {
	
	private String id;
	private String name;
	private Integer age;
	private Date birthdayDate;

}
