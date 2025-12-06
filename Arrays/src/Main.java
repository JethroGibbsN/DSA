import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.forEach(i -> System.out.println(i));
    }
}