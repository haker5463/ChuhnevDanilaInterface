/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication23;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class JavaFXApplication23 extends Application {
//  private static final  String url = "jdbc:mysql://localhost:3306/Tayota";
//    private static  String user = "root";
//    private static final String password = "pi159357";
//
//    // JDBC variables for opening and managing connection
//    private static Connection con;
//    private static Statement stmt;
//    static ResultSet rs;   
//    
   @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Log.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        
    }
//       @Override
//    public void stop(){
//        //close connection ,stmt and resultset here
//         try { con.close(); } catch(SQLException se) { /*can't do anything */ }
//         try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
//         try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
//    }
public static void main(String[] args) {
        launch(args);
    }
    
}
