import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GitTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for (Integer i : list) {
            if (i.equals(1)) {
                int x = i * 8 + 1;
                System.out.println(x + "found");
            } else {
                System.out.println("found" + i);
            }
        }

        System.out.println("Second feature");

        System.out.println("Third feature");

        System.out.println("Fourth feature");

        System.out.println("Fifth feature");

        System.out.println("Sixth feature");
    }
}
