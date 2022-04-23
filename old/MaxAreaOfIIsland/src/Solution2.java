import java.util.HashSet;

class Solution2 {

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
                    findingIsland(grid, i, j);
                    findingIsland(grid, i, j);
                    findingIsland(grid, i, j);
                    findingIsland(grid, i, j);
                    number = hs.size();
                    if (number > maxCount) {
                        maxCount = number;
                        if (maxCount == x * y) return maxCount;
                        if (x * y - (i + 1) * (j + 1) < maxCount) return maxCount;
                    }
                }

            }
        }

        return maxCount;


    }

    public void findingIsland(int[][] grid, int x, int y) {
        point pt = new point(x, y);
        hs.add(pt);
        int size0 = hs.size();
        if (x > 0 && grid[x - 1][y] == 1) {

            hs.add(new point(x - 1, y));
            if (hs.size() > size0) {

                findingIsland(grid, x - 1, y);

            }
        }
        if (y > 0 && grid[x][y - 1] == 1) {

            hs.add(new point(x, y - 1));
            if (hs.size() > size0) {
                findingIsland(grid, x, y - 1);
            }


        }

        if (x < grid.length - 1 && grid[x + 1][y] == 1) {

            hs.add(new point(x + 1, y));
            if (hs.size() > size0) {

                findingIsland(grid, x + 1, y);
            }
        }

        if (y < grid[0].length - 1 && grid[x][y + 1] == 1) {

            hs.add(new point(x, y + 1));
            if (hs.size() > size0) {

                findingIsland(grid,x ,y + 1);
            }
        }

    }



}