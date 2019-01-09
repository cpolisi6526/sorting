package candacepolisi;

public class sorting {

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void swap(double arr[], int a, int b) {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void swap(String arr[], int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void bubbleSort(String[] arr) {
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1])>0) {
                    swap(arr, i, i + 1);

                    swap = true;
                }
            }

        }
    }


    public static int[] randIntArr(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    public static double[] randDoubleArr(int count) {
        double[] arr = new double[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (Math.random() * 10);
        }
        return arr;
    }

    public static void checker() {
        long time = System.nanoTime();
        //bubbleSort();
        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time);
    }

    public static boolean isSorted(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > arr[x + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int s1 = 0;
        for (int x : before) {
            s1 += before[x];
        }
        int s2 = 0;
        for (int x : after) {
            s1 += after[x];
        }
        return (s1 == s2);
    }

    public static int min(double arr[], int ind) {
        int minInd = ind;
        for (int i = ind; i < arr.length; i++) {
            if (arr[i] < arr[minInd]) {
                swap(arr, i, minInd);
                minInd = i;
            }
        }
        return minInd;
    }


    public static void selection(double[] arr) {
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            l = min(arr, i);
            swap(arr, i, l);
        }
    }

    public static void selection(int[] arr) {
        double min;
        int index;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            index = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (arr[i] > min) {
                swap(arr, i, index);
            }


        }

    }
}


