package game;

import board.Board;
import board.BoardField;
import board.Rules;
import java.io.Serializable;

/**
 * Trieda pre ukladanie hry
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class Save implements Serializable{
    public BoardField[][] fields;
    public boolean whichPlayer = false;
    public Player blackPlayer;
    public Player whitePlayer;
    public Board board;
    public boolean PCplaying = false;
    public boolean diffEasy = true;
    
    /**
     * Konstruktor ukladá aktualne rozohratú hru aj so všetkými parametrami
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param game Hra obsahujúca všetky informacie vrátane hráčov,
     * hracej dosky, počtu diskov atd.
     */
    
    public Save(Game game)
    {
        blackPlayer = game.blackPlayer;
        whitePlayer = game.whitePlayer;
        whichPlayer = game.whichPlayer;
        diffEasy = game.diffEasy;
        PCplaying = game.PCplaying;
        board = game.getBoard();
        
        fields = new BoardField[game.getBoard().getSize()][game.getBoard().getSize()];
        
        for (int i = 0; i < game.getBoard().getSize(); i++)
        {
            for (int j = 0; j < game.getBoard().getSize(); j++)
            {
                BoardField tmp = new BoardField(i, j);
                fields[i][j] = tmp;
                fields[i][j].putDisk(game.getBoard().getField(i + 1, j + 1).getDisk());
            }
        }
    }
    
}
