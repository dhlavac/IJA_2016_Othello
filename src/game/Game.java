package game;

import board.Board;
import java.io.Serializable;

/**
 * Created by xduris04 and xhlava42 on 3.4.2016.
 */
public class Game implements Serializable
{
    public Board board;
    public boolean whichPlayer = false;
    public Player blackPlayer;
    public Player whitePlayer;

    public Game(Board board)
    {
        this.board = board;
    }

    public Player currentPlayer(){
        return (whichPlayer) ?  blackPlayer : whitePlayer;
    }
    public Player nextPlayer(){
        whichPlayer = !whichPlayer;
        return currentPlayer();
    }
    public Board getBoard()
    {
        return board;
    }

    public boolean addPlayer(Player player)
    {
        if (player.isWhite())
        {
            if (whitePlayer == null)
            {
                whitePlayer = player;
                whitePlayer.init(board);
                return true;
            }
        }
        else if (!player.isWhite())
            if (blackPlayer == null)
            {
                blackPlayer = player;
                blackPlayer.init(board);
                return true;
            }

        return false;
    }
}
