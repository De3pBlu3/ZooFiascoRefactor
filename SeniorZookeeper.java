public class SeniorZookeeper extends Zookeeper{
    private String name;

    public SeniorZookeeper(String name) {
        super(name);
        super.salary = 500_000;
    }

    public void giveMedicine(Animal animal) {
        super.setResponsibilites("Give medicine");
        System.out.println(name + " is giving medicine to " + animal.getType());
    }

}
