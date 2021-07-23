package Lesson8;

public class Cat implements Individe {

    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;//имя
        this.maxRun = maxRun; //максимальная дистанция
        this.maxJump = maxJump; //максимальная высота
    }

    public Cat() {
        this("Cat1", 300, 100);// исходный кот с дефаултными параметрами
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int r) { //r дистанция для бега кота
        if (r <= maxRun) {
            System.out.println(name + " пробежал дистанцию " + r);
            return true;
        } else
            System.out.println(name + " не может пробежать дистанцию в " + r + " и выбывает");
        return false;
    }

        @Override
        public boolean jump ( int jmp){ //jmp высота прыжка кота
            if (jmp <= maxJump) {
                System.out.println(name + " прыгнул на высоту " + jmp);
                return true;
            } else
                System.out.println(name + " не может прыгнуть на высоту в " + jmp + " и выбывает");
            return false;


    }
}
