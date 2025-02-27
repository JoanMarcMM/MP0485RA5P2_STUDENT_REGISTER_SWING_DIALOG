/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationapp;

/**
 *
 * @author jooan
 */
public class Student {
    
    //Attributes
    
    private String name;
    private String lastname;
    private int age;
    private String schoolYear;
    private String dni;
    
    //Constructor

    public Student(String name, String lastname, int age, String schoolYear, String dni) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.schoolYear = schoolYear;
        this.dni = dni;
    }
    
    //Getters Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //toSting used to write data in file.
    //toString2 used to print data to show in terminal.
    
    @Override
    public String toString() {
        return name+","+lastname+","+age+","+schoolYear+","+dni; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public String toString2() {
        return"Name:"+name+"\nLastname:"+lastname+"\nAge:"+age+"\nSchoolYear:"+schoolYear+"\nDNI:"+dni+";"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
    
    
    
}
