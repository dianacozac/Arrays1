import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myValue = 10;
        int anotherValue = myValue;
        System.out.println( "myValue = " + myValue);
        System.out.println( "another value = " + anotherValue);
        anotherValue++;
        System.out.println( "myValue = " + myValue);
        System.out.println( "another value = " + anotherValue);

        int[] myIntArray =new int[5];
        int [] anotherArray = myIntArray;

       //lista de int convertita in lista de string separata prin virgula
        System.out.println( "myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("AnotherArray = " +Arrays.toString(anotherArray));

        //References
        anotherArray[0] = 1;
        System.out.println( " after ch myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(" after ch AnotherArray = " +Arrays.toString(anotherArray));

        anotherArray = new int[ ] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println( " after mod myIntArray = " + Arrays.toString(myIntArray));
        System.out.println(" after mod AnotherArray = " +Arrays.toString(anotherArray));

    }
    private static void modifyArray (int[] array) {
        array[0] = 2;
        array = new int [] {1,2, 3,4,5};
    }

}