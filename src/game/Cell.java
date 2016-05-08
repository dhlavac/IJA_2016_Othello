/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import board.Disk;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 * Trieda predstavujuca zobrazovane policko
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class Cell extends JButton{
    public Game game;
    public int row;
    public int col;
    
    /**
     * Konstruktor vytvarajuci jedno policko na hracej ploche
     * @param game Cela hra aj s pravidlami a doskou
     * @param row Cislo riadku
     * @param col Cislo stlpca
     */   
    public Cell(Game game, int row, int col)
    {
        this.game = game;
        this.setBackground(Color.green);
        this.setPreferredSize(new Dimension(50, 50));
        this.row = row + 1;
        this.col = col + 1;
        // this.addMouseListener(this);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Disk disk = this.game.getBoard().getField(this.row, this.col).getDisk();
        if (disk != null)
        {
            if (disk.isWhite())
            {
                g.setColor(Color.white);
                g.fillOval(7, 7, 35, 35);
            }
            else
            {  
                g.setColor(Color.black);
                g.fillOval(7, 7, 35, 35);
            }
        } 
        
        if (game.currentPlayer().canPutDisk(game.getBoard().getField(row, col)) && game.getBoard().getField(row, col).getDisk() == null)
        {
            g.setColor(new Color(0, 170, 0));
            g.drawOval(7, 7, 35, 35);
        }
        
        repaint();
    }
    
}
