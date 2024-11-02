package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;
@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorService docserv;
	
	@Override
	public void run(String... args) throws Exception {
		Doctor d1=new Doctor("karthik","Dermatologist",600000.0);
		Doctor d2=new Doctor("gopi","Orthopedic Surgeon",900000.0);
		Doctor d3=new Doctor("raju","Pediatrician",700000.0);
		List<Doctor> list=List.of(d1,d2,d3);
		String msg=docserv.registerDoctorbatch(list);
		System.out.println(msg);
		

	}

}
