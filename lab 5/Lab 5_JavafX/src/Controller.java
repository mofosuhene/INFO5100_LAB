
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yiado
 */
public class Controller {
    @FXML
    TextField nameTextField;
    TextField ageTextField;
    TextField emailTextField;
     
    public void submit(ActionEvent event){
    System.out.println("Submitted");
    
    try
    {
    String name = nameTextField.getText();
    String age = ageTextField.getText();
    String email = emailTextField.getText();
   
    
    System.out.println(this.nameTextField.getText());
    System.out.println(this.ageTextField.getText());
    System.out.println(this.emailTextField.getText());
    
    }
    catch(NullPointerException ne){
            String errorMessage = ("You must enter values in Name, Age & Email");

        }
        catch(Exception e){
            System.out.println("Exception has occured");
        }
    
    //create  popup alert
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setTitle("Submitted!");
    alert.setHeaderText("Thank you");
    alert.setContentText("Submitted Details: Name: :+name Age: :+age Email: :+email");
    alert.showAndWait();
    
    
    }
}
