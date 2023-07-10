// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package Home2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "select * from students where ";
        System.out.println("Введите json:");
        String json = scanner.nextLine();
        scanner.close();
        System.out.println(str + jsonToFilter(json));
    }

    public static String jsonToFilter(String json) {
        json = json.substring(1, json.length()-1);
        String[] jsonString = json.split(", ");
        StringBuilder sb = new StringBuilder();
        for (String string : jsonString) {
            String[] params = string.replaceAll("\"", "").split(":");
            if (!params[1].equals("null")) {
                if (sb.length() > 0) sb.append(" and ");
                sb.append(params[0]);
                sb.append(" = '");
                sb.append(params[1]);
                sb.append("'");
            }
        }
        return sb.toString();
    }
}
