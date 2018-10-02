public class Bicycle {
    String name;
    double value;
    String make;

    public String getName() {
        return name;
    }

    public String getMake(){
        return make;
    }

    public double getValue(){
        return value;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Bicycle(){
        setName("None");
        setMake("None");
        setValue(0.0);
    }

    public String toString(){
        return "Name " +getName()+ "\nMake " +getMake()+ "\nValue " +getValue();
    }

    public Bicycle(String name, String make, double value){
        setName(name);
        setMake(make);
        setValue(value);
    }



}
