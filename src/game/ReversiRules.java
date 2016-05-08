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
     * Metoda vracajúca velkosť hracej plochy
     * @return size Vracia velkosť hracej dosky
     */
    public int getSize()
    {
        return this.size;
    }
    
    /**
     * Metoda vracajúca počet diskov
     * @return (size * size) /2
     */
    public int numberDisks()
    {
        return (this.size * this.size) / 2;
    }
    
    /**
     * Metoda vytvorý hracie policko
     * @param row Počet riadkov
     * @param col Počet stlpcov
     * @return hracie policko
     */
    public BoardField createField(int row, int col)
    {
        BoardField boardField = new BoardField(row, col);
        return boardField;
    }
}
