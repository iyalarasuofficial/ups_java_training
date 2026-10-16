package Day8;

public class RotateArrayByK {
    public static void main(String[] args) {
        int arr[]= {1,2,6,7};
        int k=3;
        int n=arr.length;
        k=k%n;
        int tempArr[]= new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            tempArr[j]=arr[i];
            j++;
        }
        for(int i=0;i<n-k;i++){
            tempArr[j]=arr[i];
            j++;
        }

        for(int num:tempArr){
            System.out.println(num);
        }
    }
}
