// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными 
// телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть 
// отсортирован по убыванию числа телефонов.

package Home5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PhoneBook {

    HashMap<String, LinkedList<String>> book;

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add_phone("Андрей Андреев", "14819785");
        book.add_phone("Андрей Андреев", "47893984");
        book.add_phone("Сергей Сергеев", "27325039");
        book.add_phone("Андрей Андреев", "14819785"); //Повторный номер
        book.add_phone("Дим Димыч", "3587983");
        book.add_phone("Дим Димыч", "02954247");
        book.add_phone("Дим Димыч", "90285957");

        book.print();

        book.print("Дим Димыч");
    }

    public PhoneBook() {
        book = new HashMap<String, LinkedList<String>>();
    }

    public void add_phone(String name, String phone) {
        if (book.containsKey(name)) {
            LinkedList<String> phones = book.get(name);
            boolean hasPhone = false;
            for (String writtenPhone : phones) {
                if (writtenPhone.equals(phone)) {
                    hasPhone = true;
                    break;
                }
            }
            if (!hasPhone)
                phones.add(phone);
        } else {
            LinkedList<String> phones = new LinkedList<>();
            phones.add(phone);
            book.put(name, phones);
        }
    }

    public void print() {
        HashMap<String, Integer> names = new HashMap<>(book.size());
        for (String name : book.keySet()) {
            names.put(name, book.get(name).size());
        }

        names.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }

    public void print(String name) {
        System.out.println(name + ":");
        for (String phone : book.get(name)) {
            System.out.println(phone);
        }
    }
}
