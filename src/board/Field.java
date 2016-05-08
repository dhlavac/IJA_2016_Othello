package board;

/**
 * Rozhranie pre policka
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public interface Field {
    void addNextField(Direction dirs, Field field);

    Field nextField(Direction dirs);

    boolean putDisk(Disk disk);
    
    int getCol();
    
    int getRow();

    Disk getDisk();
    
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
