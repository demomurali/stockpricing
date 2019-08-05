package com.example.stockspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.stockspring.controller.CompanyController;
import com.example.stockspring.model.Company;

//@SpringBootApplication
public class StockspringApplication {

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(StockspringApplication.class, args);
		// beans are created
		System.out.println("before the container");
		Company company=new Company();
		company.setBoardOfDirectors("df");
		company.setCompanyId(1001);
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("after the container");
		CompanyController companyController=(CompanyController)applicationContext.getBean("companyControllerImpl");
		companyController.insertCompany(company);		
	}

}
