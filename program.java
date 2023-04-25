import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class program {
    public static void main(String[] args) {

        ex01();
    }

    static List<Integer> ex01() {
        // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        // вернет “перевернутый” список. Постараться не обращаться к листу по индексам.
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Initial list: " + list);
        List<Integer> list2 = new LinkedList<Integer>();

        Iterator<Integer> listIterator = ((LinkedList<Integer>) list).descendingIterator();
        while(listIterator.hasNext()){
            list2.add(listIterator.next());
        }

        System.out.println("Final list: " + list2);
        return list2;

    }






}
