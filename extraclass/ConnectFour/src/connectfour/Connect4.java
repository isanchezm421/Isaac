package connectfour;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public final class Connect4 extends JFrame {

    private int size;
    private int playerOrder = 0;
    private int numberOfPlayer;
    private static int livingCellNumber = 0;

    
    private final JFrame frame;
    private final JPanel panel;
    private final JButton[][] buttons;
    private Celdas gameBoard[][];
    private final GridLayout grid;

    
    ImageIcon empty = new ImageIcon(getClass().getResource("/resources/emptycell.png"));
    ImageIcon player1 = new ImageIcon(getClass().getResource("/resources/player1.png"));
    ImageIcon player2 = new ImageIcon(getClass().getResource("/resources/player2.png"));

    public static void main(String[] args) {
        Connect4 game = new Connect4();
    }

    public Connect4() {
        frame = new JFrame("Connect Four Game");
        panel = new JPanel();

        playerNumberAndBoardSize();
        dynamicAllocation();

        buttons = new JButton[getBoardSize()][getBoardSize()];
        grid = new GridLayout(getBoardSize(), getBoardSize());
        panel.setLayout(grid);

        initialBoard();

        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setBoardSize(int newSize) {
        size = newSize;
    }

    public int getBoardSize() {
        return size;
    }

    public static int numberOfLivingCells() {
        return livingCellNumber;
    }

    public void playerNumberAndBoardSize() {
        String playerNumber = JOptionPane.showInputDialog("Número de jugadores (1 o 2)");
        String boardSize = JOptionPane.showInputDialog("Tamaño del tablero de juego");

        numberOfPlayer = Integer.parseInt(playerNumber);
        int sizeOfBoard = Integer.parseInt(boardSize);

        if (sizeOfBoard < 4) {
            JFrame frameInputError = new JFrame();
            JOptionPane.showMessageDialog(frameInputError,
                    "El tamaño del tablero debe ser mayor que 4  !!",
                    "Error de tamaño del tablero",
                    JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        setBoardSize(sizeOfBoard);
    }

    public void dynamicAllocation() {
        gameBoard = new Celdas[getBoardSize()][getBoardSize()];
        for (int i = 0; i < getBoardSize(); i++) {
            for (int j = 0; j < getBoardSize(); j++) {
                gameBoard[i][j] = new Celdas();
            }
        }
    }

    public void addButtonsToBoard() {
        for (int i = 0; i < getBoardSize(); ++i) {
            for (int j = 0; j < getBoardSize(); ++j) {
                buttons[i][j] = new JButton(empty);

                if (numberOfPlayer == 1) {
                    buttons[i][j].addActionListener(new listenButtonOnePlayer());
                }

                if (numberOfPlayer == 2) {
                    buttons[i][j].addActionListener(new listenButtonTwoPlayers());
                }

                panel.add(buttons[i][j]);
            }
        }
    }

    public void initialBoard() {
        for (int i = getBoardSize() - 2; i >= 0; --i) {
            for (int j = getBoardSize() - 1; j >= 0; --j) {
                gameBoard[i][j].setCellState(-99);
            }
        }
        addButtonsToBoard();
    }

    public void jugadorganador(int ganador) {
        for (int i = 0; i < getBoardSize(); ++i) {
            for (int j = 0; j < getBoardSize(); ++j) {
                if (gameBoard[i][j].getCellState() == ganador) {
                    if (i + 3 < getBoardSize()) {
                        if (gameBoard[i + 1][j].getCellState() == ganador && gameBoard[i + 2][j].getCellState() == ganador && gameBoard[i + 3][j].getCellState() == ganador) {
                            if (ganador == 1) {
                                showResult(1);
                            } else {
                                showResult(2);
                            }
                        }
                    }
                    if (j + 3 < getBoardSize()) {
                        if (gameBoard[i][j + 1].getCellState() == ganador && gameBoard[i][j + 2].getCellState() == ganador && gameBoard[i][j + 3].getCellState() == ganador) {
                            if (ganador == 1) {
                                showResult(1);
                            } else {
                                showResult(2);
                            }
                        }
                    }

                    if (i < getBoardSize() - 3 && j < getBoardSize() - 3) {
                        if (gameBoard[i + 1][j + 1].getCellState() == ganador && gameBoard[i + 2][j + 2].getCellState() == ganador && gameBoard[i + 3][j + 3].getCellState() == ganador) {
                            if (ganador == 1) {
                                showResult(1);
                            } else {
                                showResult(2);
                            }
                        }
                    }

                    if (i < getBoardSize() - 3 && j - 3 >= 0) {
                        if (gameBoard[i + 1][j - 1].getCellState() == ganador && gameBoard[i + 2][j - 2].getCellState() == ganador && gameBoard[i + 3][j - 3].getCellState() == ganador) {
                            if (ganador == 1) {
                                showResult(1);
                            } else {
                                showResult(2);
                            }
                        }
                    }
                }
            }
        }
    }

    public void showResult(int jugadorganador) {
        JFrame frameShowResult = new JFrame();
        if (jugadorganador == 1) {
            JOptionPane.showMessageDialog(frameShowResult,
                    "\nganador : jugador 1\n\nEl nuevo juego comenzará.\n\n",
                    "Fin del juego",
                    JOptionPane.INFORMATION_MESSAGE);
            startAgain();
        } else {
            JOptionPane.showMessageDialog(frameShowResult,
                    "\nganador : Jugador 2\n\nEl nuevo juego comenzará.\n\n",
                    "Fin del juego",
                    JOptionPane.INFORMATION_MESSAGE);
            startAgain();
        }
    }

    public void startAgain() {

        for (int i = 0; i < getBoardSize(); ++i) {
            for (int j = 0; j < getBoardSize(); ++j) {
                gameBoard[i][j].setCellState(-99);
                buttons[i][j].setIcon(empty);
            }
        }

        frame.setVisible(false);
        Connect4 newGame = new Connect4();
    }

    private class listenButtonOnePlayer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                for (int i = getBoardSize() - 1; i >= 0; --i) {
                    for (int j = 0; j <= getBoardSize() - 1; ++j) {
                        if (buttons[i][j] == e.getSource()) {

                            if (0 == playerOrder % 2) {
                                for (int k = 0; k <= getBoardSize(); ++i) {
                                    if (gameBoard[i - k][j].getCellState() == 0) {
                                        buttons[i - k][j].setIcon(player1);
                                        gameBoard[i - k][j].setAllPosition('X', i);
                                        gameBoard[i - k][j].setCellState(1);
                                        ++livingCellNumber;
                                        jugadorganador(1);
                                        break;
                                    }
                                }

                                setUpperCellToEmpty(i, j);
                                System.out.println("Turno del jugador ficha roja jugado, es el turno del ordenador ficha azul");
                                ++playerOrder;
                                break;
                            }

                            if (1 == playerOrder % 2) {
                                moveComputer(i);
                                System.out.println("Turno del Ordenador ficha azul jugado, es el turno del jugador ficha roja");
                                ++playerOrder;
                                break;
                            } else {
                                warningMessage();
                            }
                        }
                    }
                }

            } catch (Exception ex) {
                warningMessage();
            }
        }

    }

    public void warningMessage() {
        JFrame frameWarning = new JFrame();
        JOptionPane.showMessageDialog(frameWarning,
                "Invalid Movement !!\nThe cell is not empty.", "Warning",
                JOptionPane.WARNING_MESSAGE);
    }

    public void setUpperCellToEmpty(int rowPos, int columnPos) {
        try {
            gameBoard[rowPos - 1][columnPos].setCellState(0);
        } catch (Exception ex) {
        }
    }

    public void moveComputer(int rowPosition) {
        int l, m;
        boolean flag = false;

        for (l = getBoardSize() - 1; (l >= 0) && !flag; --l) {
            for (m = 0; (m < getBoardSize()) && !flag; ++m) {
                if (gameBoard[l][m].getCellState() == 0) {
                    buttons[l][m].setIcon(player2);
                    gameBoard[l][m].setAllPosition('O', rowPosition);
                    gameBoard[l][m].setCellState(2);
                    ++livingCellNumber;
                    jugadorganador(2);
                    flag = true;
                    setUpperCellToEmpty(l, m);
                }
            }
        }
    }

    private class listenButtonTwoPlayers implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int eventFlag = 0;
                int flagPlayerOrder = 0;

                for (int i = getBoardSize() - 1; i >= 0; --i) {
                    for (int j = 0; j <= getBoardSize() - 1; ++j) {
                        if (eventFlag == 0 && buttons[i][j] == e.getSource()) {
                            if (flagPlayerOrder == 0 && playerOrder % 2 == 0) {

                                for (int k = 0; k <= getBoardSize(); ++i) {
                                    if (gameBoard[i - k][j].getCellState() == 0 && playerOrder % 2 == 0) {
                                        buttons[i - k][j].setIcon(player1);
                                        gameBoard[i - k][j].setAllPosition('X', i);
                                        gameBoard[i - k][j].setCellState(1);
                                        ++livingCellNumber;
                                        jugadorganador(1);
                                        flagPlayerOrder = 1;
                                        eventFlag = 1;
                                        break;
                                    }
                                }

                                setUpperCellToEmpty(i, j);
                                System.out.println("Turno del Jugador1 ficha roja jugado, es el turno del jugador2 ficha azul");
                                ++playerOrder;
                                break;
                            }

                            if (flagPlayerOrder == 0 && playerOrder % 2 == 1) {
                                for (int k = 0; k <= getBoardSize(); ++i) {
                                    if (gameBoard[i - k][j].getCellState() == 0 && playerOrder % 2 == 1) {
                                        buttons[i - k][j].setIcon(player2);
                                        gameBoard[i - k][j].setAllPosition('O', i);
                                        gameBoard[i - k][j].setCellState(2);
                                        ++livingCellNumber;
                                        jugadorganador(2);
                                        flagPlayerOrder = 1;
                                        eventFlag = 1;
                                        break;
                                    }
                                }
                                setUpperCellToEmpty(i, j);
                                System.out.println("Turno del Jugador2 ficha azul jugado, es el turno del jugador1 ficha roja");
                                ++playerOrder;
                                break;
                            }
                        }
                    }
                }
            } catch (Exception ex) {
                warningMessage();
            }

        }
    }
}
