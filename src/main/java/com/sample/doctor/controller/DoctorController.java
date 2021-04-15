package com.sample.doctor.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.doctor.model.Doctor;
import com.sample.doctor.repository.DoctorRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value= "/api/mongo/doctor")
public class DoctorController {

	
	@Autowired
	DoctorRepository repository;
	
	@PostMapping("/addDoctor")
	public String saveDoctor (@RequestBody Doctor doctor) {
		repository.save(doctor);
		return "Added Doctor";
	}
	
	@GetMapping("/findAllDoctors")
	public List<Doctor> getDoctors(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllDoctor/{id}")
	public Optional<Doctor> getDoctor(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("deleteDoctot/{id}")
	public String deleteDoctor(@PathVariable int id) {
		repository.deleteById(id);
		return "Doctor Deleted";
	}
	
    
}
