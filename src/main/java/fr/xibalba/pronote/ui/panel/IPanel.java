package fr.xibalba.pronote.ui.panel;

import javafx.scene.layout.GridPane;

public interface IPanel {

    void init();
    GridPane getLayout();
    void onShow();
    void onRefresh();
    void onHide();
    String getName();
}