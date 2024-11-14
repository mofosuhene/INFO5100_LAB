/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.ArrayList;
import model.Patient;

/**
 *
 * @author yiado
 */
public class DatabaseConnector {
    //data members
    private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?useSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "my-secret-pw";
    
    // CRUD Operations on Database
    
    // C - Create: Inserting data into the database
    public static void addPatient(Patient p1) throws SQLException{
        String query = "INSERT INTO patient(name, gender, patient_type VALUE (?,?,?)";
        try{
        //create a connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement stmt= conn.prepareStatement(query);
            stmt.setString(1, p1.getName());
            stmt.setString(2, p1.getGender());
            stmt.setString(3, p1.getPatientType());
            int rows = stmt.executeUpdate();
            System.out.println("Rows Inserted: "+rows);
            // Query will look like this after:
            //"INSERT INTO patient(name, gender, patient_type VALUE (Marcia,Female,Appointment)" 
            
            conn.close();
        } catch(SQLException sqle){
          System.out.println("SQL Exception occured");
          System.out.println(sqle);
        } catch(Exception ex){
            System.out.println(ex);
        }
            
     }
            
    // R - Read: Getting all the values from the datatbase
    public static ArrayList<Patient> getPatient(){
        ArrayList <Patient> patients = new ArrayList();
    String query = "SELECT * FROM patient";
       try{
        Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){
        Patient p1 = new Patient();
        p1.setId(rs.getInt("id"));
        p1.setName(rs.getString("name"));
        p1.setGender(rs.getString("gender"));
        p1.setPatientType(rs.getString("patientType"));
        patients.add(p1);
        }
        rs.close();
        conn.close();
        }catch(SQLException sqle){
          System.out.println("SQL Exception occured");
          System.out.println(sqle);
        } catch(Exception ex){
            System.out.println(ex);
        }
       return patients;
     }
    // U - Update: Changing a value in the database    // U - Update: Changing a value in the database
    public static void updatePatient(Patient oldPatient,Patient updatedPatient){
    String query = "UPDATE patient SET name= ?, gende= ?,patientType= ? WHERE id= ? ";
    try{
        Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        PreparedStatement stmt= conn.prepareStatement(query);
        stmt.setInt(1, oldPatient.getId());
        stmt.setString(2, updatedPatient.getName());
        stmt.setString(3, updatedPatient.getGender());
        stmt.setString(4, updatedPatient.getPatientType());
        int rows = stmt.executeUpdate();
        System.out.println("Rows Deleted: "+rows);
        conn.close();
       }catch(SQLException sqle){
          System.out.println("SQL Exception occured");
          System.out.println(sqle);
        } catch(Exception ex){
            System.out.println(ex);
        }
    }
    // D - Delete
    public static void deletePatient(Patient p1) {
    String query ="DELETE FROM patient WHERE id= ?";
    try{
        Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        PreparedStatement stmt= conn.prepareStatement(query);
        stmt.setInt(1, p1.getId());
        int rows = stmt.executeUpdate();
        System.out.println("Rows Deleted: "+rows);
        conn.close();
       } catch(SQLException sqle){
          System.out.println("SQL Exception occured");
          System.out.println(sqle);
        } catch(Exception ex){
            System.out.println(ex);
        }
}
}
