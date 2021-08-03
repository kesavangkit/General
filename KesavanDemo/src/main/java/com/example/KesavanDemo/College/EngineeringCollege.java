package com.example.KesavanDemo.College;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Kesavan
 *
 */
@Component("engineeringCollege")
public class EngineeringCollege implements ICollege {

	@Autowired
	Department department;
	
	/* (non-Javadoc)
	 * @see com.example.KesavanDemo.College.College#load()
	 */
	@Override
	public void load() {
		System.out.print("Engineering College >");
		department.load();
	}
}