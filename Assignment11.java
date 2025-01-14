import java.util.*;
public class Assignment11 {
    public static int sum(int num){
        int rem;
        int Tsum=0;
        do{
            rem=num%10;
            Tsum +=rem;
            num = num/10;
        }while(num>0);
        return Tsum;
    }


    // public static boolean isPal(int num){
    //     int orig = num;
    //     int rev=0;
    //     int rem;
    //     while(num>0){
    //         rem = num%10;
    //         rev =rev*10+rem;
    //         num=num/10;
    //     }
    //     System.out.println(num);
    //     System.out.println(rev);
    //     if(orig==rev){
    //         return true;
    //     }
    //     else{return false;}
    // }

    // public static boolean isEven(int n){
    //     if(n%2==0){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    
    // public static int avg(int a, int b, int c) {
    //     return (a+b+c)/3;        
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  numbers");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int ans = avg(a, b, c);
        // System.out.println("The average is : "+ans);


        // int num = sc.nextInt();
        // boolean my = isEven(num);
        // System.out.println("The number enterd is even is : "+my);
        int num = sc.nextInt();
        // if(isPal(num)){
        //     System.out.println("The Number is palindrome");
        // }
        // else{
        //     System.out.println("The number is not palindrome");
        // }
        System.out.println("The Sum of the digits in a integer  "+sum(num));
        sc.close();
    }    
}
