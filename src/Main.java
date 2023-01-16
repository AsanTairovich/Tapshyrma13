import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class clas = new Class(5, "Asan", new int[]{5, 2, 3, 4, 5});
        System.out.println(clas.getRoom());
        System.out.println(clas.getWord());
        System.out.println(Arrays.toString(clas.getNum()));

    }
}