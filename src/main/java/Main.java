import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] arr = {-1, 2, 20, 34, -123, 888, 0};
        int[] arr;

        FileManager fileManager = new FileManager("src/main/resources/fileChangedtxt");
//        fileManager.writeArrToFile(arr);
//        arr = fileManager.readArrFromFile();
//        System.out.println(Arrays.toString(arr));

        fileManager.changeCharToSpace('o');
    }
}
