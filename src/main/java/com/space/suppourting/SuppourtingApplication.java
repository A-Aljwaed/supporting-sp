package com.space.suppourting;

import com.space.suppourting.etity.Student;
import com.space.suppourting.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication


public class SuppourtingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SuppourtingApplication.class, args);
	}

	// inject Studentrepo
	@Autowired
	private StudentRepo studentRepo;

     @Override
	public void run(String ...args)throws Exception{
//		Student s1 = new Student("ahmad a","rastatt","ahmad@mail.com");
//		Student s2 = new Student("waal b","karlsrue","waal@mail.com");

//		// save student into database
//		studentRepo.save(s1);
//		studentRepo.save(s2);
	}

}
