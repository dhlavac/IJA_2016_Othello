package game;

import board.*;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * Trieda predstavujuca jedneho hraca
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class Player implements Serializable
{
    boolean isWhite;
    int disksCount;
    public String name;
    public List<BoardField> turnedFields = new ArrayList<BoardField>();

    /**
     * Konstruktor, nastavi farbu hraca
     * @param isWhite Farba hraca
     */
    public Player(boolean isWhite)
    {
        this.isWhite = isWhite;
    }

    /**
     * Zistuje farbu hraca
     * @return farba hraca
     */
    public boolean isWhite()
    {
        return this.isWhite;
    }
    
    /**
     * Vymaze zoznam otocenych kamenov
     */
    public void emptyList()
    {
        turnedFields.clear();
    }

    /**
     * Zistuje, ci sa da na zadane policko polozit kamen
     * @param field zadane policko
     * @return uspech operacie
     */
    public boolean canPutDisk(Field field)
    {
        Field tmpField;    
        boolean end = false;
        for (Field.Direction direction : Field.Direction.values()) {
            boolean wasOpposite = false;
            tmpField = field.nextField(direction);
            while (tmpField.getDisk() != null)
            {
                boolean first = true;
                if (tmpField.getDisk().isWhite() != isWhite && !wasOpposite)
                {
                    wasOpposite = true;
                }

                if (tmpField.getDisk().isWhite() == isWhite && wasOpposite)
                {
                    end = true;
                    break;
                }
                else if (tmpField.getDisk().isWhite() == isWhite && !wasOpposite && first)
                {
                    break;
                }

                tmpField = tmpField.nextField(direction);
                first = false;
                if(tmpField == null)
                {
                    wasOpposite = false;
                    break;
                }
            }

        }

        return end;
    }

    /**
     * Zistuje, ci ma hrac este nejake kamene
     * @return Vracia true alebo fasle podal toho ci este hrac ma nejake kamene
     */
    public boolean emptyPool()
    {
        boolean isEmpty = (disksCount == 0);
        return isEmpty;
    }

    /**
     * Polozi kamen na zadane policko
     * @param field zadane policko
     * @return uspech operacie
     */
    public boolean putDisk(Field field)
    {
        List<Field.Direction> rigtDirections = new ArrayList<Field.Direction>();
        for (Field.Direction direction : Field.Direction.values()) {
            boolean wasOpposite = false;
            Field tmpField = field.nextField(direction);
            while (tmpField.getDisk() != null)
            {
                boolean first = true;
                if (tmpField.getDisk().isWhite() != isWhite && !wasOpposite)
                {
                    wasOpposite = true;
                }

                if (tmpField.getDisk().isWhite() == isWhite && wasOpposite)
                {
                    rigtDirections.add(direction);
                    break;
                }
                else if (tmpField.getDisk().isWhite() == isWhite && !wasOpposite && first)
                {
                    break;
                }

                tmpField = tmpField.nextField(direction);
                first = false;
                if(tmpField == null)
                {
                    wasOpposite = false;
                    break;
                }
            }

        }
        
        if (canPutDisk(field))
        {
            for (Field.Direction direction : rigtDirections)
            {
                Field tmpField = field.nextField(direction);
                while (tmpField.getDisk() != null)
                {
                    if (tmpField.getDisk().isWhite() == isWhite)
                    {
                        break;
                    }

                    tmpField.getDisk().turn();
                    turnedFields.add(new BoardField(tmpField.getRow(), tmpField.getCol()));
                    tmpField = tmpField.nextField(direction);
                }
            }

            field.putDisk(new Disk(isWhite));
            return true;
        }

        return false;
    }


    /**
     * Inicializuje 4 kamene v strede
     * @param board hracia doska
     */
    public void init(Board board){
        disksCount = board.getRules().numberDisks();
        if (isWhite)
        {
            Board.field[(board.getSize()/2)][(board.getSize()/2)].putDisk(new Disk(isWhite));
            Board.field[(board.getSize()/2) + 1][(board.getSize()/2) + 1].putDisk(new Disk(isWhite));
        }
        else
        {
            Board.field[(board.getSize()/2)][(board.getSize()/2) + 1].putDisk(new Disk(isWhite));
            Board.field[(board.getSize()/2) + 1][(board.getSize()/2)].putDisk(new Disk(isWhite));
        }
    }

    /**
     * Farba hraca
     * @return farba hraca
     */
    public String toString()
    {
        return isWhite ? "white" : "black";
    }
}
