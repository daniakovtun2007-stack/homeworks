import java.io.File;

public class Main22 {
    public static void main(String[] args) {
        File folder = new File(".");
        System.out.println(countFiles(folder, "Collections"));
        System.out.println(countFiles(folder, "Collections"));
    }
    public static boolean checkTxt(File file, String[] svg) {
        String fileName = file.getName();
        for (int i = 0; i < svg.length; i++) {
            if (fileName.endsWith(svg[i])) {
                return true;
            }
        }
        return false;
    }
    public static long countFiles(File folder, String... svg) {
        long count = 0;
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile() && checkTxt(files[i], svg)) {
                count++;
            }
        }
        return count;
    }
    public static long calculateFolderFileSize(File folder) {
        long size = 0;
        File[] files = folder.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                size += files[i].length();
            }
        }
        return size;
    }
}
