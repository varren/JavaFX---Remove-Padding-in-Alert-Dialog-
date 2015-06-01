package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(new HBox());
        primaryStage.setScene(scene);
        String css = Main.class.getResource("styles.css").toExternalForm();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(css);
        primaryStage.show();


        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle("");
        alert.initOwner(primaryStage);
        TabPane tabPane = new TabPane(new Tab("test"));
        tabPane.setPadding(Insets.EMPTY);
        alert.getDialogPane().setPadding(Insets.EMPTY);
        alert.getDialogPane().setContent(tabPane);

        alert.show();
    }
}