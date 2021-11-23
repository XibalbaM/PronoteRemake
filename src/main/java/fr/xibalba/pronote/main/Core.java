package fr.xibalba.pronote.main;

import fr.xibalba.pronote.config.ConfigManager;
import fr.xibalba.pronote.ui.PanelManager;
import javafx.stage.Stage;
import libs.arilibfx.utils.AriLogger;

public class Core {

    private static PanelManager panelManager;
    static AriLogger logger = new AriLogger("Axium Launcher");

    public static void init(Stage stage) {

        ConfigManager.load();

        panelManager = new PanelManager(stage);
        panelManager.init();
        panelManager.showPanel(new PanelLang());
    }

    public static void stopApp() {
        ConfigManager.save();
        System.exit(0);
    }

    public static PanelManager getPanelManager() {
        return panelManager;
    }

    public static AriLogger getLogger() {
        return logger;
    }
}