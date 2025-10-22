package se.team.minesweeper;

public class Game {
    private Board board;
    private Player player;
    private boolean isGameOver = false;

    public void startGame() {
        System.out.println("Startar spelet!");
        board = new Board(6, 6, 5);
        board.initializeBoard();
        board.displayBoard();
    }

    public void playTurn() {}
    public void checkWin() {}
    public void endGame() {}
}
