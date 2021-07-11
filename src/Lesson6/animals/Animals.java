package Lesson6.animals;


public class Animals {
    protected String name;
    protected String ysi;
    protected String lapi;
    protected String hvost;
    protected int age;

    public Animals(String name, String ysi, String lapi, String hvost, int age) {
        this.name = name;
        this.ysi = ysi;
        this.lapi = lapi;
        this.hvost = hvost;
        this.age = age;
    }

    public void run(int distRun) {

        System.out.println(name + " пробежал " + distRun + " метров!");

    }

    public void norun(int distRun) {

        System.out.println(name + " не может пробежать " + distRun + " метров!");

    }

    public void swim(int distSwim) {

                System.out.println(name + " проплыл " + distSwim + " метров!" );

    }

    public void noSwim(int distSwim) {

        System.out.println(name + " не cможет проплыть " + distSwim + " метров!" );

    }



}







