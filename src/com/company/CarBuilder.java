package com.company;

public class CarBuilder {
     String EngineType;
    String BodyColor;
    String WheelType;


    public CarBuilder addEngineType (String EngineType){
        this.EngineType = EngineType;
        return this;


    }
    public CarBuilder addBodyColor (String BodyColor){
        this.BodyColor = BodyColor;
        return this;
    }
    public CarBuilder addWheelType (String WheelType){
        this.WheelType = WheelType;
        return this;
    }

    public Car build(){
        if ((EngineType == null || EngineType.isEmpty()) || (BodyColor == null || BodyColor.isEmpty())||(WheelType == null || WheelType.isEmpty())){
            throw new IllegalArgumentException("EngineType, BodyColor and WheelType must be filled.");
        }
        return new Car(EngineType, BodyColor,WheelType);
    }

}
