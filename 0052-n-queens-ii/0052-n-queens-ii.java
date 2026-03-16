class Solution {
    private int count = 0; // Class-level variable to track solutions

    public int totalNQueens(int n) {
        count = 0; // Reset for each call
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        place(board, 0);
        return count;
    }

    public void place(char[][] board, int row) {
        // Base case: If we reached the end, we found 1 valid solution
        if (row == board.length) {
            count++;
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                place(board, row + 1);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            // Check column
            if (board[i][col] == 'Q') return false;
            
            // Check diagonals using the math logic from your original code
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    if (Math.abs(row - i) == Math.abs(col - j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}