package board;

import java.io.Serializable;

/**
 * Trieda predstavujuca jeden disk
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class Disk implements Serializable
{
    private boolean isWhite;

    public Disk(boolean isWhite)
    {
        this.isWhite = isWhite;
    }

    public void turn()
    {
        this.isWhite = !this.isWhite;
    }

    public boolean isWhite()
    {
        return this.isWhite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Disk disk = (Disk) o;

        return isWhite == disk.isWhite;
    }

    @Override
    public int hashCode() {
        return (isWhite ? 1 : 0);
    }
}
