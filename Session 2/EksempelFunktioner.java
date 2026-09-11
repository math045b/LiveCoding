import java.util.*;

public class EksempelFunktioner {
    static int x = 10;
    
    static ArrayList myList = new ArrayList<String>();
    
    public static int sampleMethod(int y) {
        return x + y;
    }
    
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static ArrayList createList() {
        myList.add("First");
        myList.add("Second");
        myList.add("Third");
        return myList;
    }
    
    public static void printList(ArrayList<String> listFromArgument) {
        System.out.println("The words in the list:");
        for (String word : listFromArgument) {
            System.out.println(word);
        }
    }
    
    public static void printAnswers() {
        System.out.println("SampleMethod(3) " + sampleMethod(3));
        System.out.println("isEven(3) " + isEven(3));
        System.out.println("isEven(8) " + isEven(8));
        printList(createList());
    }
}