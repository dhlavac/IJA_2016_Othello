package board;

/**
 * Rozhranie pre policka
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public interface Field {
    
    
    /**
     * Metoda nerobi nic
     * @param dirs Suradnice
     * @param field Pole hracej plochy 
     */
    
    void addNextField(Direction dirs, Field field);

    
    /**
     * Metoda vracia null
     * @param dirs Suradnice
     * @return null
     */
    
    Field nextField(Direction dirs);
    
    
    /**
     * Metoda vkladajuca hracie disky na policka plochy podla to ci 
     * je zadané pole prazdne
     * @param disk Hraci disk  hraca
     * @return true a priradi disk ak je pole praznde inak vracia false
     */
    
    boolean putDisk(Disk disk);
    
    
    /**
     * Metoda vracia -1
     * @return -1
     */
    
    int getCol();
    
    /**
     * Metoda vracia -1
     * @return -1
     */
    
    int getRow();

    /**
     * Metoda vracia null
     * @return null
     */
    
    Disk getDisk();
    
    /**
     * Metoda zmaze disk
     */
    
    void deleteDisk();

    public static enum Direction {
        D,
        L,
        LD,
        LU,
        R,
        RD,
        RU,
        U
    }
}
