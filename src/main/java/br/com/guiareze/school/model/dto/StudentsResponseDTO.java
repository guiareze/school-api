package br.com.guiareze.school.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentsResponseDTO {
	
	private String responseCode;
	private String responseDescription;

}
