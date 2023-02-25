public class GenerateMaze {
    public int[][] generate(int height, int width){
                int[][] maze =
                {{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                        {-1, 0, 0, 0, 0, 0, 0, 0, 0, -1},
                        {-1, 0, -1, -1, -1, -1, 0, 0, 0, -1},
                        {-1, 0, 0, 0, -1, 0, 0, 0, 0, -1},
                        {-1, 0, 0, 0, -1, 0, 0, 0, 0, -1},
                        {-1, 0, 0, 0, -1, 0, 0, 0, 0, -1},
                        {-1, 0, -1, -1, -1, -1, -1, -1, 0, -1},
                        {-1, 0, 0, 0, -1, 0, 0, 0, 0, -1},
                        {-1, 0, 0, 0, 0, 0, 0, 0, 0, -1},
                        {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}};

        return maze;
    }
}