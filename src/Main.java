public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var LiftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = LiftingCapacity - stuffWeight;
        System.out.println("Ещё можно положить " + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var zucchiniWeight = 2;
        var peppersWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumberWeight + zucchiniWeight + peppersWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг! ");

        var leftWeight = LiftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг! ");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        leftWeight = LiftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг! ");

        var overload = (stuffWeight + productsWeight) % LiftingCapacity;
        System.out.println("Перегруз на " + overload + " кг! ");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктров в одной машине теперь " + productsInOneCar);

        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг ");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);

    }
}