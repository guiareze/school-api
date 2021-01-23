package br.com.guiareze.school.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document
public class Students {
	
	@Id
	private String id;
	private String name;
	private Integer age;
	private Date birthdayDate;

}
