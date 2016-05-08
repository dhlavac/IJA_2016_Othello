package board;

import java.io.Serializable;

/**
 * Trieda predstavujuca okrajove policko
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class BorderField implements Field, Serializable {

    /**
     * Metoda nerobi nic
     * @param dirs Suradnice
     * @param field Pole hracej plochy 
     */
    public void addNextField (Direction dirs, Field field)
    {
    }

    /**
     * Metoda vracia null
     * @param dirs Suradnice
     * @return null
     */
    public Field nextField (Direction dirs)
    {
        return null;
    }

    /**
     * Metoda vracia false
     * @param disk Disk
     * @return false
     */
    public boolean putDisk (Disk disk)
    {
        return false;
    }

    /**
     * Metoda vracia null
     * @return null
     */
    public Disk getDisk ()
    {
        return null;
    }

    /**
     * Metoda vracia -1
     * @return -1
     */
    public int getCol()
    {
        return -1;
    }

    /**
     * Metoda vracia -1
     * @return -1
     */
    public int getRow()
    {
        return -1;
    }

    /**
     * Metoda zmaze disk
     */   
    public void deleteDisk()
    {
    }
}
