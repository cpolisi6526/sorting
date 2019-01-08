package candacepolisi;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Before: ");
        int[] arr= sorting.randArr(7);
        for (int a=0;a<arr.length;a++){
            System.out.print(" "+ arr[a]);
        }
        System.out.println(" \n After: ");
        sorting.selection(arr);
        for (int a=0;a<arr.length;a++){
            System.out.print(" "+ arr[a]);
        }
	// write your code here
    }
}
