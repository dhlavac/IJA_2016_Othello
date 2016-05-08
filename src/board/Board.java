package board;

import java.io.Serializable;

/**
 * Trieda predstavujuca hraciu dosku
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class Board implements Serializable
{
    private int size;
    public static Field[][] field;
    Rules rules;

    /**
     * Konstruktor vytvarajuci hraciu dosku podla zadaných pravidiel
     * @param rules pravidla pre vznik hracej dosky
     */

    public Board(Rules rules)
    {
        this.size = rules.getSize();
        this.rules = rules;
        this.field = new Field[size + 2][size + 2]; // +2 lebo mame aj okrajove, neaktivne polia
        for (int col = 0; col < size + 2; col++ )
        {
            for (int row = 0; row < size + 2; row++)
            {
                if (col == 0)
                {
                    BorderField tmpField = new BorderField();
                    field[row][col] = tmpField;
                }
                else if (col == (size + 1))
                {
                    BorderField tmpField = new BorderField();
                    field[row][col] = tmpField;
                }
                else if (row == 0)
                {
                    BorderField tmpField = new BorderField();
                    field[row][col] = tmpField;
                }
                else if (row == (size + 1))
                {
                    BorderField tmpField = new BorderField();
                    field[row][col] = tmpField;
                }
                else
                {
                    BoardField tmpField = new BoardField(row, col);
                    field[row][col] = tmpField;
                }
            }
        }

        for (int row = 0; row < size + 2; row ++)
        {
            for (int col = 0; col < size + 2; col++)
            {
                field[row][col].addNextField(Field.Direction.D, getField(row + 1, col));
                field[row][col].addNextField(Field.Direction.U, getField(row - 1, col));
                field[row][col].addNextField(Field.Direction.R, getField(row, col + 1));
                field[row][col].addNextField(Field.Direction.L, getField(row, col - 1));
                field[row][col].addNextField(Field.Direction.RD, getField(row + 1, col + 1));
                field[row][col].addNextField(Field.Direction.LD, getField(row + 1, col - 1));
                field[row][col].addNextField(Field.Direction.RU, getField(row - 1, col + 1));
                field[row][col].addNextField(Field.Direction.LU, getField(row - 1, col - 1));
            }
        }
    }


    /**
     * Metoda vracajuca jednotlive polia hracej dosky
     * @param row Riadok Boardu
     * @param col Stlpec Boardu
     * @return field Vracia policko hracej dosky na zadanom riadku a stlpci.
     */

    public Field getField(int row, int col)
    {
        if (row >= 0 && row < (size + 2) && col >= 0 && col < (size + 2))
        {
            return field[row][col];
        }
        else
        {
            return null;
        }
    }

    /**
     * Metoda priradí vytvorené pole na suradnice na hracej doske
     * @param row Riadok Boardu
     * @param col Stlpec Boardu
     * @param field Policko hracej plochy
     */

    public void putField(int row, int col, Field field)
    {
        this.field[row][col] = field;
    }


    /**
     * Metoda vracia pravidla hracej dosky
     */

    public Rules getRules()
    {
        return rules;
    }

    /**
     * Metoda vracia velkost hracej dosky
     */

    public int getSize ()
    {
        return size;
    }
}
