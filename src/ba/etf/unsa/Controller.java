package ba.etf.unsa;

import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Controller {
    public Label labela;
    public GridPane pa;
    public void labela(MouseEvent mouseEvent) {
            labela.setText("Hello World!");
            pa.setStyle("-fx-background-color: #cb3333;");
        }
    }
