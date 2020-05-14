import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int Array[] = new int[size];
        System.out.println("Введите элемент массива:");
        for (int i = 0; i < size; i++) {
            Array[i] = input.nextInt();
        }
        Sorting.insertIntoSort(Array);
        System.out.print ("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + Array[i]);
        }
    }
}
