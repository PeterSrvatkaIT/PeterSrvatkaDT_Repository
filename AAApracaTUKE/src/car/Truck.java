package car;

public class Truck extends Car{

    public String load;

    public Truck (String brand, String load){
        super(brand);
        this.load=load;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;


    }
    public void unload() {
        setLoad(null);
    }

}
