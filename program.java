import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class program {
    public static void main(String[] args) {

        ex02();
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

    static void ex02() {
        // Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() -
        // помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        // first() - возвращает первый элемент из очереди, не удаляя.
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println("Initial list: " + list);
        enqueueForList(list, 666);
        dequeueForList(list);
        firstForList(list);

    }

    static List<Integer> enqueueForList(List<Integer> list, int item) {
        // Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() -
        // помещает элемент в конец очереди
        List<Integer> list2 = new LinkedList<Integer>();
        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            list2.add(listIterator.next());
        }
        list2.add(item);
        System.out.println("Enqueue list: " + list2);
        return list2;
    }

    static int dequeueForList(List<Integer> list) {
        // Реализуйте очередь с помощью LinkedList со следующими методами: dequeue() -
        // возвращает первый элемент из очереди и удаляет его,
        int result = list.get(0);
        ((LinkedList<Integer>) list).removeFirst();
        System.out.println("Dequeue list: " + list);
        System.out.println("Deleted element for dequeue list: " + result);
        return result;
    }

    static int firstForList(List<Integer> list) {
        // Реализуйте очередь с помощью LinkedList со следующими методами: first() -
        // возвращает первый элемент из очереди, не удаляя.
        int result = list.get(0);
        System.out.println("First element for list: " + result);
        return result;
    }

}
