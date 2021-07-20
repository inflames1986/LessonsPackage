package Lesson8;

public class Wall implements RunJump {

    private int height;
    public Wall(int height) {this.height = height; }

    @Override
    public boolean go(Individe i) { return i.jump(height);

    }
}


