class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<Pair>();
        if(grid.length < 0 || grid[0].length < 0)
            return 0;
        for(int i = 0 ; i < grid.length; i++)
        {    for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 2)
                    q.add(new Pair(i, j));
            }
        }
        
        q.add(new Pair(-999, -999));
        int count = 0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p.row == -999 )
            {   
                if(!q.isEmpty())
                {    
                    count++;
                    q.add(new Pair(-999, -999));
                }
            }
            System.out.println("Row col "+p.row+" "+p.col);
            if(addToQueue(p.row -1, p.col, q, grid))
                grid[p.row - 1][p.col] = 2;
             if(addToQueue(p.row, p.col - 1, q, grid))
                grid[p.row][p.col - 1] = 2;
            if(addToQueue(p.row + 1, p.col, q, grid))
                grid[p.row + 1][p.col] = 2;
             if(addToQueue(p.row, p.col + 1, q, grid))
                grid[p.row][p.col + 1] = 2;
        }
        
        for(int i = 0 ; i < grid.length; i++)
        {    for(int j = 0; j < grid[0].length; j++)
            {
                if(grid[i][j] == 1)
                    return -1;
            }
        }
        return count;
    }
    public Boolean addToQueue(int row, int col, Queue<Pair> q, int[][] grid){
    if(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == 1)
            {
                q.add(new Pair(row, col));
                return true;
            }
        return false;
    }
}

class Pair{
    int row;
    int col;
    public Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}