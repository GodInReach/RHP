public class RotatingOrranges {

    final int[][] diff = {{0,-1},{-1,0},{0,1},{1,0}};
    
    public void bfs(int[] pair, int[][] grid, Queue<int[]> que){
        for(int i = 0; i<4; i++){
            int adjR = pair[0] + diff[i][0];
            int adjC = pair[1] + diff[i][1];
            if(adjR<grid.length && adjC<grid[0].length && adjR>=0 && adjC>=0 && (grid[adjR][adjC]==1)){
                que.offer(new int[] {adjR,adjC});
                grid[adjR][adjC]=0;
            }
        }
    }

    public int new int[] {i,j});
                    grid[i][j]=0;
                }
            }
        }
        int mins = 0;
        while(!que.isEmpty()){
            int siz = que.size();
            for(int i = 0; i<siz; i++){
                int[] pair = que.poll();
                bfs(pair,grid,que);
                toto--;
            }
            if(!que.isEmpty()){
                mins++;
            }
        }
        if(toto>0){
            return -1;   
        }
        return mins;
    }
}