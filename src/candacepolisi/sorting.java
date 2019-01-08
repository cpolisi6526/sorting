package candacepolisi;

public class sorting {

        public static void swap(int arr[], int a, int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }



        public static void bubbleSort(int[] arr){
            boolean swap = true;
            while(swap){
                swap=false;
                for(int i =0; i<arr.length-1; i++){
                    if(arr[i]>arr[i+1]){
                        swap(arr, i, i+1);

                        swap = true;
                    }
                }

            }
        }


        public static int[] randArr(int count)
        {
            int[] arr = new int[count];
            for (int i=0; i<count; i++)
            {
                arr[i] = (int)(Math.random()*10);
            }
            return arr;
        }

        public static void checker(){
            long time= System.nanoTime();
            bubbleSort(randArr(4));
            time=System.nanoTime()-time;
            System.out.println("Time taken: " + time);
        }

        public static boolean isSorted(int[] arr){
            for (int x=0;x<arr.length;x++){
                if (arr[x]>arr[x+1]){
                    return false;
                }
            }
            return true;
        }

        public static boolean checkSum(int[]before, int[] after){
            int s1= 0 ;
            for (int x:before){
                s1+=before[x];
            }
            int s2=0;
            for (int x:after){
                s1+=after[x];
            }
            return (s1==s2);
        }
/////// gotta fix
        public static void selection(int[] arr) {
            int low=arr[0];
            for(int i=0;i<arr.length;i++){
                low= arr[i];
                for (int j=0; j<arr.length;j++){
                    if (arr[low]>arr[j]){
                        low=j;
                    }
                }
                ///////find a way to switch low bc doesnt work need indexxxxxxxx
                swap(arr,low,i);
            }
        }
    }


