package fr.xibalba.pronote.main;

import javafx.application.Application;
import javafx.stage.Stage;

public class FxApplication extends Application {

    @Override
    public void start(Stage stage) {

        Core.init(stage);
    }
}
