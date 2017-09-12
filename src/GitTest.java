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


        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();

            if (i.equals(1)) {
                System.out.println("1 found");
            } else {
                System.out.println("found" + i);
            }
        }

        System.out.println("Second feature");
    }
}
