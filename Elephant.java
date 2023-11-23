public class Elephant extends Animal{

    public Elephant(String name, String type, String[] favoriteFoods) {
        super(name, type, favoriteFoods, type);
    }
    
    @Override
    public void exercise() {
        System.out.println("Elephant is lifting weights");
    }

    @Override
    public void makeSound() {
        System.out.println("Blair");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName() + " with " + getFavoriteFoods()[0]);
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping");
    }

    @Override
    public void performTrick(){
        System.out.println("Elephant is performing a track");
    }
}
