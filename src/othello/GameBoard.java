/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package othello;

import game.Cell;
import game.Game;
import game.Player;
import game.Save;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
    List<Cell> cellList = new ArrayList<Cell>();
    Stack gameStack = new Stack<Game>();
    
    public GameBoard(Game game) {
        initComponents();
        Player1Name.setText(game.whitePlayer.name);
        Player2Name.setText(game.blackPlayer.name);
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
        Player2JPanle = new javax.swing.JPanel();
        Player2Name = new javax.swing.JLabel();
        Score1 = new javax.swing.JLabel();
        Player2Score = new javax.swing.JLabel();
        Player1JPanel = new javax.swing.JPanel();
        Player1Name = new javax.swing.JLabel();
        Score2 = new javax.swing.JLabel();
        Player1Score = new javax.swing.JLabel();
        GameBoardMenuBar = new javax.swing.JMenuBar();
        GameBoardMenuFile = new javax.swing.JMenu();
        BoardGameMenuItemNewGame = new javax.swing.JMenuItem();
        BoardGameMenuItemSaveGame = new javax.swing.JMenuItem();
        BoardGameMenuItemLoadGame = new javax.swing.JMenuItem();
        BoardGameMenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BoardGameUndoButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        BoardGameUndoButton.setText("Undo");
        BoardGameUndoButton.setPreferredSize(new java.awt.Dimension(100, 27));
        BoardGameUndoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoardGameUndoButtonMouseClicked(evt);
            }
        });

        BoardGameSaveButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        BoardGameSaveButton.setText("Save");
        BoardGameSaveButton.setPreferredSize(new java.awt.Dimension(100, 50));
        BoardGameSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoardGameSaveButtonMouseClicked(evt);
            }
        });

        PlayingBoard.setPreferredSize(new java.awt.Dimension(1000, 1000));
        PlayingBoard.setLayout(new java.awt.GridBagLayout());

        Player2JPanle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Player2JPanle.setPreferredSize(new java.awt.Dimension(150, 100));

        Player2Name.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Player2Name.setText("Player2Name");

        Score1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Score1.setText("Score:");

        Player2Score.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Player2Score.setText("2");

        javax.swing.GroupLayout Player2JPanleLayout = new javax.swing.GroupLayout(Player2JPanle);
        Player2JPanle.setLayout(Player2JPanleLayout);
        Player2JPanleLayout.setHorizontalGroup(
            Player2JPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player2JPanleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player2JPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Player2JPanleLayout.createSequentialGroup()
                        .addComponent(Score1)
                        .addGap(18, 18, 18)
                        .addComponent(Player2Score))
                    .addComponent(Player2Name))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Player2JPanleLayout.setVerticalGroup(
            Player2JPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player2JPanleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Player2Name)
                .addGap(18, 18, 18)
                .addGroup(Player2JPanleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Score1)
                    .addComponent(Player2Score))
                .addGap(27, 27, 27))
        );

        Player1JPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Player1JPanel.setPreferredSize(new java.awt.Dimension(150, 100));

        Player1Name.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Player1Name.setText("Player1 Name");

        Score2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Score2.setText("Score: ");

        Player1Score.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Player1Score.setText("2");

        javax.swing.GroupLayout Player1JPanelLayout = new javax.swing.GroupLayout(Player1JPanel);
        Player1JPanel.setLayout(Player1JPanelLayout);
        Player1JPanelLayout.setHorizontalGroup(
            Player1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Player1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Player1Name)
                    .addGroup(Player1JPanelLayout.createSequentialGroup()
                        .addComponent(Score2)
                        .addGap(18, 18, 18)
                        .addComponent(Player1Score)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        Player1JPanelLayout.setVerticalGroup(
            Player1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Player1JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Player1Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(Player1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Score2)
                    .addComponent(Player1Score))
                .addGap(22, 22, 22))
        );

        GameBoardMenuFile.setText("File");

        BoardGameMenuItemNewGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        BoardGameMenuItemNewGame.setText("New Game");
        BoardGameMenuItemNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoardGameMenuItemNewGameActionPerformed(evt);
            }
        });
        GameBoardMenuFile.add(BoardGameMenuItemNewGame);

        BoardGameMenuItemSaveGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        BoardGameMenuItemSaveGame.setText("Save Game");
        GameBoardMenuFile.add(BoardGameMenuItemSaveGame);

        BoardGameMenuItemLoadGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        BoardGameMenuItemLoadGame.setText("Load Game");
        BoardGameMenuItemLoadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoardGameMenuItemLoadGameActionPerformed(evt);
            }
        });
        GameBoardMenuFile.add(BoardGameMenuItemLoadGame);

        BoardGameMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        BoardGameMenuItemExit.setText("Exit");
        BoardGameMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoardGameMenuItemExitActionPerformed(evt);
            }
        });
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Player2JPanle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Player1JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BoardGameSaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BoardGameUndoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(BoardGameUndoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(BoardGameSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Player1JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Player2JPanle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PlayingBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
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
                Cell cell = new Cell(game, row, col);
                cell.setBackground(Color.green);
                cell.setPreferredSize(new Dimension(50, 50));
                
                box.fill = GridBagConstraints.HORIZONTAL;
                box.gridx = row;
                box.gridy = col;
                
                final int tmpRow = row + 1;
                final int tmpCol = col + 1;

                cell.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {                       
                        cellClicked(game, tmpRow, tmpCol);
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                    }
                });
                
                PlayingBoard.add(cell, box);
                cellList.add(cell);
                /*cell.setSize(70, 70);
                cell.setBackground(new Color(188, 222, 255));
                cell.setBorder(BorderFactory.createLineBorder(Color.gray));
                boardPanel.add(cell);*/
            }
        }
       
    }
        
    public void cellClicked(Game game, int row, int col)
    {
        Player currentPlayer = game.currentPlayer();
        if (game.getBoard().getField(row, col).getDisk() == null)
        {
            if (currentPlayer.canPutDisk(game.getBoard().getField(row, col)))
            {
                currentPlayer.putDisk(game.getBoard().getField(row, col));
                game.nextPlayer();
                game.countDicks();
                Player1Score.setText(String.valueOf(game.whiteDisks));
                Player2Score.setText(String.valueOf(game.blackDisks));
                checkWin(game.blackDisks,game.whiteDisks);
                Game gameToStack = new Game(game.getBoard());
                gameToStack.whichPlayer = game.whichPlayer;
                gameToStack.whitePlayer = game.whitePlayer;
                gameToStack.blackPlayer = game.blackPlayer;
                
                gameStack.push(gameToStack);
            }
        }
                        
        repaint();
    }
    
    // nemal som to kam jebnut, tak UNDO zatial bude testovat ci su fakt v strede tie kamene :D pre 8x8
    // 3:26 - fakt su :)
    private void BoardGameUndoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardGameUndoButtonMouseClicked
        gameStack.pop();
        this.game = (Game)gameStack.peek();
        System.out.println("d");
    }//GEN-LAST:event_BoardGameUndoButtonMouseClicked

    private void BoardGameMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoardGameMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BoardGameMenuItemExitActionPerformed

    private void BoardGameMenuItemNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoardGameMenuItemNewGameActionPerformed
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_BoardGameMenuItemNewGameActionPerformed

    private void BoardGameMenuItemLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoardGameMenuItemLoadGameActionPerformed
        
    }//GEN-LAST:event_BoardGameMenuItemLoadGameActionPerformed

    /*
     * counter the scores and return the winner
     */
    private void checkWin(int TotalBlack, int TotalWhite) {     
        if(TotalBlack + TotalWhite == (size*size) && TotalBlack > TotalWhite)
            JOptionPane.showMessageDialog(null,"Black Player Wins!");
        if(TotalBlack + TotalWhite == (size*size) && TotalWhite > TotalBlack)
            JOptionPane.showMessageDialog(null,"White Player Wins!");
        if(TotalBlack + TotalWhite == (size*size) && TotalWhite == TotalBlack)
            JOptionPane.showMessageDialog(null,"It's a Tie!");
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BoardGameMenuItemExit;
    private javax.swing.JMenuItem BoardGameMenuItemLoadGame;
    private javax.swing.JMenuItem BoardGameMenuItemNewGame;
    private javax.swing.JMenuItem BoardGameMenuItemSaveGame;
    private javax.swing.JButton BoardGameSaveButton;
    private javax.swing.JButton BoardGameUndoButton;
    private javax.swing.JMenuBar GameBoardMenuBar;
    private javax.swing.JMenu GameBoardMenuFile;
    private javax.swing.JPanel Player1JPanel;
    private javax.swing.JLabel Player1Name;
    private javax.swing.JLabel Player1Score;
    private javax.swing.JPanel Player2JPanle;
    private javax.swing.JLabel Player2Name;
    private javax.swing.JLabel Player2Score;
    private javax.swing.JPanel PlayingBoard;
    private javax.swing.JLabel Score1;
    private javax.swing.JLabel Score2;
    // End of variables declaration//GEN-END:variables
}
