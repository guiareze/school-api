package br.com.guiareze.school.model.dto;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document
public class StudentsRequestDTO {
	
	private String id;
	private String name;
	private Integer age;
	private Date birthdayDate;

}
