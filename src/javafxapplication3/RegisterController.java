/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nimbert
 */
public class RegisterController implements Initializable {

    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField course;
    @FXML
    private TextField school;
    @FXML
    private TextField ojt;
    @FXML
    private TextField number;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Label label_firstname;
    @FXML
    private Label label_lastname;
    @FXML
    private Label label_course;
    @FXML
    private Label label_school;
    @FXML
    private Label label_ojt;
    @FXML
    private Label label_number;
    @FXML
    private Label label_username;
    @FXML
    private Label label_password;
    @FXML
    private Label label_error;
    
            

@FXML
private void back_button(ActionEvent event)throws IOException{
    Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow(); //to close scene one at a time 
    Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     Scene scene = new Scene(root);
      stage.setScene(scene);
        stage.show();
}
@FXML
private void submit_Button(ActionEvent event)throws IOException{
  
    if(firstname.getText().equals(""))
    {
        label_firstname.setText("*");   
        label_error.setText("Complete the following information below.");
    }
  
    if(lastname.getText().equals(""))
    {
        label_lastname.setText("*");
        label_error.setText("Complete the following information below.");
    }
    if(course.getText().equals(""))
    {
        label_course.setText("*");   
        label_error.setText("Complete the following information below.");
    }
    if(school.getText().equals(""))
    {
        label_school.setText("*");   
        label_error.setText("Complete the following information below.");
    }
    if(ojt.getText().equals(""))
    {
        label_ojt.setText("*");   
        label_error.setText("Complete the following information below.");
    }
    if(number.getText().equals(""))
    {
        label_number.setText("*");   
        label_error.setText("Complete the following information below.");
    }
    if(username.getText().equals(""))
    {
        label_username.setText("*");   
        label_error.setText("Complete the following information below.");
    }
    if(password.getText().equals(""))
    {
        label_password.setText("*");   
        label_error.setText("Complete the following information below.");
    }
    else{
    Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow(); //close scene one at a time
    Parent root = FXMLLoader.load(getClass().getResource("reg_Success.fxml"));
     Scene scene = new Scene(root);
      stage.setScene(scene);
        stage.show();
            }  
    
}



















    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
