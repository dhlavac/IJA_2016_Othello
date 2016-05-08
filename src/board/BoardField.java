package board;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Trieda predstavujuca hracie policko
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class BoardField implements Field, Serializable {
    public Disk disk;
    private int row, col;
    final Field[] fieldsAround = new Field[8];


    /**
     * Konstruktor Board Field nastaví hodnoty row a col
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param row Cislo riadku
     * @param col Cislo stplca
     */

    public BoardField(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    /**
     * Funkcia  vracia stlpec 
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Vracia cislo stlpca
     */
    
    public int getCol()
    {
        return this.col;
    }

     /**
     * Funkcia  vracia riadok 
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Vracia cislo riadku
     */
    
    public int getRow()
    {
        return this.row;
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

    /**
     * Funkcia vkladajuca hracie disky na policka plochy podla to ci 
     * je zadané pole prazdne
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @param disk Hrací disk  hráča
     * @return Vracia true a priradi disk ak je pole praznde inak vracia false
     */

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

    /**
     * Funkcia  vracia disk 
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Vracia disk ak nieje pole praznde inak vracia null
     */

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

    /**
     * Funkcia  vymaže disk 
     * @author Michal Durista (xduris04)
     * @author Dominik Hlavac Duran (xhlava42)
     * @return Vracia disk ak nieje pole praznde inak vracia null
     */
    
    public void deleteDisk()
    {
        this.disk = null;
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
