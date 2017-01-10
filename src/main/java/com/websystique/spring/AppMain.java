package com.websystique.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.model.Employee;
import com.websystique.spring.service.EmployeeService;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		Employee em1 = new Employee();
		em1.setEmpId("3");
		em1.setEmpName("Rahul");
		em1.setEmpSalary(80000);
		em1.setDesigination("Civil Engineer");

		Employee em = new Employee();
		em.setEmpId("2");
		em.setEmpName("Ravan");
		em.setEmpSalary(90000);
		em.setDesigination("SI");

		service.saveEmployee(em1);
		service.saveEmployee(em);

		List<Employee> employees = service.findAllEmployees();
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		context.close();
	}
}
