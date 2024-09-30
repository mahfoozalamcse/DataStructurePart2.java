import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // String study
    public static void printLetter(String str){
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

   // Check number is palindrome
    public static boolean isPalindrome(String str){
       // linear time complexity

        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)){
                // not palindrome
                return false;
            }
        }
        return true;
    }

    // Shortest path

    public static float shortestPath(String path){
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            // North
            if(dir == 'N'){
                y++;

              // East

            } else if (dir == 'E') {
                x++;
              // South

            } else if (dir == 'S') {
                y--;
              // West

            }else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return  (float) Math.sqrt(X2 + Y2);
    }

    public static String substring(String str, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }




    public static void main(String[] args) {

        // why string immutable
        // analysis page and pen

        /*

        // print Largest String
        String str[] = {"apple", "mango", "orange"};
        String largest = str[0];

        for(int i=1; i< str.length; i++){
            if(largest.compareTo(str[i]) < 0){
                largest = str[i];
            }
        }
        System.out.println(largest);

        */

//        // substring function
//        String str = "Hello ji";
//       // System.out.println(substring(str, 0, 8));
//
//        // java exist substring
//        System.out.println(str.substring(0,5));




//        // compare
//        String s1 = "Sony";
//        String s2 = "Sony";
//        String s3 = new String("Sony");
//
//        if(s1 == s2){
//            System.out.println("Equal");
//        }else {
//            System.out.println("not equal");
//        }
//
//        // here not equal in java interning concept
//        // here you use  .equals() function which check value only
//
//        if (s1 == s3){
//            System.out.println("equal");
//        }else {
//            System.out.println("not equal");
//        }



//        String path = "WNEENESENNN";
//        System.out.println(shortestPath(path));



//        String str = "noon";
//        System.out.println(isPalindrome(str));

//        String str = "Mahfooz Alam";
//        printLetter(str);
//        // String charAt Method


//        // string  concatenation
//        String firstName = "Ahad";
//        String lastName = "mahfooz";
//        System.out.println(firstName + " " + lastName);


//        // String length
//        String name = "Mahfooz";
//        System.out.println(name.length()); // here length is function

//        // input string
//        Scanner sc  = new Scanner(System.in);
//        String name;
//        name = sc.nextLine();
//        System.out.println(name);


        // initialization
//        char arr[] = {'a', 'b', 'c'};  // character
//
//        String str  = "abcde";
//        String str1 = new String("abc");
//
//        // String are immutable
//
//        System.out.println(str);
//        System.out.println(str1);
    }
}