package java4;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter min for random: ");
        int min = input.nextInt();
        System.out.println("Enter max for random: ");
        int max = input.nextInt();
        System.out.println("Enter size for list: ");
        int s = input.nextInt();
        input.close();

        LinkedList<Integer> arr = getRandomLinkedList(s, min, max);
        System.out.println(arr);
        reverseLinkedList(arr);
        System.out.println(arr);
    }

    static int getRandomNumberInt(int minimum, int maximum) { // рандомное число
        Random random = new Random();
        return random.nextInt(minimum);
    }

    static LinkedList<Integer> getRandomLinkedList(int size, int minimum, int maximum) { // создаем рандомный массив
        LinkedList<Integer> array = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }

    static List<Integer> reverseLinkedList(LinkedList<Integer> array) { // через цикл
        List<Integer> temp = new LinkedList<Integer>(array);
        int j = 0;
        for (int i = temp.size() - 1; i >= 0; i--) {
            array.set(j, temp.get(i));
            j++;
        }
        return array;
    }

    static List<Integer> reverseLinkedList2(LinkedList<Integer> array) { // через встроенный метод
        Collections.reverse(array);
        return array;
    }
}