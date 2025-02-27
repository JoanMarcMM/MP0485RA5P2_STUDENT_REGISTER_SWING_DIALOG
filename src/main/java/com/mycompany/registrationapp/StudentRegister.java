/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.registrationapp;

import java.util.ArrayList;

/**
 *
 * @author jooan
 */
public class StudentRegister {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        WriteReadAddOns.start(students);

        Menu menu = new Menu(students);
        menu.setVisible(true);

    }
}
