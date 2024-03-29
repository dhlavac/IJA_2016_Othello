package othello;

import board.Board;
import game.Game;
import game.Player;
import game.ReversiRules;
import game.Save;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Trieda predstavujuca uvodne menu
 * @author Michal Durista (xduris04)
 * @author Dominik Hlavac Duran (xhlava42)
 */
public class NewJFrame extends javax.swing.JFrame implements Runnable{

    public String player1name, player2name;
    String loadedFile;
    
    /**
     * Konstruktor
     */
    public NewJFrame() {
        initComponents();
        DifficultyLabel.setVisible(false);
        DifficultyRadioButtonEasy.setVisible(false);
        DifficultyRadioButtonHard.setVisible(false);
        NumberOfFreezingStonesLabel.setVisible(false);
        NumberOfStonesSpinner.setVisible(false);
        FreezinfIntervaBLabel.setVisible(false);
        FreezinfIntervalSpinnerB.setVisible(false);
        FreezingIntervalILabel.setVisible(false);
        FreezingIntervalSpinnerI.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioButtonGroupBoardSize = new javax.swing.ButtonGroup();
        RadioButtonGroupPlayerSelect = new javax.swing.ButtonGroup();
        RadioButtonGroupPlayerColor = new javax.swing.ButtonGroup();
        FileLoadWindow = new javax.swing.JFileChooser();
        RadioButtonGroupDifficulty = new javax.swing.ButtonGroup();
        StartMenu = new javax.swing.JPanel();
        NewGameButton = new javax.swing.JButton();
        GameName = new javax.swing.JLabel();
        LoadGameButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        NewGameMenu = new javax.swing.JPanel();
        BoardSizeLabel = new javax.swing.JLabel();
        PlayButton = new javax.swing.JButton();
        RadioButtonSize6 = new javax.swing.JRadioButton();
        RadioButtonSize8 = new javax.swing.JRadioButton();
        RadioButtonSize10 = new javax.swing.JRadioButton();
        RadioButtonSize12 = new javax.swing.JRadioButton();
        ChosePlayerLabel = new javax.swing.JLabel();
        PlayerComputer = new javax.swing.JRadioButton();
        PlayerHuman = new javax.swing.JRadioButton();
        Player1Name = new javax.swing.JTextField();
        Player1NameLabel = new javax.swing.JLabel();
        Player2NameLabel = new javax.swing.JLabel();
        Player2Name = new javax.swing.JTextField();
        StoneFreezingLabel = new javax.swing.JLabel();
        FreezingStoneCheckBox = new javax.swing.JCheckBox();
        DifficultyLabel = new javax.swing.JLabel();
        DifficultyRadioButtonEasy = new javax.swing.JRadioButton();
        DifficultyRadioButtonHard = new javax.swing.JRadioButton();
        NumberOfFreezingStonesLabel = new javax.swing.JLabel();
        NumberOfStonesSpinner = new javax.swing.JSpinner();
        FreezingIntervalILabel = new javax.swing.JLabel();
        FreezingIntervalSpinnerI = new javax.swing.JSpinner();
        FreezinfIntervaBLabel = new javax.swing.JLabel();
        FreezinfIntervalSpinnerB = new javax.swing.JSpinner();
        LoadMenu = new javax.swing.JPanel();
        LoadFileLabel = new javax.swing.JLabel();
        LoadButton = new javax.swing.JButton();
        FileToLoad = new javax.swing.JTextField();
        MenuBar = new javax.swing.JMenuBar();
        MenuNewGame = new javax.swing.JMenu();
        MenuItemNewGame = new javax.swing.JMenuItem();
        MenuItemLoad = new javax.swing.JMenuItem();
        MenuItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        NewGameButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        NewGameButton.setText("New Game");
        NewGameButton.setMaximumSize(new java.awt.Dimension(80, 25));
        NewGameButton.setMinimumSize(new java.awt.Dimension(80, 25));
        NewGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameButtonActionPerformed(evt);
            }
        });

        GameName.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        GameName.setText("Othello");

        LoadGameButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LoadGameButton.setText("Load Game");
        LoadGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadGameButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StartMenuLayout = new javax.swing.GroupLayout(StartMenu);
        StartMenu.setLayout(StartMenuLayout);
        StartMenuLayout.setHorizontalGroup(
            StartMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartMenuLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(StartMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoadGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GameName))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        StartMenuLayout.setVerticalGroup(
            StartMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StartMenuLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(GameName)
                .addGap(96, 96, 96)
                .addComponent(NewGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(LoadGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
        );

        getContentPane().add(StartMenu, "card2");

        BoardSizeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BoardSizeLabel.setText("Board size");

        PlayButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PlayButton.setText("Play");
        PlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayButtonActionPerformed(evt);
            }
        });

        RadioButtonGroupBoardSize.add(RadioButtonSize6);
        RadioButtonSize6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        RadioButtonSize6.setText("6");

        RadioButtonGroupBoardSize.add(RadioButtonSize8);
        RadioButtonSize8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        RadioButtonSize8.setSelected(true);
        RadioButtonSize8.setText("8");

        RadioButtonGroupBoardSize.add(RadioButtonSize10);
        RadioButtonSize10.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        RadioButtonSize10.setText("10");

        RadioButtonGroupBoardSize.add(RadioButtonSize12);
        RadioButtonSize12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        RadioButtonSize12.setText("12");

        ChosePlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChosePlayerLabel.setText("Oponnent player");

        RadioButtonGroupPlayerSelect.add(PlayerComputer);
        PlayerComputer.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        PlayerComputer.setText("Computer");
        PlayerComputer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerComputerActionPerformed(evt);
            }
        });

        RadioButtonGroupPlayerSelect.add(PlayerHuman);
        PlayerHuman.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        PlayerHuman.setSelected(true);
        PlayerHuman.setText("Player");
        PlayerHuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerHumanActionPerformed(evt);
            }
        });

        Player1Name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Player1Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Player1Name.setText("Player  1");

        Player1NameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Player1NameLabel.setText("Player 1");

        Player2NameLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Player2NameLabel.setText("Player 2");

        Player2Name.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Player2Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Player2Name.setText("Player 2");

        StoneFreezingLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        StoneFreezingLabel.setText("Freezing stones");

        FreezingStoneCheckBox.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        FreezingStoneCheckBox.setText("On");
        FreezingStoneCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FreezingStoneCheckBoxActionPerformed(evt);
            }
        });

        DifficultyLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        DifficultyLabel.setText("Difficulty");
        DifficultyLabel.setOpaque(true);

        RadioButtonGroupDifficulty.add(DifficultyRadioButtonEasy);
        DifficultyRadioButtonEasy.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        DifficultyRadioButtonEasy.setSelected(true);
        DifficultyRadioButtonEasy.setText("Easy");

        RadioButtonGroupDifficulty.add(DifficultyRadioButtonHard);
        DifficultyRadioButtonHard.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        DifficultyRadioButtonHard.setText("Hard");

        NumberOfFreezingStonesLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        NumberOfFreezingStonesLabel.setText("How much stones");

        NumberOfStonesSpinner.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        NumberOfStonesSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        FreezingIntervalILabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        FreezingIntervalILabel.setText("Maximal time to start freezing");

        FreezingIntervalSpinnerI.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        FreezingIntervalSpinnerI.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        FreezinfIntervaBLabel.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        FreezinfIntervaBLabel.setText("Maximal tim of freezing");

        FreezinfIntervalSpinnerB.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        FreezinfIntervalSpinnerB.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout NewGameMenuLayout = new javax.swing.GroupLayout(NewGameMenu);
        NewGameMenu.setLayout(NewGameMenuLayout);
        NewGameMenuLayout.setHorizontalGroup(
            NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewGameMenuLayout.createSequentialGroup()
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(NewGameMenuLayout.createSequentialGroup()
                            .addGap(67, 67, 67)
                            .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(NewGameMenuLayout.createSequentialGroup()
                                    .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BoardSizeLabel)
                                        .addComponent(ChosePlayerLabel)
                                        .addComponent(DifficultyLabel))
                                    .addGap(19, 19, 19)
                                    .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(NewGameMenuLayout.createSequentialGroup()
                                            .addComponent(RadioButtonSize6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(RadioButtonSize8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(RadioButtonSize10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(RadioButtonSize12))
                                        .addGroup(NewGameMenuLayout.createSequentialGroup()
                                            .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PlayerComputer)
                                                .addComponent(DifficultyRadioButtonEasy))
                                            .addGap(18, 18, 18)
                                            .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(DifficultyRadioButtonHard)
                                                .addComponent(PlayerHuman)))))
                                .addGroup(NewGameMenuLayout.createSequentialGroup()
                                    .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Player1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(NewGameMenuLayout.createSequentialGroup()
                                            .addGap(36, 36, 36)
                                            .addComponent(Player1NameLabel)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Player2Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NewGameMenuLayout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(Player2NameLabel))))
                                .addComponent(StoneFreezingLabel, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(NewGameMenuLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FreezinfIntervaBLabel)
                                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FreezingIntervalILabel)
                                    .addGroup(NewGameMenuLayout.createSequentialGroup()
                                        .addComponent(NumberOfFreezingStonesLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(FreezingStoneCheckBox)
                                            .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FreezingIntervalSpinnerI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(NumberOfStonesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(FreezinfIntervalSpinnerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(36, 36, 36))))))
                    .addGroup(NewGameMenuLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        NewGameMenuLayout.setVerticalGroup(
            NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewGameMenuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoardSizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioButtonSize6)
                    .addComponent(RadioButtonSize8)
                    .addComponent(RadioButtonSize10)
                    .addComponent(RadioButtonSize12))
                .addGap(44, 44, 44)
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChosePlayerLabel)
                    .addComponent(PlayerComputer)
                    .addComponent(PlayerHuman))
                .addGap(24, 24, 24)
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DifficultyLabel)
                    .addComponent(DifficultyRadioButtonEasy)
                    .addComponent(DifficultyRadioButtonHard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1NameLabel)
                    .addComponent(Player2NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Player1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StoneFreezingLabel)
                    .addComponent(FreezingStoneCheckBox))
                .addGap(18, 18, 18)
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfFreezingStonesLabel)
                    .addComponent(NumberOfStonesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FreezingIntervalILabel)
                    .addComponent(FreezingIntervalSpinnerI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(NewGameMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FreezinfIntervaBLabel)
                    .addComponent(FreezinfIntervalSpinnerB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(NewGameMenu, "card3");

        LoadFileLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoadFileLabel.setText("Choose file to load");

        LoadButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoadButton.setText("Load");
        LoadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoadButtonMouseClicked(evt);
            }
        });

        FileToLoad.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        FileToLoad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FileToLoad.setText("Click to choose file");
        FileToLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FileToLoadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoadMenuLayout = new javax.swing.GroupLayout(LoadMenu);
        LoadMenu.setLayout(LoadMenuLayout);
        LoadMenuLayout.setHorizontalGroup(
            LoadMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoadMenuLayout.createSequentialGroup()
                .addGroup(LoadMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoadMenuLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(LoadFileLabel))
                    .addGroup(LoadMenuLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(FileToLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoadMenuLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        LoadMenuLayout.setVerticalGroup(
            LoadMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoadMenuLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(LoadFileLabel)
                .addGap(93, 93, 93)
                .addComponent(FileToLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        getContentPane().add(LoadMenu, "card4");

        MenuNewGame.setText("File");

        MenuItemNewGame.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MenuItemNewGame.setText("New Game");
        MenuItemNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNewGameActionPerformed(evt);
            }
        });
        MenuNewGame.add(MenuItemNewGame);

        MenuItemLoad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MenuItemLoad.setText("Load Game");
        MenuItemLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLoadActionPerformed(evt);
            }
        });
        MenuNewGame.add(MenuItemLoad);

        MenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MenuItemExit.setText("Exit");
        MenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemExitActionPerformed(evt);
            }
        });
        MenuNewGame.add(MenuItemExit);

        MenuBar.add(MenuNewGame);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Nova hra
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void NewGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameButtonActionPerformed
        NewGameMenu.setVisible(true);
        StartMenu.setVisible(false);
    }//GEN-LAST:event_NewGameButtonActionPerformed

    /**
     * Nacitat hru
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void LoadGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadGameButtonActionPerformed
        LoadMenu.setVisible(true);
        StartMenu.setVisible(false);
    }//GEN-LAST:event_LoadGameButtonActionPerformed

    /**
     * Ukoncit hru
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    /**
     * Hra clovek
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void PlayerHumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerHumanActionPerformed
        if (PlayerHuman.isSelected()) {
            Player2Name.setEnabled(true);
            Player2Name.setText("Player 2");
            DifficultyLabel.setVisible(false);
            DifficultyRadioButtonEasy.setVisible(false);
            DifficultyRadioButtonHard.setVisible(false);
        }
    }//GEN-LAST:event_PlayerHumanActionPerformed

    /**
     * Hra pocitac
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void PlayerComputerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerComputerActionPerformed
        if (PlayerComputer.isSelected()) {
            Player2Name.setEnabled(false);
            Player2Name.setText("Computer");
            DifficultyLabel.setVisible(true);
            DifficultyRadioButtonEasy.setVisible(true);
            DifficultyRadioButtonHard.setVisible(true);
        }
    }//GEN-LAST:event_PlayerComputerActionPerformed

    /**
     * Ukonci hru
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void MenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuItemExitActionPerformed

    /**
     * Nacita hru
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void MenuItemLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLoadActionPerformed
        NewGameMenu.setVisible(false);
        StartMenu.setVisible(false);
        LoadMenu.setVisible(true);
    }//GEN-LAST:event_MenuItemLoadActionPerformed

    /**
     * Nova hra
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void MenuItemNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNewGameActionPerformed
        NewGameMenu.setVisible(true);
        StartMenu.setVisible(false);
        LoadMenu.setVisible(false);
    }//GEN-LAST:event_MenuItemNewGameActionPerformed

    /**
     * Spusti novu hru
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void PlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayButtonActionPerformed
        if ((PlayerComputer.isSelected() || PlayerHuman.isSelected()) && (!Player1Name.getText().equals("") && !Player2Name.getText().equals("") ) ) {
            
            close();
            player1name = Player1Name.getText();
            player2name = Player2Name.getText();
            ReversiRules rules = new ReversiRules(getSizeForBoard());
            Board board = new Board(rules);
            Game game = new Game(board);
            
            Player player1 = new Player(true);  // biely     
            Player player2 = new Player(false);  // cierny
            
            player1.init(board);
            player2.init(board);
            player1.name = player1name;
            player2.name = player2name;

            game.addPlayer(player1);
            game.addPlayer(player2);
            
            if (PlayerComputer.isSelected())
            {
                game.PCplaying = true;
                if (DifficultyRadioButtonHard.isSelected())
                    game.diffEasy = false;
            }

            GameBoard NewBoard = new GameBoard(game);
            NewBoard.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Error you must choose all options");
        }
        
    }//GEN-LAST:event_PlayButtonActionPerformed
    
    /**
     * Save ktory chceme nacitat
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void FileToLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FileToLoadMouseClicked
        JFileChooser LoadChooser = new JFileChooser();
        LoadChooser.showOpenDialog(null);
        File file = LoadChooser.getSelectedFile();
        String filename = file.getAbsolutePath();
        FileToLoad.setText(filename);
        this.loadedFile = filename;
    }//GEN-LAST:event_FileToLoadMouseClicked

    /**
     * Nacitanie ulozenej hry
     * @param evt Udalost napriklad kliknutie na tlacitko
     */
    private void LoadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadButtonMouseClicked
        Save loadedSave = null;
        close();
        
        try
        {
            FileInputStream fin = new FileInputStream(this.loadedFile);
            ObjectInputStream ois = new ObjectInputStream(fin);
            loadedSave = (Save)ois.readObject();
            ois.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        Game loadedGame = new Game(loadedSave.board);
        loadedGame.whitePlayer = loadedSave.whitePlayer;
        loadedGame.whichPlayer = loadedSave.whichPlayer;
        loadedGame.blackPlayer = loadedSave.blackPlayer;
        loadedGame.PCplaying = loadedSave.PCplaying;
        loadedGame.diffEasy = loadedSave.diffEasy;
        loadedGame.board = new Board(loadedGame.board.getRules());
        
        for (int i = 0; i < loadedSave.board.getSize(); i++)
            for (int j = 0; j < loadedSave.board.getSize(); j++)
            {
                loadedGame.getBoard().getField(i + 1, j + 1).putDisk(loadedSave.fields[i][j].getDisk());
            }
        
        // System.out.println(loadedGame.tmp);
        GameBoard NewBoard = new GameBoard(loadedGame);    // tu posielas uz rovno nainicializovany game aj s kamenmi v strede
        NewBoard.setVisible(true);
        // System.out.println(loadedGame.tmp);  // test na load
    }//GEN-LAST:event_LoadButtonMouseClicked

    private void FreezingStoneCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FreezingStoneCheckBoxActionPerformed
        if (FreezingStoneCheckBox.isSelected()) {
            NumberOfFreezingStonesLabel.setVisible(true);
            NumberOfStonesSpinner.setVisible(true);
            FreezinfIntervaBLabel.setVisible(true);
            FreezinfIntervalSpinnerB.setVisible(true);
            FreezingIntervalILabel.setVisible(true);
            FreezingIntervalSpinnerI.setVisible(true);
        }
        else {
            NumberOfFreezingStonesLabel.setVisible(false);
            NumberOfStonesSpinner.setVisible(false);
            FreezinfIntervaBLabel.setVisible(false);
            FreezinfIntervalSpinnerB.setVisible(false);
            FreezingIntervalILabel.setVisible(false);
            FreezingIntervalSpinnerI.setVisible(false);
        }
    }//GEN-LAST:event_FreezingStoneCheckBoxActionPerformed

    /**
     * Zistenie zadanej velkosti hracej dosky
     * @return Vracia velkost hracej dosky ktoru zvoli uzivatel
     */
    private int getSizeForBoard()
    {
        if (RadioButtonSize6.isSelected())
            return 6;
        else if (RadioButtonSize8.isSelected())
            return 8;
        else if (RadioButtonSize10.isSelected())
            return 10;
        else if (RadioButtonSize12.isSelected())
            return 12;
        
        return 8;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                
            }
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BoardSizeLabel;
    private javax.swing.JLabel ChosePlayerLabel;
    private javax.swing.JLabel DifficultyLabel;
    private javax.swing.JRadioButton DifficultyRadioButtonEasy;
    private javax.swing.JRadioButton DifficultyRadioButtonHard;
    private javax.swing.JButton ExitButton;
    private javax.swing.JFileChooser FileLoadWindow;
    private javax.swing.JTextField FileToLoad;
    private javax.swing.JLabel FreezinfIntervaBLabel;
    private javax.swing.JSpinner FreezinfIntervalSpinnerB;
    private javax.swing.JLabel FreezingIntervalILabel;
    private javax.swing.JSpinner FreezingIntervalSpinnerI;
    private javax.swing.JCheckBox FreezingStoneCheckBox;
    private javax.swing.JLabel GameName;
    private javax.swing.JButton LoadButton;
    private javax.swing.JLabel LoadFileLabel;
    private javax.swing.JButton LoadGameButton;
    private javax.swing.JPanel LoadMenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MenuItemExit;
    private javax.swing.JMenuItem MenuItemLoad;
    private javax.swing.JMenuItem MenuItemNewGame;
    private javax.swing.JMenu MenuNewGame;
    private javax.swing.JButton NewGameButton;
    private javax.swing.JPanel NewGameMenu;
    private javax.swing.JLabel NumberOfFreezingStonesLabel;
    private javax.swing.JSpinner NumberOfStonesSpinner;
    private javax.swing.JButton PlayButton;
    private javax.swing.JTextField Player1Name;
    private javax.swing.JLabel Player1NameLabel;
    private javax.swing.JTextField Player2Name;
    private javax.swing.JLabel Player2NameLabel;
    private javax.swing.JRadioButton PlayerComputer;
    private javax.swing.JRadioButton PlayerHuman;
    private javax.swing.ButtonGroup RadioButtonGroupBoardSize;
    private javax.swing.ButtonGroup RadioButtonGroupDifficulty;
    private javax.swing.ButtonGroup RadioButtonGroupPlayerColor;
    private javax.swing.ButtonGroup RadioButtonGroupPlayerSelect;
    private javax.swing.JRadioButton RadioButtonSize10;
    private javax.swing.JRadioButton RadioButtonSize12;
    private javax.swing.JRadioButton RadioButtonSize6;
    private javax.swing.JRadioButton RadioButtonSize8;
    private javax.swing.JPanel StartMenu;
    private javax.swing.JLabel StoneFreezingLabel;
    // End of variables declaration//GEN-END:variables

    /**
     * Zavrie okno ktore sa aktualne pouziva
     */
    
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent( this, WindowEvent.WINDOW_CLOSING );
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent( winClosingEvent );
    }

    @Override
    public void run() {
    }     
}
