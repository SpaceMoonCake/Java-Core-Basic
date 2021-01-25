package GameXO;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public static final int GAME_MODE_HUMAN_AND_AI = 0;
    public static final int GAME_MODE_HUMAN_AND_HUMAN = 1;


    GameMap(){
        setBackground(Color.PINK);
    }

    void startNewGame(int mode, int mapSizeX, int mapSizeY, int winLength){
        System.out.println("mode = " + mode +
                            " mapSizeX = " + mapSizeX +
                            "mapSizeY = " + mapSizeY +
                            "winLength = " + winLength);
    }

}
