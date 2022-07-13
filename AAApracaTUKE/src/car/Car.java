package car;

public class Car {
    private String brand;
    protected boolean started;

    Car car1= new PersonalCar("BMV",5);
    Car car2= new PersonalCar("VW", 9);
    Car car3= new Truck("Iveco", "zelezo");


    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }



    public boolean isStarted() {
        return started;
    }

    @Override
    public String toString() {
        return brand + '(' +
                (started ? "started" : "stopped") +
                ')';
    }
}

