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
    public int blackDisks = 2;
    public int whiteDisks = 2;

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
    
    public void countDicks()
    {
        int tmpWhiteDisks = 0;
        int tmpBlackDisks = 0;
        for (int i = 1; i < board.getSize() + 1; i++)
            for (int j = 1; j < board.getSize() + 1; j++)
            {
                if (board.getField(i, j).getDisk() != null && board.getField(i, j).getDisk().isWhite())
                    tmpWhiteDisks++;
                else if (board.getField(i, j).getDisk() != null && !board.getField(i, j).getDisk().isWhite())
                    tmpBlackDisks++;
            }
        
        this.whiteDisks = tmpWhiteDisks;
        this.blackDisks = tmpBlackDisks;
    }
}
