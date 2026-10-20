public class Main3 {
    public static void main(String[] args) {
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;
        double p = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        System.out.println("Площадь треугольника: " + area);

        int applePrice = 2;
        int numberOfApples = 6;
        double price = applePrice*numberOfApples;
        System.out.println("Общая стоимость 6 яблок " + price);

        double pricePerLiter = 1.2;
        double LitersPerHundred = 8;
        double distance = 120;
        double distancePerEight = 100;
        double distancePerLiter = distancePerEight/LitersPerHundred;
        double literDistance = distance/distancePerLiter;
        double totalPrice = literDistance * pricePerLiter;
        System.out.println("Цена на 120 км " + totalPrice);
    }
}
