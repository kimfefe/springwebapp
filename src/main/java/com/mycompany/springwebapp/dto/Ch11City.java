package com.mycompany.springwebapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor //기본 생성자도 생성
public class Ch11City {
	private int code;
	private String label;
}
