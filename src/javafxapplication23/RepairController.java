/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication23;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author user
 */
public class RepairController implements Initializable {

    @FXML
    private Button A;
    @FXML
    private Button D;
    @FXML
    private Button O;
    @FXML
    private Button B;
    @FXML
    private Button E;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
       if (event.getSource()==B){
         try {
             FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));
             Parent root1 = (Parent) fxmlLoader.load();
             Stage stage = new Stage();
             stage.initModality(Modality.APPLICATION_MODAL);
             stage.initStyle(StageStyle.UNDECORATED);
             stage.setTitle("ABC");
             stage.setScene(new Scene(root1));
             stage.show();
         } catch (IOException ex) {
             Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }     
if (event.getSource()==E){
        
                         Platform.exit();
        
        
    }  
    }
    
}
