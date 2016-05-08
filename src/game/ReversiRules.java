package game;

import board.*;
import java.io.Serializable;


/**
 * Trieda implementujuca pravidla
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class ReversiRules implements Rules, Serializable
{
    int size;
    
    /**
     * Konstruktor nastavuje velkost hracej dosky
     * @param size velkos hracej dosky
     */
    public ReversiRules(int size)
    {
        this.size = size;
    }
    
    /**
     * Metoda vracajuca velkosť hracej plochy
     * @return size Vracia velkost hracej dosky
     */
    public int getSize()
    {
        return this.size;
    }
    
    /**
     * Metoda vracajuca pocet diskov
     * @return (size * size) /2
     */
    public int numberDisks()
    {
        return (this.size * this.size) / 2;
    }
    
    /**
     * Metoda vytvory hracie policko
     * @param row Pocet riadkov
     * @param col Pocet stlpcov
     * @return hracie policko
     */
    public BoardField createField(int row, int col)
    {
        BoardField boardField = new BoardField(row, col);
        return boardField;
    }
}
