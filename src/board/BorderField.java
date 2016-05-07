package board;

import java.io.Serializable;

/**
 * Trieda predstavujuca okrajove policko
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class BorderField implements Field, Serializable {
    public void addNextField (Direction dirs, Field field)
    {
    }

    public Field nextField (Direction dirs)
    {
        return null;
    }

    public boolean putDisk (Disk disk)
    {
        return false;
    }

    public Disk getDisk ()
    {
        return null;
    }
}
