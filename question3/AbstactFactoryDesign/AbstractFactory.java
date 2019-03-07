package Questions.question3.AbstactFactoryDesign;
enum CarType{
    MINI,MICRO,LUXURY;
}

enum Location{
    INDIA,USA,JAPAN;
}

abstract class Car{
    CarType carType;
    Location location;

    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", location=" + location +
                '}';
    }
}

class LuxuryCar extends Car{
    public LuxuryCar(Location location) {
        super(CarType.LUXURY,location);
    }

    @Override
    void construct() {
        System.out.println("Connecting to Luxury Car");
    }
}

class MiniCar extends Car{

    public MiniCar(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("Connecting to Mini Car");
    }
}

class Micro extends Car{


    public Micro(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    void construct() {
        System.out.println("Connecting to Micro Car");
    }
}

class IndiaCarFactory{
    static Car buildCar(CarType carType){
        Car car=null;
        switch (carType){
            case MINI:
                car=new MiniCar(Location.INDIA);
                break;
            case MICRO:
                car=new Micro(Location.INDIA);
                break;
            case LUXURY:
                car=new LuxuryCar(Location.INDIA);
                break;
        }
        return car;
    }
}

class USACarFactory{
    static Car buildCar(CarType carType){
        Car car=null;
        switch (carType){
            case LUXURY:
                car=new LuxuryCar(Location.USA);
                break;
            case MICRO:
                car=new Micro(Location.USA);
                break;
            case MINI:
                car=new MiniCar(Location.USA);
                break;
        }
        return car;
    }
}



class JapanCarFactory{
    static Car buildCar(CarType carType){
        Car car=null;
        switch (carType){
            case MINI:
                car=new MiniCar(Location.JAPAN);
                break;
            case MICRO:
                car=new Micro(Location.JAPAN);
                break;
            case LUXURY:
                car=new LuxuryCar(Location.JAPAN);
                break;
        }
        return car;

    }
}

class CarFactory{
    static Car buildCar(CarType carType,Location location){
        Car car= null;
        switch (location){
            case INDIA:
                car =IndiaCarFactory.buildCar(carType);
                break;
            case USA:
                car=USACarFactory.buildCar(carType);
                break;
            case JAPAN:
                car=JapanCarFactory.buildCar(carType);
                break;
        }
        return car;
    }
}
public class AbstractFactory {
    public static void main(String[] args) {
        MiniCar miniCar=new MiniCar(Location.INDIA);
        miniCar.construct();
        System.out.println(CarFactory.buildCar(CarType.MINI,Location.INDIA));
        LuxuryCar luxuryCar=new LuxuryCar(Location.INDIA);
        luxuryCar.construct();
        System.out.println(CarFactory.buildCar(CarType.LUXURY,Location.INDIA));
    }
}
