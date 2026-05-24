package com.nt.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.Data;

@Component
@Entity
@Data
public class Employee 
{
   private Integer id;
   private String Name;
   private String department;
   private double salary ;
}
