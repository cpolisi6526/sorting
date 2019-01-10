package candacepolisi;

public class Runner {

    public static void checker(double[] arr) {
        long time = System.nanoTime();
        sorting.selection(arr);
        time = System.nanoTime() - time;
        System.out.println("Time taken: " + time);
    }

    public static void selectionrunner(double[] arr){
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
        System.out.println("\n Sorted: " + sorting.isSorted(arr));
        double arr1[]= {2.1,3.2,5.2,0.1,0.2};
        checker(arr1);
        }

        public static void insertionrunner(int arr[]){

            System.out.println("Before: ");
            for (int a=0;a<arr.length;a++){
                System.out.print(" "+ arr[a]);
            }
            sorting.insertion(arr);
            System.out.println(" \n After: ");
            for (int a=0;a<arr.length;a++){
                System.out.print(" "+ arr[a]);
            }
            // write your code here
        }

    public static void main(String[] args) {
        System.out.println("Insertion:");
        insertionrunner(new int[]{2, 5, 1, 7, 9, 3, 4});
        System.out.println("\n Selection: ");
        selectionrunner(new double[]{2.1,3.2,5.2,0.1,0.2});
        //);
	// write your code here
    }
}
