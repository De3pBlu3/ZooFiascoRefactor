// Animal.java
public class Animal {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(String[] favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    private String name;
    private String type;
    private String[] favoriteFoods;
    private String sound;

    public Animal(String name, String type, String[] favoriteFoods) {
        this.name = name;
        this.type = type;
        this.favoriteFoods = favoriteFoods;
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

    public void exercise() {
        System.out.println("Animal is exercising");
    }
    public void performTrick(){
        System.out.println("Animal is performing a track");
    }

    public void printFavoriteFoods() {
        if (favoriteFoods.length > 0) {
            System.out.println(name + "'s favorite food: " + favoriteFoods[0]);
        } else {
            System.out.println(name + " has no favorite food");
        }
    }
}
