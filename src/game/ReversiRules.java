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
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param size velkos hracej dosky
     */

    public ReversiRules(int size)
    {
        this.size = size;
    }
    
    /**
     * Funkcia vracajúca velkosť hracej plochy
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return size Vracia velkosť hracej dosky
     */

    public int getSize()
    {
        return this.size;
    }
    
    /**
     * Funkcia vracajúca počet diskov
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return (size * size) /2
     */

    public int numberDisks()
    {
        return (this.size * this.size) / 2;
    }
    
    /**
     * Funkcia vytvorý novú hraciu dosku
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param row Počet riadkov
     * @param col Počet stlpcov
     * @return boardField vracia novovzniknutú hraciu dosku
     */

    public BoardField createField(int row, int col)
    {
        BoardField boardField = new BoardField(row, col);
        return boardField;
    }
}
