public class Chapter09 {
    public static void main(String[] args) {
        // �R��iKm/L�j
        double fuelCost = 12.5;
        // �c�ʁiL�j
        double fuelAmount = 55.0;

        Chapter09_Car car = new Chapter09_Car(fuelCost, fuelAmount);

        car.move(20);
        System.out.println("�c�ʂ́A" + car.getFuelAmount() + "�ł�");
    }
}