package com.gennady;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        long[] numbers = new long[100];
        long previous1, previous2;

        // populate array with Fibonacci numbers
        numbers[0] = 1;
        numbers[1] = 1;
        previous1 = numbers[0];
        previous2 = numbers[1];

        for(int i=2; i<numbers.length;i++){
            numbers[i] = previous1 + previous2;
            previous1 = previous2;
            previous2 = numbers[i];
        }
        System.out.println("Fibonacci array:");
        System.out.println(Arrays.toString(numbers));

        long result = findNumber(numbers,7);
        System.out.println(result);

        System.out.println("\n\n2nd problem");
        String given = "Have a good day";
        System.out.println("Original string is:");
        System.out.println(given);
        reverseByChar(given);

        // 3d problem
        System.out.println("3d problem:");
        given = "Have a great day";
        System.out.println("Original string is:");
        System.out.println(given);
        reverseByWord(given);
    }

    public static long findNumber(long[] myarray, int index){

        return myarray[index];
    }

    public static void reverseByChar(String myString){

        String result = "";
        for(int i=myString.length()-1; i>-1;i--){
            result += myString.charAt(i);
        }
        System.out.println("The reverse is:");
        System.out.println(result);
    }

    public static void reverseByWord(String myString){

        String result = "";
        ArrayList<String> resultList= new ArrayList<String>();

        for(int i = myString.length()-1; i>-1;i--){
            if(myString.charAt(i)!= ' '){
                result += myString.charAt(i);
            }
            else {
                if(result == ""){

                }
                else{
                    resultList.add(result);
                    result = "";
                }
            }
        }

        for(int i=0; i<resultList.size();i++){
            System.out.println(resultList.get(i) + " ");
        }

        System.out.println("The reverse is:");
        //System.out.println(result);
    }

}
