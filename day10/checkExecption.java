package day10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkExecption {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("Hope_B1.txt");
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
