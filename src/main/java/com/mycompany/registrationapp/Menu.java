/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.registrationapp;

import java.awt.Event;
import java.util.ArrayList;

/**
 *
 * @author jooan
 */
public class Menu extends javax.swing.JFrame {
    
    public ArrayList <Student> students;
    
    /**
     * Creates new form Menu
     */
    public Menu(ArrayList <Student> students) {
        initComponents();
        this.students=students;
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtnAddStudent = new javax.swing.JButton();
        jBtnShowStudents = new javax.swing.JButton();
        jBtnDeleteStudent = new javax.swing.JButton();
        jBtnShowStudentByDNI = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("STUDENT REGISTRATION APP");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Choose an option:");

        jLabel3.setText("By : Joan Marc Martínez Motis");

        jBtnAddStudent.setText("Add Student");
        jBtnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddStudentActionPerformed(evt);
            }
        });

        jBtnShowStudents.setText("Show All Students");
        jBtnShowStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnShowStudentsActionPerformed(evt);
            }
        });

        jBtnDeleteStudent.setText("Delete Student");
        jBtnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteStudentActionPerformed(evt);
            }
        });

        jBtnShowStudentByDNI.setText("Show Student by DNI");
        jBtnShowStudentByDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnShowStudentByDNIActionPerformed(evt);
            }
        });

        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnDeleteStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnShowStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBtnShowStudentByDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAddStudent)
                    .addComponent(jBtnShowStudents))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnDeleteStudent)
                    .addComponent(jBtnShowStudentByDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnExit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Sends to AddStudent frame
    private void jBtnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddStudentActionPerformed
     
      AddStudent addStudent = new AddStudent (students);
        
      addStudent.setVisible(true);
     
      this.setVisible(false);
    }//GEN-LAST:event_jBtnAddStudentActionPerformed

//Sends to ShowAllStudents frame
    private void jBtnShowStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnShowStudentsActionPerformed
      ShowStudents showStudents = new ShowStudents(students);
        
      showStudents.setVisible(true);
     
      this.setVisible(false);
    }//GEN-LAST:event_jBtnShowStudentsActionPerformed

//Sends to DeleteStudent frame
    private void jBtnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteStudentActionPerformed
      DeleteStudent deleteStudent = new DeleteStudent(students);
        
      deleteStudent.setVisible(true);
     
      this.setVisible(false);
    }//GEN-LAST:event_jBtnDeleteStudentActionPerformed

//Sends to ShowStudentByDNI frame
    private void jBtnShowStudentByDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnShowStudentByDNIActionPerformed
      ShowStudentByDNI showStudentByDni = new ShowStudentByDNI (students);
        
      showStudentByDni.setVisible(true);
     
      this.setVisible(false);
    }//GEN-LAST:event_jBtnShowStudentByDNIActionPerformed

//Exits the program
    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnExitActionPerformed

    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAddStudent;
    private javax.swing.JButton jBtnDeleteStudent;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnShowStudentByDNI;
    private javax.swing.JButton jBtnShowStudents;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
