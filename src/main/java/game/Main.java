package game;

import engine.GameEngine;
import engine.IGameLogic;

public class Main {

    private static final boolean VSYNC = true;

    public static void main(String[] args) {
        try {

            IGameLogic gameLogic = new DummyGame();
            GameEngine gameEng = new GameEngine("GAME", 600, 480, VSYNC, gameLogic);
            gameEng.start();
        } catch (Exception excp) {
            excp.printStackTrace();
            System.exit(-1);
        }
    }

}