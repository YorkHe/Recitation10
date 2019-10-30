package edu.cmu.cs.cs214.rec10.plugin;

import edu.cmu.cs.cs214.rec10.framework.core.GameFramework;
import edu.cmu.cs.cs214.rec10.framework.core.GamePlugin;

/**
 * @author Yihua Cai (yihuac@andrew.cmu.edu)
 */
public class TestPlugin implements GamePlugin {
    @Override
    public String getGameName() {
        return null;
    }

    @Override
    public int getGridWidth() {
        return 0;
    }

    @Override
    public int getGridHeight() {
        return 0;
    }

    @Override
    public void onRegister(GameFramework framework) {

    }

    @Override
    public void onNewGame() {

    }

    @Override
    public void onNewMove() {

    }

    @Override
    public boolean isMoveValid(int x, int y) {
        return false;
    }

    @Override
    public boolean isMoveOver() {
        return false;
    }

    @Override
    public void onMovePlayed(int x, int y) {

    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public String getGameOverMessage() {
        return null;
    }

    @Override
    public void onGameClosed() {

    }
}
