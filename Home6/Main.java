package Home6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(8, 500, 1, 1300, 1, 500));
        laptops.add(new Laptop(16, 500, 1, 1500, 3, 700));
        laptops.add(new Laptop(8, 250, 2, 1100, 4, 400));
        laptops.add(new Laptop(4, 250, 1, 1000, 1, 300));
        filterLaptops(laptops);
    }

    public static void filterLaptops(Set<Laptop> laptopsSet) {
        Map<Integer, Integer> filter = new HashMap<Integer, Integer>(5, 1.0f);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите цифру, соответствующую нужному критерию (0 - завершить)");
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем диска");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Вес");
            System.out.println("5 - Цвет");
            System.out.println("6 - Цена");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Вы ввели не число! "+ e);
                break;
            }
            if (choice < 0 || choice > 6) {
                System.out.println("Вы ввели неверный номер!");
                continue;
            }
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    int ram;
                    while (true) {
                        System.out.print("Введите желаемый объём ОЗУ в ГБ: ");
                        try {
                            ram = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("Вы ввели неверное число!");
                            continue;
                        }
                        if (ram < 0) {
                            System.out.println("Объём должен быть не меньше 0!");
                            continue;
                        }
                        break;
                    }
                    filter.put(1, ram);
                    break;

                case 2:
                    int diskCapacity;
                    while (true) {
                        System.out.print("Введите желаемый объём диска в ГБ: ");
                        try {
                            diskCapacity = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("Вы ввели неверное число!");
                            continue;
                        }
                        if (diskCapacity < 0) {
                            System.out.println("Объём должен быть не меньше 0!");
                            continue;
                        }
                        break;
                    }
                    filter.put(2, diskCapacity);
                    break;

                case 3:
                    int os;
                    while (true) {
                        System.out.println("Введите номер желаемой ОС");
                        System.out.println("1 - Windows");
                        System.out.println("2 - Linux");
                        try {
                            os = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("Вы ввели неверное число!");
                            continue;
                        }
                        if (os < 1 || os > 2) {
                            System.out.println("Вы ввели неверный номер!");
                            continue;
                        }
                        break;
                    }
                    filter.put(3, os);
                    break;

                case 4:
                    int weight;
                    while (true) {
                        System.out.print("Введите желаемый вес в граммах: ");
                        try {
                            weight = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("Вы ввели неверное число!");
                            continue;
                        }
                        if (weight < 0) {
                            System.out.println("Вес должен быть не меньше 0!");
                            continue;
                        }
                        break;
                    }
                    filter.put(4, weight);
                    break;

                case 5:
                    int color;
                    while (true) {
                        System.out.println("Введите номер желаемого цвета");
                        System.out.println("1 - Чёрный");
                        System.out.println("2 - Серый");
                        System.out.println("3 - Красный");
                        System.out.println("4 - Фиолетовый");
                        try {
                            color = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("Вы ввели неверное число!");
                            continue;
                        }
                        if (color < 1 || color > 4) {
                            System.out.println("Вы ввели неверный номер!");
                            continue;
                        }
                        break;
                    }
                    filter.put(5, color);
                    break;

                case 6:
                    int price;
                    while (true) {
                        System.out.print("Введите желаемую цену в долларах: ");
                        try {
                            price = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            System.out.println("Вы ввели неверное число!");
                            continue;
                        }
                        if (price < 0) {
                            System.out.println("Цена должна быть не меньше 0!");
                            continue;
                        }
                        break;
                    }
                    filter.put(6, price);
                    break;
                default:
                    break;
            }
            for (int i = 1; i < 7; i++) {
                if (!filter.containsKey(i))
                    filter.put(i, 0);
            }
        }
        scanner.close();
        System.out.println("\nПодходящие ноутбуки:");
        for (Laptop laptop : laptopsSet) {
            boolean match = true;
            for (Map.Entry<Integer, Integer> param : filter.entrySet()) {
                switch (param.getKey()) {
                    case 1:
                        if (param.getValue() > laptop.getRam() && param.getValue() != 0)
                            match = false;
                        break;
                    case 2:
                        if (param.getValue() > laptop.getDiskCapacity() && param.getValue() != 0)
                            match = false;
                        break;
                    case 3:
                        if (param.getValue() != laptop.getOs() && param.getValue() != 0)
                            match = false;
                        break;
                    case 4:
                        if (param.getValue() < laptop.getWeight() && param.getValue() != 0)
                            match = false;
                        break;
                    case 5:
                        if (param.getValue() != laptop.getColor() && param.getValue() != 0)
                            match = false;
                        break;
                    case 6:
                        if (param.getValue() < laptop.getPrice() && param.getValue() != 0)
                            match = false;
                        break;
                    default:
                        break;
                }
                if (!match)
                    break;
            }
            if (match)
                System.out.println(laptop);
        
        }

    }
}
