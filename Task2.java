/*
 * Вывод на экран всех простых чисел от 1 до 1000, каждое на новой строке.
 */


package Tasks;

public class Task2 {
    public static void main(String[] args) {

        for(int i = 2; i <=1000; i++){

            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            } 
            if (isPrime) System.out.println(i);
            else isPrime = false;
        }
    }
}
