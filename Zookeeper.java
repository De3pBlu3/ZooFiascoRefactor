// Zookeeper.java
public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " is feeding " + animal.getName());
    }

    public void cleanCage(Animal animal) {
        System.out.println(name + " is cleaning " + animal.getType() + "'s cage");
    }
}
