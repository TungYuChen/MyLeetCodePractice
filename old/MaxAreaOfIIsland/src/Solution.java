import java.util.HashSet;

class Solution {

    HashSet<point> hs;

    private static class point {
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {

            point pt = (point) o;
            return pt.x == this.x && pt.y == this.y;




        }
        @Override
        public int hashCode() {
            final int prime = 13;
            int result = 1;
            result = prime * this.x + this.y;
            return result;
        }






    }

    public int maxAreaOfIsland(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int maxCount = 0;
        int number;




        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == 1) {
                    number = 0;
                    hs = new HashSet<>();
                    findingIsland(grid, i, j, false, false);
                    findingIsland(grid, i, j, false, true);
                    findingIsland(grid, i, j, true, false);
                    findingIsland(grid, i, j, true, true);
                    number = hs.size();
                    if (number > maxCount) {
                        maxCount = number;
                    }
                }

            }
        }

        return maxCount;


    }

    public void findingIsland(int[][] grid, int x, int y, boolean directionX, boolean directionY) {
        point pt = new point(x, y);
        hs.add(pt);
        if (x > 0 && !directionX) {
            if (grid[x - 1][y] == 1) {
                findingIsland(grid, x - 1, y, directionX, directionY);
            }
        }
        if (y > 0 && !directionY) {
            if (grid[x][y - 1] == 1) {
                findingIsland(grid, x, y - 1, directionX, directionY);
            }
        }

        if (x < grid.length - 1 && directionX) {
            if (grid[x + 1][y] == 1) {
                findingIsland(grid, x + 1, y, directionX, directionY);
            }
        }

        if (y < grid[0].length - 1 && directionY) {
            if (grid[x][y + 1] == 1) {
                findingIsland(grid,x ,y + 1, directionX, directionY);
            }
        }

    }



}