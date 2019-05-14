package javatest;

public class Program{
    public static void main(String[] args) {
        FileReading jaagupi_text = new FileReading("/Users/gertinpakkonen/Desktop/Git/Programmeerimise-pohikursus-2019/Work4/javatest/src/main/java/javatest/andmed.txt");
        System.out.println(jaagupi_text.word_counter);

    }
}