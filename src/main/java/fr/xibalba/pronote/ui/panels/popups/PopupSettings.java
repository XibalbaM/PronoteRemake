package fr.xibalba.pronote.ui.panels.popups;

import fr.xibalba.pronote.ui.panel.PopupPanel;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class PopupSettings extends PopupPanel {

    public PopupSettings() {

        super(500, 700);
        Pane pane = new Pane();
        pane.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        this.centerPanel.getChildren().add(pane);
        pane.setOnKeyPressed(event -> {
            event.getCode().equals(KeyCode.ESCAPE);
            close();
        });
    }
}