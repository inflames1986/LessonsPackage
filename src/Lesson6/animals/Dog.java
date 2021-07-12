package Lesson6.animals;

public class Dog extends Animals  {

    private final int maxRun = 500;
    private final int maxSwim = 10;

    public Dog(String name, String ysi, String lapi, String hvost, int age) {
      super(name, ysi, lapi, hvost, age);
    }

    public int getMaxRun() {
        return maxRun;
    }

    public String getname() {return name; }

    public int getMaxSwim() {
        return maxSwim;
    }
}
