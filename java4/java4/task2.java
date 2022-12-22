package java4;

import java.util.*;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> ochered = new LinkedList<String>();
        Scanner input = new Scanner(System.in, "cp866");
        while (true) {
            System.out.println("Введите:\n" +
                    "1 Добавить в конец очереди\n" +
                    "2 Удалить из начала очереди\n" +
                    "3 Показать первый в очереди\n" +
                    "stop Для выхода");
            String elem = new String();
            elem = input.next();
            switch (elem) {
                case "stop":
                    input.close();
                    System.exit(1);
                case "1":
                    while (true) {
                        System.out.println("Введите что добавить в очередь (stop для выхода):");
                        elem = input.next();
                        if (elem.equals("stop"))
                            break;
                        enqueue(ochered, elem);
                    }
                    break;
                case "2":
                    dequeue(ochered);
                    break;
                case "3":
                    first(ochered);
                    ;
                    break;
                default:
                    System.out.println("Введите корректную команду");
                    break;
            }
            System.out.println(ochered);
        }
    }

    static LinkedList<String> enqueue(LinkedList<String> temp_list, String str) {
        temp_list.addLast(str);
        return temp_list;
    }

    static LinkedList<String> dequeue(LinkedList<String> temp_list) {
        System.out.printf("Первый в очереди: %s - удален\n", temp_list.getFirst());
        temp_list.removeFirst();
        return temp_list;
    }

    static void first(LinkedList<String> temp_list) {
        System.out.printf("Первый в очереди: %s\n", temp_list.getFirst());
    }
}
