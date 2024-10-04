import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int[] valori1 = new int[]{10, 15, 32, 2, 4, 23, 21, 10, 15, 32, 2, 4, 23, -21};
        int[] valori2 = new int[]{-10, 15, 32, 2, 4, 23, 21, 10, 15, 32, 2, 4, 23, -21};
        int[] valori3 = new int[]{10, 15, 32, 2, 4, -23, 21, 10, 15, 32, 2, 4, 23, -21};
        int[] valori4 = new int[]{0, 0, 0, 0, 0, 0, 1, 0};

        OrdinaArray.selectionSort(valori1);
        OrdinaArray.selectionSort(valori2);
        OrdinaArray.selectionSort(valori3);
        OrdinaArray.selectionSort(valori4);

        for(int elemento : valori1) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        for(int elemento : valori2)
            System.out.print(elemento + " ");
        System.out.println();

        for(int elemento : valori3)
            System.out.print(elemento + " ");
        System.out.println();

        for(int elemento : valori4)
            System.out.print(elemento + " ");
    }
}