package fileio;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileHandling {

    public static void basicFileOperations() throws IOException {
        File file = new File("abc.txt");// file is a java object
        boolean isFileCreated = file.exists();// false
        file.createNewFile();// to create the file if it does not exist
//        boolean isFileCreated = file.exists();
        System.out.println(isFileCreated);
        long fileLength =   file.length();// returns number of characters including whitespaces
        System.out.println(fileLength);
    }
    // to count the number of files inside a directory
    public static void countFiles(){
        File fileObj = new File("C:\\Users\\Renu\\Desktop\\RBP010");
        String[] files = fileObj.list();
        int totalFiles = files.length;
        System.out.println(totalFiles);
    }

    public static  void countImages(){
        File fileObj = new File("D:\\WhatsappImages");
        String[] files = fileObj.list();
        int imgCount = 0;
        for(String fileName: files){
//            fileName.getByte
//            System.out.println(fileName);
            String[] strArr = fileName.split("\\.");// abc.txt
            System.out.println("strArr[0] " + strArr[0]);
            if (strArr.length > 1){
                String fileExtn = strArr[1];
                if (fileExtn.equals("jpg") || fileExtn.equals("jpeg")){
                    imgCount++;
                }
            }
        }
        System.out.println("Total images: " + imgCount);
        System.out.println(files.length);
    }
    public static void listInputConsole(){
//        Console console = System.console();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the arraylist");

        List<Integer> intList = new ArrayList<>();

        while(scanner.hasNextInt()){
            int num = scanner.nextInt();
            intList.add(num);
        }
        System.out.println(intList);
    }
    public static void listFiles(){
        File fileObj = new File("C:\\Users\\Renu\\Desktop\\RBP010");
        String[] files = fileObj.list();
        for (String fileName: files){
            System.out.print(fileName + "   ");
        }
    }

    public static void main(String[] args) throws IOException {
//        basicFileOperations();
        listInputConsole();
//        countFiles();
//        countImages();
//        listFiles();
    }
}
