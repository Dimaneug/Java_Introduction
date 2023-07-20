package Home6;

public class Laptop {
    int ram; // объем озу в ГБ
    int diskCapacity; // Объём диска в ГБ
    int os; // 1 - windows, 2 - linux
    int weight; // вес в граммах
    int color; // 1 - чёрный, 2 - серый, 3 - красный, 4 - фиолетовый
    int price; // цена в долларах

    public Laptop(int ram, int diskCapacity, int os, int weight, int color, int price) {
        this.ram = ram;
        this.diskCapacity = diskCapacity;
        this.os = os;
        this.weight = weight;
        this.color = color;
        this.price = price;
    }

    public void changePrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return this.ram;
    }

    public int getDiskCapacity() {
        return this.diskCapacity;
    }

    public int getOs() {
        return this.os;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.hashCode());
        sb.append(": ОЗУ - ");
        sb.append(ram);
        sb.append("ГБ, Объём диска - ");
        sb.append(diskCapacity);
        sb.append("ГБ, ОС - ");
        if (os == 1) {
            sb.append("Windows");
        } else {
            sb.append("Linux");
        }
        sb.append(", Вес - ");
        sb.append(weight);
        sb.append("гр, Цвет - ");
        switch (color) {
            case 1:
                sb.append("Чёрный");
                break;
            case 2:
                sb.append("Серый");
                break;
            case 3:
                sb.append("Красный");
                break;
            case 4:
                sb.append("Фиолетовый");
                break;
            default:
                break;
        }
        sb.append(", Цена - ");
        sb.append(price);
        sb.append("$");
        return sb.toString();
    }
}
