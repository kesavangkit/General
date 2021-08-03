package com.example.KesavanDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.KesavanDemo.Services.IAdditionServices;

@Controller("additionController")
public class AdditionController implements IAdditionContoller
{

	@Autowired
	private IAdditionServices additionServices;
	
	@Override
	public Integer add(Integer value) {
		return additionServices.addNumber(value);
	}
}