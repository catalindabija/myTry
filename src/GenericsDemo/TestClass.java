package GenericsDemo;

public class TestClass {

//    // Daca vrem sa tratam eroarea:
//    try {
//        // method call to read file();
//    } catch (RuntimeException e) {
//        System.out.println(e.getMessage());
//    }
//
//    // Daca nu vrem sa tratam eroarea:
//    void metodName() throws RuntimeException {
//        // method call to read file
//    }
//
//    try {
//        //method 1();
//        // method 2();
//        // method 3();
//    } catch(Exception e) {
//        // method 4();
//    } finally {
//        // method 5();
//    }

    /* Daca nu va fi nici o exceptie metodele 1, 2 si 3 vor fi executate, instructiunile
     * din metoda 4 vor fi ignorate, apoi va fi executata metoda 5
     * Daca avem o reoare la metoda 1, metodele 2 si 3 sunt ignorate, instructiunile din
     * metoda 4 sunt executate doar daca corespund tipului de eroare aparuta, iar metoda 5 -
     * finally - este executata intotdeauna*/
}