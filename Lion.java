public class Lion extends Animal {

    public Lion(String name, String[] favoriteFoods, String sound) {
        super(name, "lion", favoriteFoods);
    }

    @Override
    public void makeSound() {
        System.out.println("RAWWWWWWRRRRRRRRR");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + "the" + getType() + " is sleeping");
    }

    @Override
    public void exercise() {
        System.out.println(getName() + "the" + getType() + " is exercising");
    }

    @Override
    public void performTrick(){
        System.out.println(getName() + "the" + getType() + " is performing a trick");
        System.out.println("It JUMPS and SPINS and does a big ROAR!");
    }
}
