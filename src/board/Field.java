package board;

/**
 * Created by xduris04 and xhlava42 on 12.3.2016.
 */
public interface Field {
    void addNextField(Direction dirs, Field field);

    Field nextField(Direction dirs);

    boolean putDisk(Disk disk);

    //boolean canPutDisk(Disk disk);

   // boolean isEmpty();

    Disk getDisk();

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
