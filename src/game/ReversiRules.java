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

    public ReversiRules(int size)
    {
        this.size = size;
    }

    public int getSize()
    {
        return this.size;
    }

    public int numberDisks()
    {
        return (this.size * this.size) / 2;
    }

    public BoardField createField(int row, int col)
    {
        BoardField boardField = new BoardField(row, col);
        return boardField;
    }
}
