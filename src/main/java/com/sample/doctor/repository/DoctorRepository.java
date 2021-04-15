package com.sample.doctor.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.sample.doctor.model.Doctor;

@Repository
public interface DoctorRepository extends MongoRepository <Doctor, Integer>  {

	

}