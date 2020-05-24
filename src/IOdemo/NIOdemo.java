package IOdemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOdemo {

    public static void main(String[] args) throws IOException {
        Path fileIn = Paths.get("src/IOtask/nioInputFile.txt");
        Path fileOut = Paths.get("src/IOtask/nioOutputFile.txt");



//            Files.copy(fileIn, fileOut);
        Files.createDirectory(Paths.get("testDirectory"));


    }
}
