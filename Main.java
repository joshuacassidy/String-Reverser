/**
 * Created by Josh on 08/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(stringReverserIterative("josh", ""));
        System.out.println(stringReverserRecursivily("josh", "", "josh".length()-1));
    }

    public static String stringReverserIterative(String string, String newString){
        for (int i = string.length()-1; i >= 0; i-- ){
            newString+=string.charAt(i);
        }
        return newString;
    }

    public static String stringReverserRecursivily(String string, String newString, int index){
        if (index >= 0) {
            newString+=string.charAt(index);
            return stringReverserRecursivily("josh", newString, index-1);
        } else {
            return newString;
        }
    }

}
