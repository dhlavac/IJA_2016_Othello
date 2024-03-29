package othello;

import board.BoardField;
import board.Field;
import game.Cell;
import game.Game;
import game.Player;
import game.Save;
import game.Undo;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Trieda predstavujuca zobrazovanu hraciu plochu
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class GameBoard extends javax.swing.JFrame implements Runnable{

    public int size;
    Game game;
    JPanel boardPanel;
    List<Cell> cellList = new ArrayList<Cell>();
    Stack<Undo> gameStack = new Stack<Undo>();
    
    /**
     * Konstruktor vytvara samotnu hru aj s GUI
     * @param game Hra obsahujuca vsetky udaje
     */
    public GameBoard(Game game) {
        initComponents();
        this.size = game.getBoard().getSize();
        this.game = game;
        initializeGui();
        Player1Name.setText(game.whitePlayer.name);
        Player2Name.setText(game.blackPlayer.name);
    }

    
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
        ExitButton = new javax.swing.JButton();
        TurnPlayerLabel = new javax.swing.JLabel();
        TurnLabel = new javax.swing.JLabel();
        GameBoardMenuBar = new javax.swing.JMenuBar();
        GameBoardMenuFile = new javax.swing.JMenu();
        BoardGameMenuItemNewGame = new javax.swing.JMenuItem();
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

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.setPreferredSize(new java.awt.Dimension(100, 50));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        TurnPlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        TurnPlayerLabel.setText("White");

        TurnLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TurnLabel.setText("Turn :");

        GameBoardMenuFile.setText("File");

        BoardGameMenuItemNewGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        BoardGameMenuItemNewGame.setText("New Game");
        BoardGameMenuItemNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoardGameMenuItemNewGameActionPerformed(evt);
            }
        });
        GameBoardMenuFile.add(BoardGameMenuItemNewGame);

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
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BoardGameSaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BoardGameUndoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(TurnLabel)
                                .addGap(18, 18, 18)
                                .addComponent(TurnPlayerLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Player2JPanle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Player1JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(BoardGameUndoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(BoardGameSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Player1JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Player2JPanle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TurnPlayerLabel)
                            .addComponent(TurnLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PlayingBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoda ktora uklada aktualny stav hry
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void BoardGameSaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardGameSaveButtonMouseClicked
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

    /**
     * Inicializuje GUI
     */
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
            }
        }
       
    }
     
    /**
     * Metoda ktora hovori, co sa ma udiat po kliknuti na jedno policko
     * @param game aktualna hra
     * @param row riadok policka
     * @param col stlpec policka
     */
    public void cellClicked(Game game, int row, int col)
    {
        Player currentPlayer = game.currentPlayer();
        if (game.getBoard().getField(row, col).getDisk() == null) {
            if (currentPlayer.canPutDisk(game.getBoard().getField(row, col))) {
                currentPlayer.putDisk(game.getBoard().getField(row, col));
                game.nextPlayer();
                
                Undo undo = new Undo();
                undo.addedField = new BoardField(row, col);
                undo.turnedFields = new ArrayList<BoardField>();
                for (BoardField turnedField : currentPlayer.turnedFields)
                    undo.turnedFields.add(turnedField);
                
                currentPlayer.emptyList();
                gameStack.push(undo);
                
                
                if (game.PCplaying)
                    if (game.diffEasy) {
                        easyPC(game);
                    }
                    else {
                        hardPC(game);
                    }
                
                game.countDicks();
                Player1Score.setText(String.valueOf(game.whiteDisks));
                Player2Score.setText(String.valueOf(game.blackDisks));

                if (!game.whichPlayer) {
                    TurnPlayerLabel.setText("White");
                }
                else {
                    TurnPlayerLabel.setText("Black");
                }
                checkWin(game.blackDisks,game.whiteDisks);
                
            }
        }
                               
        repaint();
    }
    
    /**
     * Jednoduchy algoritmus, ktory zaradom prechadza policka a vlozi
     * disk na prve mozne policko
     * @param game aktualna hra
     */
    private void easyPC(Game game)
    {
        for (int i = 1; i <= size; i++)
            for (int j = 1; j <= size; j++)
                if (game.currentPlayer().canPutDisk(game.getBoard().getField(i, j)) && game.getBoard().getField(i, j).getDisk() == null)
                {
                    game.currentPlayer().putDisk(game.getBoard().getField(i, j));
                    
                    Undo undo = new Undo();
                    undo.addedField = new BoardField(i, j);
                    undo.turnedFields = new ArrayList<BoardField>();
                    for (BoardField turnedField : game.currentPlayer().turnedFields)
                        undo.turnedFields.add(turnedField);

                    game.currentPlayer().emptyList();
                    gameStack.push(undo);
                    
                    game.nextPlayer();
                    
                    return;
                }
        
        String msg = game.currentPlayer().name + " has no moves!";
        if (game.whiteDisks + game.blackDisks != size*size - 1) // keby nahodou posledny
            JOptionPane.showMessageDialog(null, msg);
        game.nextPlayer();
    }
    
    /**
     * Jednoduchy algoritmus, ktory vklada disk na nahodne mozne policko
     * @param game aktualna hra
     */
    private void hardPC(Game game)
    {
        List<Field> rightFields = new ArrayList<Field>();
        for (int i = 1; i <= size; i++)
            for (int j = 1; j <= size; j++)
                if (game.currentPlayer().canPutDisk(game.getBoard().getField(i, j)) && game.getBoard().getField(i, j).getDisk() == null)
                {
                    rightFields.add(game.getBoard().getField(i, j));
                }
        
        int size = rightFields.size();
        if (size > 0)
        {
            int randomNumber;
            Random rand = new Random();
            randomNumber = rand.nextInt(size);
            game.currentPlayer().putDisk(rightFields.get(randomNumber));
            
            Undo undo = new Undo();
            undo.addedField = new BoardField(rightFields.get(randomNumber).getRow(), rightFields.get(randomNumber).getCol());
            undo.turnedFields = new ArrayList<BoardField>();
            for (BoardField turnedField : game.currentPlayer().turnedFields)
                undo.turnedFields.add(turnedField);

            game.currentPlayer().emptyList();
            gameStack.push(undo);
                    
            game.nextPlayer();
                    
            return;
        }
        else
        {
            String msg = game.currentPlayer().name + " has no moves!";
            if (game.whiteDisks + game.blackDisks != this.size*this.size - 1) // keby nahodou posledny
                JOptionPane.showMessageDialog(null, msg);
            
            game.nextPlayer();
        }
    }
    
    /**
     * Metoda pre Undo
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void BoardGameUndoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoardGameUndoButtonMouseClicked
        if (game.PCplaying)
        {
            Undo undoPC = (Undo)gameStack.pop();
            game.getBoard().getField(undoPC.addedField.getRow(), undoPC.addedField.getCol()).deleteDisk();
            for (BoardField turnField : undoPC.turnedFields)
            {
                game.getBoard().getField(turnField.getRow(), turnField.getCol()).getDisk().turn();
            }
        }
        
        Undo undo = (Undo)gameStack.pop();
        game.getBoard().getField(undo.addedField.getRow(), undo.addedField.getCol()).deleteDisk();
        for (BoardField turnField : undo.turnedFields)
        {
            game.getBoard().getField(turnField.getRow(), turnField.getCol()).getDisk().turn();
        }
        
        if (!game.PCplaying)
            game.nextPlayer();
        
        game.countDicks();
        Player1Score.setText(String.valueOf(game.whiteDisks));
        Player2Score.setText(String.valueOf(game.blackDisks));
        
    }//GEN-LAST:event_BoardGameUndoButtonMouseClicked

    /**
     * Ukonci hru
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void BoardGameMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoardGameMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BoardGameMenuItemExitActionPerformed

    /**
     * Nova hra
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void BoardGameMenuItemNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoardGameMenuItemNewGameActionPerformed
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_BoardGameMenuItemNewGameActionPerformed

    /**
     * Ukonci hru
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    /**
     * Kontroluje koniec hry
     * @param TotalBlack pocet ciernych kamenov
     * @param TotalWhite pocet bielych kamenov
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
    private javax.swing.JMenuItem BoardGameMenuItemNewGame;
    private javax.swing.JButton BoardGameSaveButton;
    private javax.swing.JButton BoardGameUndoButton;
    private javax.swing.JButton ExitButton;
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
    private javax.swing.JLabel TurnLabel;
    private javax.swing.JLabel TurnPlayerLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
    }
}
