package com.nt.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;
@Service("doctorservice")
public class IDoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepository docrepo;

	@Override
	public String registerDoctorbatch(List<Doctor> list) {
		Iterable<Doctor> saveList=docrepo.saveAll(list);
		List<Integer> ids=StreamSupport.stream(saveList.spliterator(),false).map(Doctor::getDid).collect(Collectors.toList());
		return ids.size()+" no.od doctores are registers having id values: "+ids;
	}
	

}
