package fr.xibalba.pronote.config;

import fr.xibalba.pronote.games.Game;
import fr.xibalba.pronote.games.GamesRegistry;

import java.io.Serial;

public class GameConfig implements IConfig {

    @Serial
    private static final long serialVersionUID = -1742223625328080132L;

    private String gameName;

    public String path;

    public GameConfig(Game game) {

        this.gameName = game.getName();
        this.initVars();
    }

    @Override
    public GameConfig initVars() {

        if (path == null)
            path = GamesRegistry.getInstance().getGameList().get(gameName).getDefaultPath();

        return this;
    }
}