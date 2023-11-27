package com.example.static_instancepractice.Car;

// 이렇게 코딩한 이유: name, model 값이 변경되는 정적메소드라고 생각했고 , speed는 상태가 변경되는것으로 보아 인스턴스 메소드로 설계함

//import lombok.Getter;
//import lombok.Setter;
//@Setter
//@Getter
//public class Car {
//    private String name;
//    private String model;
//    private double speed;
//    private Car(){}
//
//    public static Car of(String name,String model){
//        Car car =new Car();
//        car.name=name;
//        car.model=model;
//        car.speed=newSpeed;
//        return car;
//
//    }
//    public void newSpeed(double speed){
//        this.speed=speed;
//
//    }
//
//}

// 틀린이유:
// 1. fo 메서드내에서 speed 필드를 초기화 하는 방식에 문제가 있음 newSpeed는 인스턴스 매서드이므로 객체가 아직 완전히 생선되기 전인  of 매서드에서는 사용할 수 없음
// 2. 속성변경 name , model ,speed 모두 Car를 나타내는 속성이다 따라서 이들을 변경하는 메서드는 일반적으로 인스턴스 메서드로 구현하는것이 자연스러움

import lombok.Getter;
import lombok.Setter;

// 위의 힌트를 보고 다시 짠 코드
@Getter
@Setter
public class Car{
    private  String name;
    private  String model;
    private  double speed;

    public  Car(String name, String model, double speed){
        this.name=name;
        this.model=model;
        this.speed=speed;
    }

//    public double accelerate(double speed){
//        return this.getSpeed()+10;
//    }
//    public double getSpeed(){
//        return this.getSpeed();
//    }

    public void accelerate() {
        this.speed += 10;
    }

    public double getSpeed() {
        return this.speed;
    }
}

