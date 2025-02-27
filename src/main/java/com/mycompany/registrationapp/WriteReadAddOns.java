/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationapp;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jooan
 */
public class WriteReadAddOns {
    
    //I declare these two variables as static to access them throught the class32
    //Take the rout of the folder of this project.
    static String folderDirectory = System.getProperty("user.dir");

    //Take the separator used in this O.S.
    static String separator = File.separator;
    
    public static void start(ArrayList<Student> students){
        //Create folder
        createFolder(folderDirectory, separator, "Files");

        //Update the folderDirectory to aim into the folder.
        folderDirectory = folderDirectory + separator + "Files";

        //Create file register
        createTextFile(folderDirectory, separator, "register");

        readFile(students);
    }
    
    
    //Creates file returns file
    public static File createTextFile(String folderDirectory, String separator, String name){
        
        boolean valid=false;
        
        File file = new File (folderDirectory+separator+name+".txt");
        
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(WriteReadAddOns.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            
        }
        return file;
    }
    
    //Creates a folder, returns false if folder alrady exists.
    public static boolean createFolder(String folderDirectory, String separator, String name){
        
        boolean valid = false;
        
        File file = new File (folderDirectory+separator+name);
        
        if(!file.exists()){
            file.mkdir();
            valid=true;
        }else{
            valid=false;
        }
        
        return valid;
    }
    

    
    public static void readFile(ArrayList <Student> students) {

        students.clear();

        String line = "";

        //Use buffered reader to read lines inside file.
        //If buffered reader returns null then stops reading.
        File file = WriteReadAddOns.createTextFile(folderDirectory, separator, "register");

        FileReader fr;
        try {
            fr = new FileReader(file);

            BufferedReader bf = new BufferedReader(fr);

            try {
                line = bf.readLine();
            } catch (IOException ex) {
                Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            while(line!=null){

            //The string returned is split and then used to create student.
            //Same student is thena dded in arrayList.
            String[] data = line.split(",");

            Student student = new Student(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]);

            students.add(student);
            
            try {
                line = bf.readLine();
            } catch (IOException ex) {
                Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } 
        }catch (FileNotFoundException ex) {
            Logger.getLogger(StudentRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void writeFile(ArrayList <Student> students) {
        

        
        //.toString each student and saves info in string, then this string sent to be written in file.
        String data = "";

        for (Student a : students) {

            data = data + a.toString() + "\n";
        }

        try {
            
            File file = new File (folderDirectory+separator+"register.txt");
                        
             if(file.exists()){
             
                FileWriter fw = new FileWriter(file);

                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(data);

                bw.flush();

                bw.close();

                
        }
        
        } catch (IOException ex) {
            Logger.getLogger(WriteReadAddOns.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
