import java.io.*;
import java.util.ArrayList;

public class FileManager {
    String path;
    public FileManager(String path){
        this.path = path;
    }

    public void writeArrToFile(int[] arr){
        try(FileWriter fWriter = new FileWriter(path)) {
            fWriter.write(arrToStrWithSpace(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String arrToStrWithSpace(int[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i : arr){
            stringBuilder.append(i).append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
    public int[] readArrFromFile(){
        String temp;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String[] stringArr = bufferedReader.readLine().split(" ");
            int[] tempArr = new int[stringArr.length];
            for(int i = 0; i < tempArr.length; i++){
                tempArr[i] = Integer.parseInt(stringArr[i]);
            }
            return tempArr;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void changeCharToSpace(char c){
        try(FileReader fileReader = new FileReader(path); FileWriter fileWriter = new FileWriter(insertWordInPath(path, "Changed"))) {
            int tempChar;
            while( (tempChar = fileReader.read())  != -1){
                fileWriter.append((char) tempChar == c ? ' ' : (char) tempChar);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File wasn't find");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String insertWordInPath(String where, String what) {
        int indexOfDot = where.indexOf('.');
        StringBuilder stringBuilder = new StringBuilder(where);
        stringBuilder.insert(indexOfDot, what);
        return stringBuilder.toString();
    }
}
