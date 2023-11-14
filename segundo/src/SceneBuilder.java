import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SceneBuilder {

    @FXML
    private Button btnClick;

    @FXML
    private Label text1;

    @FXML
    void apertouBotao(ActionEvent event) {
        text1.setText("Olá mundo!");
    }

}
