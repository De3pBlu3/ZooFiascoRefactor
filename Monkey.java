import java.util.Arrays;

public class Monkey extends Animal{
    public Monkey(String name, String[] favoriteFoods, String sound) {
        super(name, "monkey", favoriteFoods, sound);
    }
    @Override
    public void performTrick(){
        System.out.println(getName() + " the " + getType() + " +  performed a trick, like a monkey on a stick.");
    }
    @Override
    public void makeSound(){
        System.out.println("Ooh ooh aah aah");
    }
    @Override
    public void feed(){
        System.out.println(getName() + " the " + getType() + " is eating " + Arrays.toString(getFavoriteFoods()));
    }
    @Override
    public void sleep(){
        System.out.println(getName() + " the " + getType() + " is sleeping.");
    }
    @Override
    public void exercise(){
        System.out.println(getName() + " the " + getType() + " is excercising.");
    }
}
