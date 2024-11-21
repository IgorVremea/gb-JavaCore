import java.io.*;

public class Task2 {
    private static final String PATH = "src/main/resources/tic-tack-toe.txt";

    public static void main(String[] args) {
        FileManager fileManagerTickTac = new FileManager(PATH);
        TickTacToe ttt = new TickTacToe(new int[][] {{1, 0, 2}, {0, 1, 0}, {2, 0, 1}});
        //////////////////////////////////////
        // Write to file
        System.out.println(ttt.getFiledInInt());
        fileManagerTickTac.writeString(Integer.toString(ttt.getFiledInInt()));

        //////////////////////////////////////

        //////////////////////////////////////
        // Read from file
//        fileManagerTickTac.writeString("2000");
//        try{
//            ttt.setFieldFromInt(fileManagerTickTac.readInt());
//        } catch (IOException e) {
//            System.out.println("Error read");
//            e.printStackTrace();
//        }
        //////////////////////////////////////

        ttt.showField();
    }
}
