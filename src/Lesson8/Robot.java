package Lesson8;

public class Robot implements Individe{

    private String name;
    private int maxRun;
    private int maxJump;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot() {
        this("Robot1", 300, 100);
    }

    @Override
    public boolean run(int r) {
        if (r <= maxRun) {
            System.out.println(name + " пробежал дистанцию " + r);
            return true;
        } else
            System.out.println(name + " не может пробежать дистанцию в " + r + " и выбывает");
        return false;
    }

    @Override
    public boolean jump ( int jmp){
        if (jmp <= maxJump) {
            System.out.println(name + " прыгнул на высоту " + jmp);
            return true;
        } else
            System.out.println(name + " не может прыгнуть на высоту в " + jmp + " и выбывает");
        return false;


    }
}