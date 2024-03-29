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
     * @param board Hracia doska
     */  
    public Game(Board board)
    {
        this.board = board;
    }
    
    /**
     * Metoda na zistenie hraca ktory je na rade
     * @return hrac, ktory je na rade
     */
    public Player currentPlayer(){
        return (whichPlayer) ?  blackPlayer : whitePlayer;
    }
    
    /**
     * Metoda na zistenie hraca ktory je dalsi na rade
     * @return hrac dalsi na rade
     */
    public Player nextPlayer(){
        whichPlayer = !whichPlayer;
        return currentPlayer();
    }
    
    /**
     * Metoda vracia hracu plochu
     * @return Hracia plocha board
     */
    public Board getBoard()
    {
        return board;
    }
    
    /**
     * Funkcia na pridanie noveho hraca do hry a jeho inicializaciu
     * na hracej ploche
     * @param player Hrac
     * @return true ak sa podarilo pridat noveho hraca inak vracia false
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
     * Metoda na spocitanie aktualneho poctu dikov jednotlivych harcov,
     * hodnoty vracia v premennych whiteDisks a blackDisks
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
