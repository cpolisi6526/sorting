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
                if (arr[i].compareTo(arr[i + 1]) > 0) {
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



    public static boolean isSorted(int[] arr) {
        for (int x = 0; x < arr.length-1; x++) {
            if (arr[x] > arr[x + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(double[] arr) {
        for (int x = 0; x < arr.length-1; x++) {
            if (arr[x] > arr[x + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(String[] arr) {
        for (int x = 0; x < arr.length-1; x++) {
            if (arr[x].compareTo(arr[x + 1])>=0){
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
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index = min(arr, i);
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
            }
        }
    }

    public static void insertion(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (!(arr[i] < arr[i + 1])) {
                    while ((!(arr[i] < arr[i + 1]))) {
                        index++;
                        if ((!((arr[index] < arr[index + 1])))) {
                            swap(arr, i, index);
                        }
                    }
                }
            }
            if ((i > 0) && (i<arr.length-2)) {
                if (!((arr[i - 1] < arr[i]) && (arr[i] < arr[i + 1]))) {
                    while ((!((arr[i - 1] < arr[i]) && (arr[i] < arr[i + 1])))) {
                        index++;
                        if ((!((arr[index - 1] < arr[index]) && (arr[index] < arr[index + 1])))) {
                            swap(arr, i, index);
                        }
                    }
                }
            }
        }
    }
}



