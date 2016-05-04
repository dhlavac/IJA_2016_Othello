package board;

import java.io.Serializable;

/**
 * Created by xduris04 and xhlava42 on 12.3.2016.
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
