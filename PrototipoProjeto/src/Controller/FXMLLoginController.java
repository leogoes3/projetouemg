package Controller;

import Controller.FXMLPrincipalController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import sun.security.krb5.internal.ktab.KeyTabConstants;

public class FXMLLoginController {

    @FXML
    private JFXTextField txtlogin;

    @FXML
    private JFXPasswordField txtsenha;

    @FXML
    private JFXButton btncancelar;

    @FXML
    private JFXButton btnentrar;



  
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
    
    public void logar() throws IOException{
        
        if (txtlogin.getText().equals("admin")&& txtsenha.getText().equals("admin")){
           
           
            interativo i = new interativo();
            i.setCod(1);
            
             
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Usuario autenticado");
            alert.setContentText("voce logou com sucesso");
            alert.setHeaderText("parabens");
            alert.showAndWait();
             
            Parent root = FXMLLoader.load(getClass().getResource("/View/FXMLPrincipal.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add("Style/style.css");
            Stage stage = new Stage();           
            stage.setScene(scene); 
            stage.show();
           
        }
            
            
            
        
        else{
            
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Falha de autenticação");
            alert.setHeaderText("USUÁRIO OU SENHA INVÁLIDOS");
            alert.showAndWait();
            
        }
           
        
        
        
    }
    
    
}
