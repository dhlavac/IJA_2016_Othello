/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package othello;

import game.Game;
import game.Save;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Dominik
 */
public class GameBoard extends javax.swing.JFrame {

    /**
     * Creates new form GameBoard
     */
    public int size; 
    Game game;
    JPanel boardPanel;
    
    public GameBoard(Game game) {
        initComponents();
        this.size = game.getBoard().getSize();
        this.game = game;
        initializeGui();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BoardGameUndoButton = new javax.swing.JButton();
        BoardGameSaveButton = new javax.swing.JButton();
        PlayingBoard = new javax.swing.JPanel();
        GameBoardMenuBar = new javax.swing.JMenuBar();
        GameBoardMenuFile = new javax.swing.JMenu();
        BoardGameMenuItemNewGame = new javax.swing.JMenuItem();
        BoardGameMenuItemSaveGame = new javax.swing.JMenuItem();
        BoardGameMenuItemLoadGame = new javax.swing.JMenuItem();
        BoardGameMenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BoardGameUndoButton.setText("Undo");
        BoardGameUndoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoardGameUndoButtonMouseClicked(evt);
            }
        });

        BoardGameSaveButton.setText("Save");
        BoardGameSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoardGameSaveButtonMouseClicked(evt);
            }
        });

        PlayingBoard.setPreferredSize(new java.awt.Dimension(1000, 1000));
        PlayingBoard.setLayout(new java.awt.GridBagLayout());

        GameBoardMenuFile.setText("File");

        BoardGameMenuItemNewGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        BoardGameMenuItemNewGame.setText("New Game");
        GameBoardMenuFile.add(BoardGameMenuItemNewGame);

        BoardGameMenuItemSaveGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        BoardGameMenuItemSaveGame.setText("Save Game");
        GameBoardMenuFile.add(BoardGameMenuItemSaveGame);

        BoardGameMenuItemLoadGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        BoardGameMenuItemLoadGame.setText("Load Game");
        GameBoardMenuFile.add(BoardGameMenuItemLoadGame);

        BoardGameMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        BoardGameMenuItemExit.setText("Exit");
        GameBoardMenuFile.add(BoardGameMenuItemExit);

        GameBoardMenuBar.add(GameBoardMenuFile);

        setJMenuBar(GameBoardMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(PlayingBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BoardGameSaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(BoardGameUndoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(BoardGameUndoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(BoardGameSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PlayingBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoardGameSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardGameSaveButtonMouseClicked
        /*Rules rRules = new ReversiRules(8); // zmazat potom
        Board board = new Board(rRules);    // zmazat
        Game game = new Game(board);        // tu priradime hru co chceme ulozit
        game.tmp = "ahooj";                 // zmazat, len na kontrolu*/
        
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.FILES_ONLY);
        f.showSaveDialog(null);
        this.game.tmp = "serus";
        Save saveGame = new Save(this.game);
        
        try {
            FileOutputStream fout = new FileOutputStream(f.getSelectedFile());
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(saveGame);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_BoardGameSaveButtonMouseClicked

    
    public void initializeGui() {

        GridBagConstraints box = new GridBagConstraints();
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                JButton cell = new JButton();
                cell.setBackground(Color.gray);
                cell.setPreferredSize(new Dimension(50, 50));
                
                box.fill = GridBagConstraints.HORIZONTAL;
                box.gridx = row;
                box.gridy = col;
                PlayingBoard.add(cell,box);
                
                /*cell.setSize(70, 70);
                cell.setBackground(new Color(188, 222, 255));
                cell.setBorder(BorderFactory.createLineBorder(Color.gray));
                boardPanel.add(cell);*/
            }
        }
       
    }
    
    // nemal som to kam jebnut, tak UNDO zatial bude testovat ci su fakt v strede tie kamene :D pre 8x8
    // 3:26 - fakt su :)
    private void BoardGameUndoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardGameUndoButtonMouseClicked
        //System.out.println(this.game.tmp);
        
        if (this.game.getBoard().getField(4, 4).getDisk() != null)
        {
            String color = "";
            if (this.game.getBoard().getField(4, 4).getDisk().isWhite())
                color = "biela";
            else
                color = "cierna";
            
            System.out.println("[4][4]: " + color);
        }
        else
        {
            System.out.println("Neni tam kamen");
        }  
        
        if (this.game.getBoard().getField(4, 5).getDisk() != null)
        {
            String color = "";
            if (this.game.getBoard().getField(4, 5).getDisk().isWhite())
                color = "biela";
            else
                color = "cierna";
            
            System.out.println("[4][5]: " + color);
        }
        else
        {
            System.out.println("Neni tam kamen");
        } 
        
        if (this.game.getBoard().getField(5, 4).getDisk() != null)
        {
            String color = "";
            if (this.game.getBoard().getField(5, 4).getDisk().isWhite())
                color = "biela";
            else
                color = "cierna";
            
            System.out.println("[5][4]: " + color);
        }
        else
        {
            System.out.println("Neni tam kamen");
        } 
        
        if (this.game.getBoard().getField(5, 5).getDisk() != null)
        {
            String color = "";
            if (this.game.getBoard().getField(5, 5).getDisk().isWhite())
                color = "biela";
            else
                color = "cierna";
            
            System.out.println("[5][5]: " + color);
        }
        else
        {
            System.out.println("Neni tam kamen");
        }
    }//GEN-LAST:event_BoardGameUndoButtonMouseClicked

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BoardGameMenuItemExit;
    private javax.swing.JMenuItem BoardGameMenuItemLoadGame;
    private javax.swing.JMenuItem BoardGameMenuItemNewGame;
    private javax.swing.JMenuItem BoardGameMenuItemSaveGame;
    private javax.swing.JButton BoardGameSaveButton;
    private javax.swing.JButton BoardGameUndoButton;
    private javax.swing.JMenuBar GameBoardMenuBar;
    private javax.swing.JMenu GameBoardMenuFile;
    private javax.swing.JPanel PlayingBoard;
    // End of variables declaration//GEN-END:variables
}
