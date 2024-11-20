import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static final String PATH = "src/main/resources";
    public static void main(String[] args) {
        FileManager fileManager = new FileManager(PATH);
        System.out.println(Arrays.toString(fileManager.getDirFileList()));
//        fileManager.doBackup();
//        fileManager.deleteBackup();
    }
}
