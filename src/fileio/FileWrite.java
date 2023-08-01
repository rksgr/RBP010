package fileio;

import java.io.*;
import java.util.Scanner;

public class FileWrite {
    public static void writeIntoFile() throws IOException {
        File file = new File("xyz.txt");
        FileWriter fileWriterObj = new FileWriter(file,true);
        fileWriterObj.write("\n Tomorrow is Sunday");
        fileWriterObj.flush();
    }
    public static void writeIntoFileUsingBuffer() throws IOException {
        File file = new File("mno.txt");
        Writer writerObj = new FileWriter(file, true);
        BufferedWriter bufferedWriterObj = new BufferedWriter(writerObj,24);// buffer size
//        bufferedWriterObj.write("Today is Saturday");
        bufferedWriterObj.newLine();
        bufferedWriterObj.write("Today is Moharram");
        bufferedWriterObj.flush();
    }
    public static void scannerInputs(){
        Scanner sc = new Scanner(System.in);

//        sc.n
    }

    public static void tryWithResources(){
        File file = new File("qq.txt");
        // try with resources

        try(FileWriter fileWriterObj = new FileWriter(file, true)){
            fileWriterObj.write("Debasmita");
            fileWriterObj.flush();
//            fileWriterObj.close();// redundant
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws IOException {
//        writeIntoFile();
//        writeIntoFileUsingBuffer();
        tryWithResources();
    }
}
