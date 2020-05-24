package IOdemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter something bellow:");
        FileWriter out = new FileWriter("src/IOtask/outputFile.txt");
        out.write(in.nextLine());
        out.close();
    }

}
