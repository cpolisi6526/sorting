package candacepolisi;

public class sorting {


        //// swap switches two values in an array for my purposes a should b the bigger number
///4 int
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
//4 d
    public static void swap(double arr[], int a, int b) {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
// 4 string
    public static void swap(String arr[], int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

///// sorts string arrays
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

        public static void bubbleSort(int[] arr) {
            boolean swap = true;
            while (swap) {
                swap = false;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i]>arr[i+1]) {
                        swap(arr, i, i + 1);

                        swap = true;
                    }
                }

            }
        }

   /// rand...Arr creates a random arr for each medium
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

    public static String[] randStringArr(int num, int length){
        String[] arr= new String[num];
        while(num>0){
            int i= 0;
            String s= "";
            while(i<length) {
                char c = (char) (Math.random() * 26 + 97);
                s = s + c;
                i++;
            }
            num--;
            arr[num]=s;
        }
        return arr;
    }

/// checks if the array is sorted
    // for int
    public static boolean isSorted(int[] arr) {
        for (int x = 0; x < arr.length-1; x++) {
            if (arr[x] > arr[x + 1]) {
                return false;
            }
        }
        return true;
    }
// 4 double
    public static boolean isSorted(double[] arr) {
        for (int x = 0; x < arr.length-1; x++) {
            if (arr[x] > arr[x + 1]) {
                return false;
            }
        }
        return true;
    }
///4 string
    public static boolean isSorted(String[] arr) {
        for (int x = 0; x < arr.length-1; x++) {
            if (arr[x].compareTo(arr[x + 1])>=0){
                return false;
            }
        }
        return true;
    }

/// checks the sums of the numerical arrays if equal
///for int
    public static boolean checkSum(int[] before, int[] after) {
        int s1 = 0;
        for (int x=0;x<before.length;x++) {
            s1 += before[x];
        }
        int s2 = 0;
        for (int x=0;x<after.length;x++) {
            s2 += after[x];
        }
        return (s1 == s2);
    }

    public static boolean checkSum(double[] before, double[] after) {
        int s1 = 0;
        for (int x=0;x<before.length;x++) {
            s1 += before[x];
        }
        int s2 = 0;
        for (int x=0;x<after.length;x++) {
            s2 += after[x];
        }
        return (s1 == s2);
    }
// finds min # in arr
///4 d
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
//4 int
    public static int min(int arr[], int ind) {
        int minInd = ind;
        for (int i = ind; i < arr.length; i++) {
            if (arr[i] < arr[minInd]) {
                swap(arr, i, minInd);
                minInd = i;
            }
        }
        return minInd;
    }
/// 4 double
    public static void selection(double[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index = min(arr, i);
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
            }
        }
    }

    public static void selection(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            index = min(arr, i);
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
            }
        }
    }
//4 int
    public static void insertion(int[] arr) {
        int min=min(arr,0);
        swap(arr,0,min);
        for(int i: arr){
            for(int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }
    }
    /// copies array into new array
    //4 int
    public static int[] copyArray(int[] arr){
        int[] arr2= new int[arr.length];
        for (int x=0;x<arr.length;x++){
            arr2[x]=arr[x];
        }
        return arr2;
    }
//for double
    public static double[] copyArray(double[] arr){
        double[] arr2= new double[arr.length];
        for (int x=0;x<arr.length;x++){
            arr2[x]=arr[x];
        }
        return arr2;
    }
///4 strings
    public static String[] copyArray(String[] arr){
        String[] arr2= new String[arr.length];
        for (int x=0;x<arr.length;x++){
            arr2[x]=arr[x];
        }
        return arr2;
    }

}



