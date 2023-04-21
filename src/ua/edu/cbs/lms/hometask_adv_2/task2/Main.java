package ua.edu.cbs.lms.hometask_adv_2.task2;

public class Main {
    public static void main(String[] args) {
        Words words = new Words();

        words.addWord("One");
        words.addWord("Two");
        words.addWord("Three");
        words.addWord("Four");
        words.addWord("Five");

        System.out.println("Before double:");
        words.print();

        words.doubleValues();

        System.out.println("After double:");
        words.print();
    }
}
