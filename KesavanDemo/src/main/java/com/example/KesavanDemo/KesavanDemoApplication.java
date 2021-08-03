package com.example.KesavanDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.KesavanDemo.Controller.IAdditionContoller;

/**
 * @author Kesavan
 *
 */
@SpringBootApplication
public class KesavanDemoApplication {

	private static String ARTS_COLLEGE = "artsCollege";
	private static String ENGINEERING_COLLEGE = "engineeringCollege";
	private static String DEPARTMENT = "department";
	private static String CONTROLLER = "additionController";
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(KesavanDemoApplication.class, args);
		
		IAdditionContoller additionContoller = (IAdditionContoller)applicationContext.getBean(CONTROLLER);
		System.out.println("After Adding: "+additionContoller.add(15));
		
		/*ICollege college = (ICollege)applicationContext.getBean(ARTS_COLLEGE);
		college.load();
		
		college = (ICollege)applicationContext.getBean(ENGINEERING_COLLEGE);
		college.load();
		
		ArtsCollege artsCollege = (ArtsCollege)applicationContext.getBean(ARTS_COLLEGE);
		artsCollege.load();
		
		EngineeringCollege engeeringCollege = (EngineeringCollege)applicationContext.getBean(ENGINEERING_COLLEGE);
		engeeringCollege.load();
		
		Department department = (Department)applicationContext.getBean(DEPARTMENT);
		department.load();*/
	}
}