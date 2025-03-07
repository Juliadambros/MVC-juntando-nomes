package controle.somanome.Controller;

import controle.somanome.Model.Nomes;
import javafx.fxml.FXML;
import java.awt.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class NomesController {

    @FXML
    private TextField nome1;

    @FXML
    private TextField nome2;

    @FXML
    private Button btnJuntar;

    @FXML
    private Label lblResultado;

    @FXML
    public void juntarNomes() {
        Nomes nomes = new Nomes();
        nomes.setNome1(nome1.getText());
        nomes.setNome2(nome2.getText());

        String resultado = nomes.getNome1() + " " + nomes.getNome2();

        lblResultado.setText("Resultado: " + resultado);
    }

}
