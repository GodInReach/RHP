class WordSearch{

    final int[][] diff = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    
    public boolean dfs(char[][] board, boolean[][] visited, int R, int C, int row, int col, String s, int expected) {
        if(expected == s.length()) return true;
        visited[row][col] = true;
        for(int i = 0 ; i < 4 ; i++) {
            int adjR = row + diff[i][0];
            int adjC = col + diff[i][1];
            if(adjR < R && adjR >= 0 && adjC < C && adjC >= 0 && (!visited[adjR][adjC]) && (board[adjR][adjC] == s.charAt(expected))) {
                if(!dfs(board, visited, R, C, adjR, adjC, s, expected+1)) continue;
                return true;
            }
        }
        visited[row][col] = false;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int R = board.length;
        int C = board[0].length;
        boolean[][] visited = new boolean[R][C];
        for(int i = 0 ; i < R ; i++) {
            for(int j = 0 ; j < C ; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(!dfs(board, visited, R, C, i, j, word, 1)){
                        continue;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
