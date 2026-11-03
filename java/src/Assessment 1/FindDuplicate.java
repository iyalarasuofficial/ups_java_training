package Day8;

import java.util.Scanner;

public class FindDuplicate {
    public static  void main(String args[]){
        Scanner in = new Scanner(System.in);

        int arr[]={ 4,2, 7 ,4, 8, 2, 9, 4};
//        int narr[]=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if (i!=j){
//                    if(arr[i]==arr[j]){
//                        boolean found=false;
//                        if(narr[])
//                        System.out.println(arr[i]);
//
//                    }
//                }
//            }
//        }

        for(int i=0;i<arr.length;i++){
            boolean found= false;


            for(int j=0;j<i;j++){
                if (i!=j){
                    if(arr[i]==arr[j]){
                        found= true;
                        break;

                    }
                }
            }
            if(!found){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        System.out.println(arr[i]);
                        break;
                    }
                }
            }


        }

    }
}
