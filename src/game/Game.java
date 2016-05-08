package game;

import board.Board;
import java.io.Serializable;

/**
 * Trieda predstavujuca samotnu hru
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class Game implements Serializable
{
    public Board board;
    public boolean whichPlayer = false;
    public Player blackPlayer;
    public Player whitePlayer;
    public int blackDisks = 2;
    public int whiteDisks = 2;
    public boolean PCplaying = false;
    public boolean diffEasy = true;

    /**
     * Konstruktor vytvarajuci novu hru
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param board Hracia doska
     */
    
    public Game(Board board)
    {
        this.board = board;
    }
    
    /**
     * Funkcia na zistenie hráča ktorý je na rade
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Vracia bud whitePlayer alebo blackPlayer podla 
     * toho ktorý je na tahu
     */

    public Player currentPlayer(){
        return (whichPlayer) ?  blackPlayer : whitePlayer;
    }
    
    /**
     * Funkcia na zistenie hráča ktorý je další na rade
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Vracia bud hráča ktorý je další na ťahu
     */
    
    public Player nextPlayer(){
        whichPlayer = !whichPlayer;
        return currentPlayer();
    }
    
    /**
     * Funkcia vracia hracú plochu
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Hracia plocha board
     */
    public Board getBoard()
    {
        return board;
    }
    
    /**
     * Funkcia na pridanie nového hráča do hry a jeho inicializáciu
     * na hracej ploche
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param player Hráč
     * @return vracia true ak sa podarilo pridať nového hráča inak vracia false
     */

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
    
    /**
     * Funkcia na spočítanie aktualneho počtu dikov jednotlivých hráčov,
     * hodnoty vracia v premennych whiteDisks a blackDisks
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     */
    
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
