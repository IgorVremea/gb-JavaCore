public class Task1 {
    private static final String PATH = "src/main/resources";
    public static void main(String[] args) {
        FileManager fileManager = new FileManager(PATH);
//        fileManager.deleteBackup();
        fileManager.doBackup();
    }
}
