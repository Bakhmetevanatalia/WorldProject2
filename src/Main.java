import java.util.Arrays;

public class Main {
    public static void main (String... args) {
        String[] array = new String[]{"a", "b", "c", " ", "d", "f", "g"};
        System.out.println("Изначальный массив: " + Arrays.toString(array)+ "\nНаоборот: ");
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i]);
        }
    }
}