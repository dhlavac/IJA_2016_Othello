package game;

import board.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xduris04 and xhlava42 on 3.4.2016.
 */
public class Player
{
    boolean isWhite;
    int disksCount;
    List<Field.Direction> rigtDirections = new ArrayList<Field.Direction>();

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
        boolean wasOpposite = false;
        boolean end = false;
        for (Field.Direction direction : Field.Direction.values()) {
            tmpField = field.nextField(direction);
            while (tmpField.getDisk() != null)
            {
                if (tmpField.getDisk().isWhite() != isWhite && !wasOpposite)
                {
                    rigtDirections.add(direction);
                    wasOpposite = true;
                }

                if (tmpField.getDisk().isWhite() == isWhite && wasOpposite)
                {
                    end = true;
                    break;
                }

                tmpField = tmpField.nextField(direction);
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
