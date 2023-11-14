import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private Button botaoLogin;

    @FXML
    private TextField campoSenha;

    @FXML
    private TextField campoUser;

    @FXML
    void fazerLogin(ActionEvent event) {
        String user = campoUser.getText();
        String senha = campoSenha.getText();

        if (user.equals("Felipe") && senha.equals("6001")){
            System.out.println("Logado com sucesso!");
        } else{
            System.out.println("Error!");
        }

    }

}
