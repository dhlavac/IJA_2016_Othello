package game;

import board.*;


/**
 * Created by xduris04 and xhlava42 on 3.4.2016.
 */
public class ReversiRules implements Rules
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

    public Field createField(int row, int col)
    {
        BoardField boardField = new BoardField(row, col);
        return boardField;
    }
}
