import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class program {
    public static void main(String[] args) {

        ex03();
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
        while (listIterator.hasNext()) {
            list2.add(listIterator.next());
        }

        System.out.println("Final list: " + list2);
        return list2;

    }

    static int ex03() {
        // Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
        // Используйте итератор
        int result = 0;
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println("Initial list: " + list);

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            result += listIterator.next();

        }

        System.out.println("Summ of all elements is: " + result);
        return result;

    }







    
}
