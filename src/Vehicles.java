public class Vehicles {
   private String make, model, size;
   private double engine;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getEngine() {
        return engine;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }


    public String toString() {
        return "Make" +getMake()+  "\nModel" +getModel()+
                "\nSize" +getSize()+ "\nEngine Size" + getEngine();
    }

    public Vehicles(){
        setMake("None");
        setModel("Unknown");
        setSize("None");
        setEngine(0.0);
    }

    public  Vehicles( String make,String model, String size, double engine ){
        setMake(make);
        setModel(model);
        setSize(size);
        setEngine(engine);

    }
}

