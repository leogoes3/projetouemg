/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Leonardo
 */
public class FXMLPrincipalController {

    @FXML
    private JFXButton mnicadastro;
    @FXML
    private JFXButton mniconsulta;
    @FXML
    private JFXButton mnirelatorio;
    @FXML
    private JFXButton mnisobre;
    @FXML
    private JFXButton mnisair;
    @FXML
    private Pane pnlmnu;
    
    @FXML
    private Pane pnltela;

    /**
     * Initializes the controller class.
     */
    

       public void sair(){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        ButtonType btnsim = new ButtonType ("Sim");
        ButtonType btnnao = new ButtonType ("Não");
        alert.setHeaderText("DESEJA MESMO SAIR?");
        alert.setContentText("Ao pressionar 'Sim' o programa será fechado.");
        alert.getButtonTypes().setAll(btnsim, btnnao);
        alert.showAndWait().ifPresent(b -> {
            
            if (b == btnsim){
                 Stage stage = (Stage) mnisair.getScene().getWindow();
                 stage.close(); 
                            }
                                            });
                        }     



    public void btnCadastros() throws IOException{
        
         Pane pnl = FXMLLoader.load(getClass().getResource("/View/FXMLMenuCadastros.fxml"));
       pnlmnu.getChildren().clear();
        pnlmnu.getChildren().addAll(pnl);
        
        
    }

  
    
    
    }
    
    
    

