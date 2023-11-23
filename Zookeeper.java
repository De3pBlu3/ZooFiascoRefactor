import java.util.ArrayList;

public class Zookeeper {
    private String name;
    public int salary;
    private ArrayList<String> Responsibilites;
    public Zookeeper(String name) {
        this.name = name;
        this.salary = 25_000;
        this.Responsibilites = new ArrayList<>();
        basicResponsibilies();
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " is feeding " + animal.getName());
    }
    public int getSalary() {
        return this.salary;
    }
    public void getResponsibilites(){
        this.Responsibilites.forEach((e) -> {
            System.out.println(e);
        });
    }
    public void setResponsibilites(String task) {
        this.Responsibilites.add(task);
    }
    public void basicResponsibilies(){
        this.Responsibilites.add("Clean cage");
        this.Responsibilites.add("Feed animal");
    }
    public void cleanCage(Animal animal) {
        System.out.println(name + " is cleaning " + animal.getType() + "'s cage");
    }
}
