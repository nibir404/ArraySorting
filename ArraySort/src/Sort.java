import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Sorted s = new Sorted();
        s.display();
        Arrays.sort(s.arr);
        System.out.println(Arrays.toString(s.arr));
    }
}
