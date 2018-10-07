/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk.diary;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author malang
 */
public class LogIIInController implements Initializable {

    @FXML
    private AnchorPane latar3;
    @FXML
    private AnchorPane latar2;
    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField pass;
    @FXML
    private JFXButton login;
    @FXML
    private ImageView gambar1;
    @FXML
    private ImageView gambar2;
    @FXML
    private ImageView gambar3;
    @FXML
    private ImageView gambar4;
    @FXML
    private Separator garis;
    @FXML
    private Label label;
   String name, password;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void name(ActionEvent event) {
    }


    @FXML
    private void log(ActionEvent event) {
        name=username.getText();
        password=pass.getText();
        
        
    }

    @FXML
    private void password(ActionEvent event) {
    }
    
}
