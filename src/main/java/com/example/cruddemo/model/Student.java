package com.example.cruddemo.model;

import jakarta.persistence.Entity; //JPA
import jakarta.persistence.Id; // JPA
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//ORM - 
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
	@Id
	int id;
	String name;
}
