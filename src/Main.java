public class Main {
    public static void main(String[] args) {

        //testing of OrdinaArray class
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
        System.out.println();

        //testing of NumeriSottoLaMedia class
        int[] valori5 = new int[]{10, 15, 16, 13, 15, 17 ,19, 9, 7, 10};
        System.out.println("number of days under the average: " + NumeriSottoLaMedia.daysNumbUnderAve(valori5));
        System.out.println();

        //testing of ContaFamiglie class
        double[] valori6 = new double[]{10, 15, 19, 16, 13, 15, 18 ,19, 9, 7, 10};
        double value = 13;
        double highest = ContaFamiglie.highestIncome(valori6);
        double highestLess10 = highest * 0.9;
        System.out.println("number of families with income lower than " + value + ": " + ContaFamiglie.countNumberUnderValue(valori6, value));
        System.out.println("highest income: " + highest);
        System.out.println("number of families with an income lower than the 90% of the value of the highest income: " + ContaFamiglie.countNumberUnder90(valori6));
        System.out.println("actual income values of the families that have an income lower than " + highestLess10);
        for (double element : valori6)
            if(element < highestLess10)
                System.out.print(element + " ");
        System.out.println();
    }
}