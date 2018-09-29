public class Animal {

    private String type;
    private int age;
    private String continents  ;
    private double weight;


    public String getType() {
        return type;
    }

    public String getContinents(){
        return continents;
    }

    public double getWeight(){
        return weight;
    }

    public int getAge() {
        return age;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContinents(String continents) {
        this.continents = continents;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public Animal(){
        this.type = "No Type Specified";
        this.age = 0;
        this.continents = null;
        this.weight = 0.0;
    }

    public String toString(){
        return "\ntype " +type+ "\nage " +age+ "\ncontinents " +continents+ "\nweight " +weight;
    }

    public Animal(String type, int age, String continents, double weight){
        setType(type);
        setAge(age);
        setContinents(continents);
        setWeight(weight);
    }


}


