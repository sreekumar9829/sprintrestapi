package com.demo.Springboot_CURD_REST.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name="employees")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
    @Column(name = "first_name",nullable = false)
     private String first_Name;
    @Column(name = "last_name")
     private String last_Name;
    @Column(name = "email")
     private  String email;


}
