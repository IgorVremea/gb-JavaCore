import java.io.File;
import java.io.FileReader;

public class TickTacToe {
    private static final int FIELD_WIDTH = 3;
    private static final int FIELD_HEIGHT = 3;
    private int[][] field;
    public TickTacToe(){
        this.field = new int[FIELD_HEIGHT][FIELD_WIDTH];

    }
    public TickTacToe(int[][] field){
        this.field = field;
    }
    public int getFiledInInt(){
        int result = 0;
        int i = 1;
        while(i < 1_000_000_000){
            for(int y = FIELD_HEIGHT - 1; y >= 0; y--){
                for(int x = FIELD_WIDTH - 1; x >=0; x--){
                    result += field[y][x] * i;
                    i *= 10;
                }
            }
        }
        return result;
    }
    public void setFieldFromInt(int number){
        int[][] arr = new int[FIELD_HEIGHT][FIELD_WIDTH];
        int tempNum = number;
        while(tempNum > 0){
            for(int y = FIELD_HEIGHT - 1; y >= 0; y--){
                for(int x = FIELD_WIDTH - 1; x >= 0; x--){
                    arr[y][x] = tempNum % 10;
                    tempNum /= 10;
                }
            }
        }
        this.field = arr;
    }
    public void showField(){
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                System.out.print(field[y][x] + " ");
            }
            System.out.println();
        }
    }

}
