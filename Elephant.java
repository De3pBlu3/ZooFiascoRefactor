public class Elephant extends Animal{

    public Elephant(String name, String type, String[] favoriteFoods) {

        super(name, type, favoriteFoods);
    }

    @Override
    public void exercise() {
        System.out.println("Elephant is lifting weights");
    }

    public void makeSound() {
        System.out.println("Blair");
    }

}
