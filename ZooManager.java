// ZooManager.java
public class ZooManager extends Zookeeper {
    private String name;

    public ZooManager(String name) {
        super(name);
    }

    public void announce(String message) {
        System.out.println("Zoo Manager " + name + " announces: " + message);
    }
}
