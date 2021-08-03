package com.example.KesavanDemo.Services.Repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("additionRepository")
public class AdditionRepository  {

	@Value("${number}")
	private Integer value;
	
	public Integer getValueFromProperty() {
		if(value == null){
			value = 0;
		}
		return value;
	}
}