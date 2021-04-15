package com.sample.doctor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Doctor")
public class Doctor {

    @Id
    private int id;
    private String name;
    private String specialization;
    
    
}