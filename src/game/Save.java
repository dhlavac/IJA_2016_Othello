/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import board.Board;
import board.BoardField;
import board.Rules;
import java.io.Serializable;

/**
 * Trieda pre ukladanie hry
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class Save implements Serializable{
    public BoardField[][] fields;
    public boolean whichPlayer = false;
    public Player blackPlayer;
    public Player whitePlayer;
    public Board board;
    
    public Save(Game game)
    {
        blackPlayer = game.blackPlayer;
        whitePlayer = game.whitePlayer;
        whichPlayer = game.whichPlayer;
        board = game.getBoard();
        
        fields = new BoardField[game.getBoard().getSize()][game.getBoard().getSize()];
        
        for (int i = 0; i < game.getBoard().getSize(); i++)
        {
            for (int j = 0; j < game.getBoard().getSize(); j++)
            {
                BoardField tmp = new BoardField(i, j);
                fields[i][j] = tmp;
                fields[i][j].putDisk(game.getBoard().getField(i + 1, j + 1).getDisk());
            }
        }
    }
    
}
