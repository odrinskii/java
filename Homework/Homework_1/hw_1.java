package java.Homework.Homework_1;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        int number = GetNumber("Введите целое число: ");
        long triangleNumber = GetTriangleNumber(number);
        System.out.printf("Треугольное число %d равно %d\n",number,triangleNumber);
    }
    
    static int GetNumber(String request) {
        System.out.print(request);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
    static long GetTriangleNumber(int number) {
        long triangleNumber = number * (number + 1) / 2;
        return triangleNumber;
    }
}
