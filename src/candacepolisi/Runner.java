package candacepolisi;

public class Runner {
//// the checkers calculate the am of time taken to sort list
    public static void checker(double[] arr) {
        long time = System.nanoTime();
        sorting.selection(arr);
        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time);
    }

    public static void checker(int[] arr) {
        long time = System.nanoTime();
        sorting.insertion(arr);
        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time);
    }

    public static void checker(String[] arr) {
        long time = System.nanoTime();
        sorting.bubbleSort(arr);
        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time);
    }

    public static void selectionRunner(double[] arr){
        System.out.println("Before: ");
       //   double[] arr= sorting.randDoubleArr(7);
            // String arr[]= {"i","am","very","i"};
        for (int a=0;a<arr.length;a++){
                System.out.print(" "+ arr[a]);
        }
        System.out.println(" \n After: ");
        sorting.selection(arr);
        for (int a=0;a<arr.length;a++){
            System.out.print(" "+ arr[a]);
        }
        double[] copy= sorting.copyArray(arr);
        System.out.println("\n Sorted: " + sorting.isSorted(arr));
        checker(arr);
        System.out.println("Sum checked: " + sorting.checkSum(arr,copy));
        }

        public static void insertionRunner(int arr[]){
            System.out.println("Before: ");
            for (int a=0;a<arr.length;a++){
                System.out.print(" "+ arr[a]);
            }
            sorting.insertion(arr);
            System.out.println(" \n After: ");
            for (int a=0;a<arr.length;a++){
                System.out.print(" "+ arr[a]);
            }
            int[] copy= sorting.copyArray(arr);
            System.out.println("\n Sorted: " + sorting.isSorted(arr));
            checker(arr);
            System.out.println("Sum checked: " + sorting.checkSum(arr,copy));
            // write your code here
        }

        public static void bubbleRunner(String[] arr){
            System.out.println("Before: ");
            for (int a=0;a<arr.length;a++){
                System.out.print(" "+ arr[a]);
            }
            sorting.bubbleSort(arr);
            System.out.println(" \n After: ");
            for (int a=0;a<arr.length;a++){
                System.out.print(" "+ arr[a]);
            }
            String[] copy= sorting.copyArray(arr);
            System.out.println("\n Sorted: " + sorting.isSorted(arr));
            checker(arr);
            // write your code here
        }


    public static void main(String[] args) {
        System.out.println("Insertion: ");
      //  insertionRunner(new int[]{2, 5, 1, 7, 9, 3, 4});
        insertionRunner(sorting.randIntArr(7));
        System.out.println("\n Selection: ");
       selectionRunner(new double[]{2.1,3.2,5.2,0.1,0.2});
        System.out.println("\n Bubble Sort:  ");
      //  bubbleRunner(new String[]{"i", "am", "very", "Hungry"});
        bubbleRunner(sorting.randStringArr(7,5));
        //);
	// write your code here
    }
}
