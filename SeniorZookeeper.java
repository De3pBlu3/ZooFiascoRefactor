public class SeniorZookeeper extends Zookeeper{
    private String name;

    public SeniorZookeeper(String name) {
<<<<<<< HEAD
        super(name);
        super.salary = 500_000;
    }

    public void giveMedicine(Animal animal) {
        super.setResponsibilites("Give medicine");
        System.out.println(name + " is giving medicine to " + animal.type);
=======
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println(name + " is feeding " + animal.getName());
    }

    public void cleanCage(Animal animal) {
        System.out.println(name + " is cleaning " + animal.getType() + "'s cage");
    }

    public void giveMedicine(Animal animal) {
        System.out.println(name + " is giving medicine to " + animal.getType());
>>>>>>> 3d02e8dbc14fe2f4e88f140124df3db718445396
    }
}
