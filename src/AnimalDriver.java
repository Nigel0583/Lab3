public class AnimalDriver {
    public static void main(String[] args) {

String[] con= { "Africa","Antarctica","Asia","Europe","North America","South America","Australia" };
        Animal animal = new Animal();
        animal.setWeight(200);
        animal.setAge(4);
        animal.setType("Lion");


       for (int i =0; i<=6; i++){
           String item= con[i];
           animal.setContinents(item);


        }


        System.out.print(animal.toString());

    }
}
