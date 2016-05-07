package game;

import board.*;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xduris04 and xhlava42 on 3.4.2016.
 */
public class Player implements Serializable
{
    boolean isWhite;
    int disksCount;
    

    public Player(boolean isWhite)
    {
        this.isWhite = isWhite;
    }

    public boolean isWhite()
    {
        return this.isWhite;
    }

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

    public boolean emptyPool()
    {
        boolean isEmpty = (disksCount == 0);
        return isEmpty;
    }

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
                    tmpField = tmpField.nextField(direction);
                }
            }

            field.putDisk(new Disk(isWhite));
            return true;
        }

        return false;
    }


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

    public String toString()
    {
        return isWhite ? "white" : "black";
    }
}
