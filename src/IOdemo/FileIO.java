package IOdemo;

import java.io.File;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) throws IOException {

        File file = new File("src/IOtask/myFile.txt");
        file.createNewFile();
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.delete());

    }
}
