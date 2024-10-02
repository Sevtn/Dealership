package com.company;


import java.util.ArrayList;
import java.util.List;

public class CarDealershipSingleton {


    private CarDealershipSingleton() {}

    static List<Car> someList;
    static CarDealershipSingleton carDealershipSingleton;

    static public CarDealershipSingleton getInstance() {
        if (carDealershipSingleton != null) return carDealershipSingleton;
        carDealershipSingleton = new CarDealershipSingleton();
        someList = new ArrayList<>();
        return carDealershipSingleton;
    }
    public void orderCar (Car car) {
        someList.add(car);
    }

    public void printCarOrders(){
        System.out.println(someList);
    }


}
