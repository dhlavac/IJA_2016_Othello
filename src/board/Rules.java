package board;

/**
 * Rozhranie pre pravidla
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public interface Rules {
    int getSize();

    int numberDisks();

    Field createField(int row, int col);
}
