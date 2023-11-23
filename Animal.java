// Animal.java
public class Animal {
    private String name;
    private String type;
    private String[] favoriteFoods;
    private String sound;

    public Animal(String name, String type, String[] favoriteFoods, String sound) {
        this.name = name;
        this.type = type;
        this.favoriteFoods = favoriteFoods;
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(sound);
    }

    public void feed() {
        System.out.println("Feeding " + name + " with " + favoriteFoods[0]);
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

}
