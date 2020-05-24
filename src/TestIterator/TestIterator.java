package TestIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

    public static void main(String[] args) {


        List<String> testList = new ArrayList<String>();
        testList.add("John");
        testList.add("William");
        testList.add("Andrew");
        testList.add("Sarah");



        Iterator<String>it = testList.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        for (String i : testList)
            System.out.printf("%s,  ", i);


    }
}
