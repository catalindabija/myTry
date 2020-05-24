package IOdemo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {

    public static void main(String[] args) {

        File myFile = new File("src/IOtask/newFile.txt");

        try {
            if (myFile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Path newFilePath = Paths.get("newFile.txt");
        System.out.println(newFilePath.toAbsolutePath());

//        try {
//            Files.createFile(newFilePath);
//        } catch (IOException e) {
//            System.out.println("File exists");
//        }


    }
}
