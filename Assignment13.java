import java.util.*;
public class Assignment13 {
    public static int sum(int arr[]){
        int Tsum =0;
        for(int i=0;i<arr.length;i++){
            Tsum = Tsum +arr[i];
        }
        return Tsum;
    }
    public static int linearsearch(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return 0;
            }
        }return -1;
    }
    public static int Binarysearch(int arr[],int key){
        int start = 0;
        int end = arr.length;
        int mid = (start+end)/2;
        while(start<=end){
            if(key==mid){
                return 0;
            }
            if(arr[mid]>key){
                start= mid+1;
            }else{
                end = mid-1;
            }
        }return -1;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        // arr[0]=sc.nextInt();
        System.out.println("Enter the Elements of array");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The total sum of elements of array is "+sum(arr));
        //int ans =linearsearch(arr,5);
        int ans1 =Binarysearch(arr,5);
        if(ans1==0){
        System.out.println("The no 5 is in the array ");}
        if(ans1==-1){
            System.out.println("The no 5 is  not in the array ");
        }
        sc.close();
    }
}
