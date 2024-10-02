package com.company;

public class Car {
    private String EngineType;
    private String BodyColor;
    private String WheelType;



    public Car(String EngineType, String BodyColor, String WheelType) {
        this.EngineType = EngineType;
        this.BodyColor = BodyColor;
        this.WheelType = WheelType;
    }

    public static CarBuilder builder(){
        return new CarBuilder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "EngineType='" + EngineType + '\'' +
                ", BodyColor='" + BodyColor + '\'' +
                ", WheelType='" + WheelType + '\'' +
                '}';
    }

    }



