package com.example.KesavanDemo.College;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Kesavan
 *
 */
@Component("artsCollege")
public class ArtsCollege implements ICollege{

	@Autowired
	private Department department;
	
	/* (non-Javadoc)
	 * @see com.example.KesavanDemo.College.College#load()
	 */
	@Override
	public void load() {
		System.out.print("Arts College >");
		department.load();
	}
}