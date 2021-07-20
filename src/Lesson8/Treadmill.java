package Lesson8;

public class Treadmill implements RunJump{

    private int dist;
    public Treadmill(int dist) {this.dist = dist; }

    @Override
    public boolean go(Individe i) { return i.run(dist);

    }
}
