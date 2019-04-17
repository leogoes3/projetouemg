package Controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class FXMLMenuCadastrosController {

    @FXML
    private JFXButton cadclientes;

    @FXML
    private JFXButton cadcolaboradores;

    @FXML
    private JFXButton cadproduto;

    @FXML
    private JFXButton cadtipo;

     @FXML
    private Pane pnlcadastros;
    
    @FXML
    void CadastroClientes(ActionEvent event) throws IOException {
       
        
        Pane pnl = FXMLLoader.load(getClass().getResource("/View/FXMLMenuConsultas.fxml"));
      pnlcadastros.getChildren().clear();
        pnlcadastros.getChildren().addAll(pnl);
        
        
    }
    
        
    
}
