package br.com.guiareze.school.model.dto;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document
public class StudentsResponseDTO {
	
	private String responseCode;
	private String responseDescription;


}
