package sample;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private VBox shapeMenu;
    @FXML
    private VBox shapeArea;
    @FXML
    private VBox shapeSize;
    @FXML
    private VBox heightInfo;
    @FXML
    private VBox widthInfo;

    public void initialize() {
        String cssLayout = "-fx-border-color: black;\n" +
                "-fx-border-insets: 5;\n" +
                "-fx-border-width: 3;\n" +
                "-fx-border-style: solid;\n";

        shapeMenu.setStyle(cssLayout);
        shapeArea.setStyle(cssLayout);
        shapeSize.setStyle(cssLayout);
        heightInfo.setStyle(cssLayout);
        widthInfo.setStyle(cssLayout);

    }

}
