public class OrdinaArray {
    public static void selectionSort(int[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            int indiceValoreMinimo = indiceMinimo(i, array);
            if(i != indiceValoreMinimo)
                scambiaValori(i, indiceValoreMinimo, array);
        }
        assertSorting(array); //check correctness
    }

    public static int indiceMinimo(int inizio, int[] array) {
        int minimo = inizio;
        for (int i = inizio; i <= array.length - 1; i++) {
            if(array[i] < array[minimo]) {
                minimo = i;
            }
        }
        return minimo;
    }

    public static void scambiaValori(int i, int indiceValoreMinimo, int[] array) {
        int tmp = array[i];
        array[i] = array[indiceValoreMinimo];
        array[indiceValoreMinimo] = tmp;
    }

    public static void assertSorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            assert array[i] <= array[i + 1];
        }
    }

    public static int[] rimuovi(int[] array, int v) {
        int count = 0;
        int [] output;

        for (int element : array) {
            if (element == v)
                count++;
        }
        if(count != 0) {
            output = new int[array.length - count];
            int usedCell = 0;
            for (int i = 0; i <= array.length - 1 && usedCell <= array.length - count - 1; i++) {
                if(array[i] != v) {
                    output[usedCell] = array[i];
                    usedCell++;
                }
            }
        } else
            return new int[0];
        return output;
    }

    public static void selectionSort(char[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            int indiceValoreMinimo = indiceMinimo(i, array);
            if(i != indiceValoreMinimo)
                scambiaValori(i, indiceValoreMinimo, array);
        }
        assertSorting(array); //check correctness
    }

    public static int indiceMinimo(int inizio, char[] array) {
        int minimo = inizio;
        for (int i = inizio; i <= array.length - 1; i++) {
            if(array[i] < array[minimo]) {
                minimo = i;
            }
        }
        return minimo;
    }

    public static void scambiaValori(int i, int indiceValoreMinimo, char[] array) {
        char tmp = array[i];
        array[i] = array[indiceValoreMinimo];
        array[indiceValoreMinimo] = tmp;
    }

    public static void assertSorting(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            assert array[i] <= array[i + 1];
        }
    }

    public static void partialSelectionSort(int[] array, int start, int finish) {
        assert(0 <= start && start <= finish);
        assert(finish <= array.length -1);
        for (int i = start; i <= finish; i++) {
            int indiceValoreMinimo = indiceMinimo(i, array);
            if(i != indiceValoreMinimo)
                scambiaValori(i, indiceValoreMinimo, array);
        }
        //should implement correctness check via assert
    }

    /**
     *
     * @param array The input array, it is assumed that the array is sorted in ascending order.
     * @param value The value to search in the input array.
     * @return The index of the array corresponding to the input value, if present.
     * If the array does not contain the value, then it will return -1;
     */
    public static int sequentialSearch(int[] array, int value) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (value < array[i]) {
                return -1;
            } else if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static double[][] findImage(double [][] array, double threshold) {
        double[][] outputArray = new double[array.length][array[0].length];
        int totNumOfValues = array.length * array[0].length;
        double sumOfAllValues = 0;
        double averageValue;

        for (double[] row : array) {
            for (double element : row) {
                sumOfAllValues += element;
            }
        }
        averageValue = sumOfAllValues / totNumOfValues;

        for (int row = 0; row <= array.length - 1; row++) {
            for (int column = 0; column <= array[0].length - 1; column++) {
                if(array[row][column] <= threshold * averageValue) {
                    outputArray[row][column] = 0.0;
                } else
                    outputArray[row][column] = 1.0;
            }
        }
        return outputArray;
    }
}
