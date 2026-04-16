package day18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.*;

public class FileHandling {
    public static void main(String[] args) {
        try{
        File file = new File("./hi.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter("./hi.txt");
        writer.write("lorum1000");
        writer.close();
        FileReader reader = new FileReader("./hi.txt");
        String content = Files.readString(Path.of("./hi.txt"));
        System.out.println(content);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
