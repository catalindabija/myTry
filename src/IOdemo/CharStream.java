package IOdemo;

import java.io.*;

public class CharStream {

    public static void main(String[] args) throws IOException {

        FileReader inFile = null;
        FileWriter outFile = null;

        try {
            inFile = new FileReader("src/IOtask/inputFile.txt");
            outFile = new FileWriter("src/IOtask/outputFile.txt");
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