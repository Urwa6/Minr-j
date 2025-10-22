package se.team.minesweeper;

public class Board {
    private int rows;
    private int cols;
    private int mineCount;
    private Cell[][] cells;

    public Board(int rows, int cols, int mineCount) {
        this.rows = rows;
        this.cols = cols;
        this.mineCount = mineCount;
    }

    public void initializeBoard() {}
    public void placeMines() {}
    public void calculateAdjacentMines() {}
    public void revealCell(int row, int col) {}
    public boolean isMine(int row, int col) { return false; }
    public void displayBoard() {}
}
