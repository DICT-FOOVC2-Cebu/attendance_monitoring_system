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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Nimbert
 */
public class Logged_inController implements Initializable {

@FXML
private void Log_out(ActionEvent event)throws IOException{
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow(); 
    Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     Scene scene = new Scene(root);
      stage.setScene(scene);
        stage.show();
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
