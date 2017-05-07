/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application.from;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author A
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField cellphoneField;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    boolean isValidId (String id){
        if(id.length() != 13)
            return false;
        for(int i = 0; i < id.length(); i++)
            if(id.charAt(i)< '0' || id.charAt(i)> '9')
                return false;
        return true;
    }
    boolean isValidCellPhoneNumber(String phone){
        if(phone.length() != 11)
        return false;
        
        if(phone.startsWith("011") ||
                phone.startsWith("015") ||
                phone.startsWith("016") ||
                phone.startsWith("017") ||
                phone.startsWith("018") ||
                phone.startsWith("019"));
        else return false;
        for(int i = 0; i < phone.length(); i++)
            if(!Character.isDigit(phone.charAt(i)))
                return false;
            return true;
    }
   

    @FXML
    private void handleSubmitAction(ActionEvent event) {
      String studentId = idField.getText().trim(); 
      if(isValidId(studentId))
          System.out.println("Student id is valid");
      else System.out.println("Student id is invalid");
          String studentName = nameField.getText();
         System.out.println("Name okay");
         String phone = cellphoneField.getText().trim();
         if(isValidCellPhoneNumber(phone))
             System.out.println("Phone number is valid");
         else System.out.println("phone number is not valid");
         String email = emailField.getText();
         System.out.println("Email is okay");
    }
    
}
