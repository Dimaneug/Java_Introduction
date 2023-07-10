// Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4",
// "предмет":" Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика. 
// Студент Краснов получил 5 по предмету Физика.

package Home2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите json:");
        String json = scanner.nextLine();
        scanner.close();
        System.out.println(parseJson(json));
    }

    public static String parseJson(String json) {
        StringBuilder sb = new StringBuilder();
        json = json.substring(2, json.length()-2);
        String[] people = json.split("\\},\\{");
        for (String student : people) {
            String[] params = student.split(",");
            String surname, mark, subject;
            surname = params[0].split(":")[1].replaceAll("\"", "");
            mark = params[1].split(":")[1].replaceAll("\"", "");
            subject = params[2].split(":")[1].replaceAll("\"", "");
            sb.append("Студент ");
            sb.append(surname);
            sb.append(" получил ");
            sb.append(mark);
            sb.append(" по предмету ");
            sb.append(subject);
            sb.append(".\n");
        }
        return sb.toString();
    }
}
