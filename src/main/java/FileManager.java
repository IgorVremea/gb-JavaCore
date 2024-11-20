import java.io.*;

public class FileManager {
    private static final String BACKUP_PATH = "./backup";
    private String path;
    public FileManager(String path){
        this.path = path;
    }
    public boolean isDir(){
        File file = new File(path);
        return file.isDirectory();
    }
    public String[] getDirFileList(){
        File file = new File(path);
        return file.list();
    }
    public void doBackup() {
        File file = new File(BACKUP_PATH);
        file.mkdir();
        for(String path : getDirFileList()){
            if(path.indexOf('.')!=-1){
                try(FileWriter fileWriter = new FileWriter(BACKUP_PATH + "/" + path); FileReader fileReader = new FileReader(this.path + "/" + path)) {
                    int intIn;
                    while( (intIn = fileReader.read()) != -1){
                        fileWriter.append((char)intIn);
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
    public void deleteBackup(){
        deleteDirRecurs(BACKUP_PATH);
    }

    public void deleteDirRecurs(String backupPath) {
        File file = new File(backupPath);
        File[] children = file.listFiles();
        if ((children == null) || (file.isFile())){
            file.delete();
        } else {
            for(File child : children){
                deleteDirRecurs(child.getPath());
            }
        }
        file.delete();
    }


}
