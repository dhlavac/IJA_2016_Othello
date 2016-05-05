package board;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by xduris04 and xhlava42 on 12.3.2016.
 */
public class BoardField implements Field, Serializable {
    public Disk disk;
    private int row, col;
    final Field[] fieldsAround = new Field[8];

    public BoardField(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public void addNextField(Field.Direction dirs, Field field)
    {
        switch(dirs)
        {
            case D:
                this.fieldsAround[0] = field;
                break;

            case L:
                this.fieldsAround[1] = field;
                break;

            case LD:
                this.fieldsAround[2] = field;
                break;

            case LU:
                this.fieldsAround[3] = field;
                break;

            case R:
                this.fieldsAround[4] = field;
                break;

            case RD:
                this.fieldsAround[5] = field;
                break;

            case RU:
                this.fieldsAround[6] = field;
                break;

            case U:
                this.fieldsAround[7] = field;
                break;
        }
    }

    public Field nextField(Field.Direction dirs){
        switch(dirs){
            case D:
                return this.fieldsAround[0];

            case L:
                return this.fieldsAround[1];

            case LD:
                return this.fieldsAround[2];

            case LU:
                return this.fieldsAround[3];

            case R:
                return this.fieldsAround[4];

            case RD:
                return this.fieldsAround[5];

            case RU:
                return this.fieldsAround[6];

            case U:
                return this.fieldsAround[7];
        }

        return null;
    }

    public boolean putDisk(Disk disk)
    {
        if (this.disk == null)
        {
            this.disk = disk;
            return true;
        }
        else
        {
            return false;
        }
    }

    public Disk getDisk()
    {
        if (this.disk != null)
        {
            return this.disk;
        } else
        {
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        BoardField that = (BoardField) obj;

        if (row != that.row) return false;
        if (col != that.col) return false;
        return disk != null ? disk.equals(that.disk) : that.disk == null;
    }

    @Override
    public int hashCode() {
        int result = disk != null ? disk.hashCode() : 0;
        result = 31 * result + row;
        result = 31 * result + col;
        result = 31 * result + Arrays.hashCode(fieldsAround);
        return result;
    }
}
