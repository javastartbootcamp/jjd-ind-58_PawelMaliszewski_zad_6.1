package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("\u001B[91m" + "Podaj " + "\u001B[30m" + "liczbę");
            number = sc.nextInt();
            if (number >= 100 && number <= 200) {
                if (number % 3 != 0) {
                    System.out.println("\u001B[91m" + "Liczba " + "\u001B[30m" + "nie jest podzielna przez 3");
                } else {
                    System.out.println("\u001B[91m" + "Twoja " + "\u001B[30m" + "liczba jest ok");
                }
            }
            if (number < 100) {
                System.out.println("\u001B[91m" + "Twoja " + "\u001B[30m" + "liczba jest za mała");
            } else if (number > 200) {
                System.out.println("\u001B[91m" + "Twoja " + "\u001B[30m" + "liczba jest za duża");
            }
        } while (!((number > 100 && number < 200) && number % 3 == 0));
    }
}
