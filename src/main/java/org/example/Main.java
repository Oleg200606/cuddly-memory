package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону a: ");
        int a = scanner.nextInt();

        System.out.println("Введите сторону b: ");
        int b = scanner.nextInt();

        System.out.println("Введите сторону c: ");
        int c = scanner.nextInt();

        // Проверка на равносторонний треугольник
        if (a == b && b == c) {
            System.out.println(a + ", " + b + " и " + c + " стороны равностороннего треугольника");
        }
        // Проверка на прямоугольный треугольник
        else if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b)) {
            System.out.println(a + ", " + b + " и " + c + " стороны прямоугольного треугольника");
        }
        // Проверка на равнобедренный треугольник
        else if (a == b || b == c || c == a) {
            System.out.println(a + ", " + b + " и " + c + " стороны равнобедренного треугольника");
        }
        // Проверка на невозможность существования треугольника
        else if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println(a + ", " + b + " и " + c + " не образуют треугольник");
        }
        // Все остальные случаи - обычный треугольник
        else {
            System.out.println(a + ", " + b + " и " + c + " стороны обычного треугольника");
        }

        scanner.close();
    }
}
