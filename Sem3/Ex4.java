// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
// что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях 
// - названия книг. Напишите метод для заполнения данной структуры.

package Sem3;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<ArrayList<String>>();
        fillCatalog(catalog);
        System.out.println(catalog);
    }

    public static void fillCatalog(List<ArrayList<String>> catalog) {
        ArrayList<String> genre1 = new ArrayList<String>();
        genre1.add("проза");
        genre1.add("Война и мир");
        genre1.add("12 стульев");
        genre1.add("Тарас Бульба");

        ArrayList<String> genre2 = new ArrayList<String>();
        genre2.add("поэзия");
        genre2.add("Евгений Онгеин");
        genre2.add("Бородино");
        genre2.add("Белая береза");

        ArrayList<String> genre3 = new ArrayList<String>();
        genre3.add("детектив");
        genre3.add("Шерлок Холмс");

        catalog.add(genre1);
        catalog.add(genre2);
        catalog.add(genre3);

    }
}
