//Enter your code here
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
    private static final int TOP_COUNT=4;
    private static ReverseComparator reverseComparator;

    // Initialize
    static {
        scanner = new Scanner(new java.io.BufferedInputStream(System.in), charsetName);
        reverseComparator = new ReverseComparator();
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
        process(totalTests);
    }

    static class ReverseComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer p1, Integer p2) {
            int res =  p1 > p2 ? -1 : (p1 == p2 ? 0 : 1);
            return res;
        }
    }

    /*
     * Method to get input from scanner and find top four
     */
    private static void process(int totalTests){
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(4, reverseComparator);
        pQueue.add(Integer.MIN_VALUE);
        while(totalTests-- != 0){
            pQueue.add(scanner.nextInt());
        }
        for(int i=0; i<TOP_COUNT; i++){
            print(pQueue.poll());
        }
    }
}


