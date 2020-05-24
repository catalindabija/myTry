package IOdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream inFile = null;
        FileOutputStream outFile = null;

        try {
            inFile = new FileInputStream("src/IOtask/inputFile.txt");
            outFile = new FileOutputStream("src/IOtask/outputFile.txt");
            int c;
            while ((c = inFile.read()) != 1) {
                outFile.write(c);
            }
        } catch (IOException e) {
            System.out.println("Requested file not found");
        } finally {
            if (inFile != null)
                inFile.close();
            if (outFile != null)
                outFile.close();
        }

    }
}
