import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SomeMethods someMethods = new SomeMethods();
        int[] array1 = {4, 1, 2, 3 ,2, 5, 0};
        int[] array2 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] array3 = {1, 2, 0, 7, 2, 3, 1, 1, 7};
        int[] array4 = {4, 2, 4, 4, 0, 3, 4, 4, 7};
        //1 ДЗ
        try {
            System.out.println(Arrays.toString(someMethods.getArrayPastLast4(array1)));
            System.out.println(Arrays.toString(someMethods.getArrayPastLast4(array2)));
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        //2 ДЗ
        System.out.println(someMethods.is1and4exist(array1));
        System.out.println(someMethods.is1and4exist(array2));
        System.out.println(someMethods.is1and4exist(array3));
        System.out.println(someMethods.is1and4exist(array4));
    }
}
