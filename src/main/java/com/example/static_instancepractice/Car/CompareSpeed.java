package com.example.static_instancepractice.Car;
//
//public class CompareSpeed {
//
//    public static void main(String[] args) {

//        System.out.println(whichOneFaster);
//    }
//
//    private Car car;
//
//    public CompareSpeed(Car car){
//        this.car=car;
//    }
//
//    public String whichOneFaster(Car car1,Car car2){
//        double car1Speed= car1.getSpeed();
//        String car1Model=car1.getModel();
//        double car2Speed= car2.getSpeed();
//        String car2Model=car2.getModel();
//        if(car1Speed>car2Speed){
//            return car1Model;
//        } else {
//           return car2Model;
//        }
//    }
//}

public class CompareSpeed{
    private final Car car;
    public CompareSpeed(Car car){
        this.car = car;
    }

    public static void main(String[] args) {
        Car car1=new Car("sdk","sdk12",120.00);
        Car car2=new Car("y2k","y2k12",110.00);

        String fasterCarModel = whichOneFaster(car1, car2);
        System.out.println("더 빠른 차는: " + fasterCarModel);
    }


        public static String whichOneFaster(Car car1, Car car2){
        double car1Speed= car1.getSpeed();
        String car1Model=car1.getModel();
        double car2Speed= car2.getSpeed();
        String car2Model=car2.getModel();
        if(car1Speed>car2Speed){
            return car1Model;
        } else {
           return car2Model;
        }
    }
}
