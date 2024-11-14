/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author yiado
 */
public class Patient {
    private int id; //primary key in database
    private String name;
    private String gender;
    private String patientType;
    private ImageIcon profilePicture;
    
    //method - public

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName(){
    return name;
    }
    
    public void setName(String name){
    this.name = name;
    }
    
     public String getGender(){
    return gender;
    }
     
      public void setGender(String gender){
    this.gender = gender;
    }
      
      public String getPatientType(){
        return patientType;
    }
     
      public void setPatientType(String patientType){
        this.patientType = patientType;
    }
        
            
    
}
