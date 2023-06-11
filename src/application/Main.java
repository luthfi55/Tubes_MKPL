package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(tes tes) throws Exception {
        Parent parent = (Parent) FXMLLoader.load(getClass().getResource(
                "/view/MainPane.fxml"));
        Scene scene = new Scene(parent);
        tes.setScene(scene);
        stage.setTitle("Library");
        stage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
