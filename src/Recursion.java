import java.util.*;

public class Recursion {
    // recursion

    // 1. Base case
    // 2. Kam
    // 3. Inner Function call

    public static int factorial(int n){
        int fact=1;
        if(n == 1){
            return n;
        }
        fact = n*factorial(n-1);
        return fact;
    }

    // print number from n to 1
    public static void printDecreasing(int n){
        if(n  == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n-1);
    }

    // print increasing
    public static void printIncreasing(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n + " ");
    }

    // sum of n natural number sum
    public static int naturalSum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = naturalSum(n-1);
        int sn = n + snm1;
        return sn;

    }

    // print nth Fibonacci series
    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int fib_nm1 = fibonacci(n-1);
        int fin_nm2 = fibonacci(n-2);

        int fn = fib_nm1 + fin_nm2;

        return fn;


    }

    // check array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    // check first occurrence in array
    public static int firstOcurence(int arr[],int i,  int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcurence(arr, i+1, key);

    }

    // last occurrence
    public static int lastOcurence(int arr[],int i,  int key){

        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcurence(arr, i+1, key);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

     return isFound;
    }

    // power of x^n
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return  x*power(x, n-1);
    }
    // optimized x power n
    public static int optamizePower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPowerSq = optamizePower(a, n/2);
        int half = halfPowerSq*halfPowerSq;

        // n is odd
        if(n % 2 != 0){
            half = a * half;
        }
        return half;
    }

    public static void main(String[] args) {
        int n = 10;
        int a = 2;
        System.out.println(optamizePower(a, n));
   //     System.out.println(power(2, 3));

//        int arr[] = {12, 45, 67, 12};
//        int key = 12;
//        System.out.println(lastOcurence(arr, 0, key));

//       int arr[] = {12, 67, 90, 97, 97};
//       int key = 97;
//        System.out.println(firstOcurence(arr, 0, key));

//        int arr[] ={1, 7, 8, 2};
//        System.out.println(isSorted(arr, 0));


//        System.out.println(fibonacci(25));
//        System.out.println(fibonacci(26));
//        System.out.println(fibonacci(27));

      //  System.out.println(naturalSum(5));

      //  int n = 10;
      //  printIncreasing(n);

       // printDecreasing(n);
      //  System.out.println(factorial(6));
    }
}
