package board;

/**
 * Created by xduris04 and xhlava42 on 3.4.2016.
 */
public interface Rules {
    int getSize();

    int numberDisks();

    Field createField(int row, int col);
}
