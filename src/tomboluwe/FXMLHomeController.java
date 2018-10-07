/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tomboluwe;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author malang
 */
public class FXMLHomeController implements Initializable {

    @FXML
    private AnchorPane latar;
    @FXML
    private Separator garis;
    @FXML
    private Text judul;
    @FXML
    private AnchorPane latar2;
    @FXML
    private JFXTextField isiNama;
    @FXML
    private Label nama;
    @FXML
    private Label tanggal;
    @FXML
    private JFXTextField isiTanggal;
    @FXML
    private JFXTextArea catatan;
    @FXML
    private JFXButton selesai;
    @FXML
    private JFXTextArea info;
    @FXML
    private JFXTextField ket;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void isiN(ActionEvent event) {
    }

    @FXML
    private void isiT(ActionEvent event) {
    }

    @FXML
    private void end(ActionEvent event) {
    }

    @FXML
    private void ket1(ActionEvent event) {
        
    }
    
}
