package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = Car.builder().addEngineType("engine").addBodyColor("color").addWheelType("wheel").build();
        Car car2 = Car.builder().addEngineType("engine").addBodyColor("color").addWheelType("wheel").build();

        CarDealershipSingleton singleton = CarDealershipSingleton.getInstance();
        singleton.orderCar(car);
        singleton.orderCar(car2);
        singleton.printCarOrders();
    }
}
