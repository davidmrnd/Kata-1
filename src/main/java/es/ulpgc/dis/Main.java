package es.ulpgc.dis;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person david = new Person("David", LocalDate.of(2004, 10, 9));
        System.out.println(david);
    }
}