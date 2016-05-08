package board;

import java.io.Serializable;

/**
 * Trieda predstavujuca okrajove policko
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class BorderField implements Field, Serializable {

    /**
     * Funkcia nerobí nič
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param dirs Suradnice
     * @param field Pole hracej plochy 
     */

    public void addNextField (Direction dirs, Field field)
    {
    }

    /**
     * Funkcia vracia null
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param dirs Suradnice
     * @return Vracia null
     */

    public Field nextField (Direction dirs)
    {
        return null;
    }

    /**
     * Funkcia vracia false
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param disk Disk
     * @return Vracia false
     */

    public boolean putDisk (Disk disk)
    {
        return false;
    }

    /**
     * Funkcia vracia null
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Vracia null
     */

    public Disk getDisk ()
    {
        return null;
    }

    /**
     * Funkcia vracia -1
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Vracia -1
     */
    
    public int getCol()
    {
        return -1;
    }

    /**
     * Funkcia vracia -1
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Vracia -1
     */
    
    public int getRow()
    {
        return -1;
    }

    /**
     * Funkcia maze disk
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     */
    
    public void deleteDisk()
    {
    }
}
