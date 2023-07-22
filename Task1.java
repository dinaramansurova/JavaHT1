/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).

*/



package Tasks;

import java.util.Scanner;

public class Task1 {
    
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Введите число n: ");
            int n = s.nextInt();
            System.out.printf("Треугольное число: %d\n", getTriangle(n));
            System.out.printf("Факториал: %d\n", getFactorial(n));
    }
        public static int getTriangle(int a) {
            return (a * (a + 1)) / 2;
    }
    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
           result = result * i;
        }
        return result;
      }
}
