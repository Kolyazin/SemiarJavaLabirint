public class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEmpty(int[][] map){
        boolean answer = false;
        if (map[x][y] >= 0){
            answer = true;
        }
        return answer;
    }
}
