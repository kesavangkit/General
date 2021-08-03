package com.example.KesavanDemo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KesavanDemo.Services.Repository.AdditionRepository;

@Service("additionServices")
public class AdditionServices implements IAdditionServices {

	@Autowired
	private AdditionRepository additionRepository;
	
	@Override
	public Integer addNumber(Integer value) {
		return value+additionRepository.getValueFromProperty();
	}
}