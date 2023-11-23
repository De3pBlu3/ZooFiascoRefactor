public class JuniorZookeeper extends Zookeeper {
    private String name;

    public JuniorZookeeper(String name) {
        super(name);
    }

    public void collectFeces(Animal animal) {
        super.setResponsibilites("Collect feces");
        System.out.println("You have collected the animals feces");
    }
}