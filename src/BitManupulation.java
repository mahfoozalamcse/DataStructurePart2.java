import java.util.*;

public class BitManupulation {
    // Bit manipulation
    // Binary number 0 and 1
    // in computer store in 0 and 1

    public  static void evenOdd(int n){
        int bitMask = 1;
        if((n & bitMask)== 0){
            //  even
            System.out.println("Even");
        }else {
            System.out.println("odd");
        }
    }
    // get bit

    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return  0;
        }else {
            return  1;
        }
    }
   // set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return  n | bitMask;
    }
    // clear ith bit
    public static int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // update ith bit
    public static int updateIthBit(int n, int i, int newBit){
//        if(newBit == 0){
//            return clearBit(n, i);
//        }else {
//            return setIthBit(n , i);
//        }

        // if first clear  than set
        n = clearBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;
    }

    // clear last i bit
    public static int clearIthBit(int n, int i){
        int BitMask = (~0)<<i;
        return n & BitMask;
    }
    public static void main(String args[]){
        System.out.println(clearIthBit(15, 2));

     //   System.out.println(updateIthBit(10, 2, 1));

     //   System.out.println(clearBit(10, 1));


       // System.out.println(setIthBit(10,2));

       // System.out.println(getIthBit(10, 3));

//            evenOdd(2);
//            evenOdd(11);
//            evenOdd(18);


//
//        // Binary AND &&
//        System.out.println(5 & 6);
//        // Binary OR  |
//        System.out.println(5 | 6);
//        // Binary XOR ^
//        System.out.println(5 ^ 6); // 3
//        // Binary One's Complement
//        System.out.println(~0);  // -1(internal memory reason LSB MSB)
//        // Binary Left <<
//        System.out.println(5<<1);
//        // Binary Left >>
//        System.out.println(5>>1);
//


        // decimal to binary

        // Binary to decimal

        // Bitwise operator
        /*
        Binary AND &&
        Binary OR  |
        Binary XOR ^
        Binary One's Complement
        Binary Left <<
        Binary Right >>


         */

    }
}
