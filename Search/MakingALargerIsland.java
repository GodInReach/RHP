class Solution 
{
    int[][] diff = { {-1,0}, {1,0}, {0,-1}, {0,1} };

    void dfs(int row, int col, int r, int c, int[][]grid, boolean[][] vis, int count)
    {
        grid[r][c] = count;
        vis[r][c] = true;
        for(int i=0;i<4;i++)
        {
            int aR = r+diff[i][0];
            int aC = c+diff[i][1];

            if(aR >=0 && aR < row && aC >= 0 && aC < col && grid[aR][aC] == 1 && !vis[aR][aC])
                dfs(row,col,aR,aC,grid,vis,count);
        }
    }
    public int largestIsland(int[][] grid) 
    {
        int row = grid.length;
        int col = grid[0].length;

        boolean[][] vis = new boolean[row][col];
        int count = 0;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j] == 1 && !vis[i][j])
                {
                    dfs(row,col,i,j,grid,vis,++count);
                }
            }
        }

        int[] cellCount = new int[count+1];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int id = grid[i][j];
                if(id != 0)
                    cellCount[id]++;
            }
        }

        int maxSize = 0;
        for(int i=1;i<=count;i++)
            maxSize = Math.max(maxSize,cellCount[i]);

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(grid[i][j] == 0)
                {
                    Set<Integer> s = new HashSet<>();

                    for(int k=0;k<4;k++)
                    {
                        int aR = i+diff[k][0];
                        int aC = j+diff[k][1];
                        if(aR >=0 && aR < row && aC >= 0 && aC < col && grid[aR][aC] != 0)
                            s.add(grid[aR][aC]);
                    }
                
                    int size = 1;
                    for(int num:s)
                    {
                        size += cellCount[num];
                    }
                    maxSize = Math.max(maxSize,size);
                }
            }
        }
        return maxSize;
    }
}
