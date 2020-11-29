import core.*;
import core.Camera;

import java.util.Scanner;

public class RoadController
{
    private static double passengerCarMaxWeight = 3500.0; // kg
    public void setPassengerCarMaxWeight (double d){
        passengerCarMaxWeight = d;
    }
    public void getPassengerCarMaxWeight (){
        return passengerCarMaxWeight;
    }

    private static int passengerCarMaxHeight = 2000; // mm
    public int setPassengerCarMaxHeight (int i){
        passengerCarMaxHeight = i;
    }
    public int getPassengerCarMaxHeight (){
        return passengerCarMaxHeight;
    }

    private static int controllerMaxHeight = 4000; // mm
    public int setControllerMaxHeight (int i1){
        controllerMaxHeight = i1;
    }
    public static int getControllerMaxHeight() {
        return controllerMaxHeight;
    }

    private static int passengerCarPrice = 100; // RUB
    public static void setPassengerCarPrice(int passengerCarPrice) {
        RoadController.passengerCarPrice = passengerCarPrice;
    }
    public static int getPassengerCarPrice() {
        return passengerCarPrice;
    }

    private static int cargoCarPrice = 250; // RUB
    public static int getCargoCarPrice() {
        return cargoCarPrice;
    }
    public static void setCargoCarPrice(int cargoCarPrice) {
        RoadController.cargoCarPrice = cargoCarPrice;
    }

    private static int vehicleAdditionalPrice = 200; // RUB

    public static void setVehicleAdditionalPrice(int vehicleAdditionalPrice) {
        RoadController.vehicleAdditionalPrice = vehicleAdditionalPrice;
    }

    public static int getVehicleAdditionalPrice() {
        return vehicleAdditionalPrice;
    }


    public static void main(String[] args)
    {
        System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);
        int carsCount = scanner.nextInt();

        for(int i = 0; i < carsCount; i++)
        {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if(price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car)
    {
        int carHeight = car.height;
        int price = 0;
        if (carHeight > controllerMaxHeight)
        {
            blockWay("высота вашего ТС превышает высоту пропускного пункта!");
            return -1;
        }
        else if (carHeight > passengerCarMaxHeight)
        {
            double weight = car.weight;
            //Грузовой автомобиль
            if (weight > passengerCarMaxWeight)
            {
                price = passengerCarPrice;
                if (car.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                }
            }
            //Легковой автомобиль
            else {
                price = cargoCarPrice;
            }
        }
        else {
            price = passengerCarPrice;
        }
        return price;
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay()
    {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason)
    {
        System.out.println("Проезд невозможен: " + reason);
    }
}