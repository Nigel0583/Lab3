public class AnimalDriver {
    public static void main(String[] args) {

        String[] continents = { "Africa"};

        Animal animal = new Animal();


        animal.setWeight(200);
        animal.setAge(4);
        animal.setType("Lion");
        animal.setContinents(continents);

        System.out.println(animal.toString());


    }
}
