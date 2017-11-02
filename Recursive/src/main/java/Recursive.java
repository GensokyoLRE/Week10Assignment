
public class Recursive {
    static int x;
    /*
    * recursive method to output every other element in the given array backwards,
    * ending with the element at index k.
    * An example input arrary {1,2,3,4,5,6,7,8,9,10}, called with k=2, should output 9753
    */
    public static void printEveryOther(final int[] ia, final int k) {
        if (null == ia){
            System.out.println(ia.toString());
        } else if (!(k>10)){
            System.out.print(ia[ia.length-k]);
            printEveryOther(ia,k+2);
        }

    }

    /*
    * recursively take in a string and place a * between adjacent letters that are the same
    * An example input String "hello" should return hel*lo.
    */
    public static String printStars(final String s) {
        return null;
    }

    public static void main(String[] args) {
        printEveryOther(new int[]{1,2,3,4,5,6,7,8,9,10}, 2);
       // System.out.println(printStars("Hello"));
    }
}