public class OrdinaArray {
    public static void selectionSort(int[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            int indiceValoreMinimo = indiceMinimo(i, array);
            if(i != indiceValoreMinimo)
                scambiaValori(i, indiceValoreMinimo, array);
        }
        assertSorting(array);
        return;
    }

    public static int indiceMinimo(int inizio, int[] array) {
        int minimo = inizio;
        for (int i = inizio; i <= array.length - 1; i++) {
            //System.out.println("array[i]: " + array[i]);
            if(array[i] < array[minimo]) {
                minimo = i;
                //System.out.println("minimo " + minimo + " inizio: " + inizio + " i: " + i);
                //System.out.println("array[i]: " + array[i] + " array[minimo]: " + array[minimo]);
            }
        }
        //System.out.println("end for");
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
}
