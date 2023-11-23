import java.util.Arrays;

public class Monkey extends Animal{
    public Monkey(String name, String[] favoriteFoods) {
        super(name, "monkey", favoriteFoods);
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
        System.out.println(getName() + " the " + getType() + " is eating " + Arrays.toString(getFavoriteFoods()[0].toCharArray()));
    }

    @Override
    public void exercise(){
        System.out.println(getName() + " the " + getType() + " is excercising.");
    }
}
