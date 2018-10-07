/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apk.diary;

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
 *
 * @author malang
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private AnchorPane lembar;
    @FXML
    private Text judul;
    @FXML
    private Separator garis;
    @FXML
    private Label hari;
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
    @FXML
    void end(ActionEvent event) {

    }

    @FXML
    void isiN(ActionEvent event) {

    }

    @FXML
    void isiT(ActionEvent event) {

    }
    
    @FXML
    void ket1(ActionEvent event) {
  ket.setText("Catatan Diary anda telat disimpan");
    }

    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
       info.setText("Catatan Diary telah disimpan");         
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
