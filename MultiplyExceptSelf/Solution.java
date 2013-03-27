/*
 Enter your code here. Read input from STDIN. Print output to STDOUT
 Your class should be named Solution
*/
import java.util.*;


public class Solution {

    // Scanner for reading from System.in
    private static Scanner scanner;
    // assume Unicode UTF-8 encoding
    private static final String charsetName = "UTF-8";

    private static int totalTests;
    private static int zeroCount;
    private static long masterProduct = 1;
    private static List<Integer> inputList;

    // Initialize
    static {
        scanner = new Scanner(new java.io.BufferedInputStream(System.in), charsetName);
        inputList = new ArrayList<Integer>();
        zeroCount = 0;
    }

    /*
     * Method for printing an object to System.out
     */
    private static void print(Object o){
        System.out.println(o.toString());
    }

    /*
     * Main method
     */
    public static void main(String[] args) {
        totalTests = scanner.nextInt();
        while(totalTests-- != 0){
            int number = scanner.nextInt();
            if(number == 0)
                zeroCount++;
            inputList.add(number);
        }
        process();
    }

    /*
     * Method to calculate product of other numbers
     */
    private static void process(){
        for(int number : inputList){
            if(zeroCount > 1){
                masterProduct = 0;
                break;
            }
            else if(number != 0){
                masterProduct *= number;
            }
        }
        for(int number : inputList){
            if(inputList.size() == 1){
                print(number);
                break;
            }
           if(number != 0 && zeroCount==0){
                print(masterProduct/number);
            }else if(zeroCount > 1){
                print(0);
            }
            else if(number == 0){
                print(masterProduct);
            }else{
                print(0);
            }
        }

    }

}