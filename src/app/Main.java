package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {23, 54, 1, 23, 3, 89, 11, 10, 4, 5, 12, 99, 7, 9, 17};

            System.out.print("Початковий вигляд масиву: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++){

            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && key < numbers[j]){
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
        System.out.println("\n" + "Відсортований масив: " + Arrays.toString(numbers));

        Scanner scan = new Scanner(System.in);
        System.out.print("Введить чісло для пошуку: ");
        int n = scan.nextInt();

        int low = 0;
        int high = numbers.length - 1;
        int index = -1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (numbers[mid] == n) {
                index = mid;
                break;
            }
            else if (numbers[mid] > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        if (index == -1)
            System.out.print("Індекс числа " + n + " не існує.");
        else
            System.out.print("Індекс числа " + n + " у відсортованому масиві " + index);

    }

}
