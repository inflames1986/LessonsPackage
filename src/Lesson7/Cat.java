package Lesson7;

public class Cat {

    private String name;
    private boolean satBoo = false;// начальная сытость кота фолс
    private int finalSatiety = 100;// необходимая сытость кота

    public Cat(String name, boolean satBoo, int finalSatiety) {
        this.name = name;
        this.satBoo = satBoo;
        this.finalSatiety = finalSatiety;
    }

    public String getName() {
        return name;
    }

    public boolean isSatBoo() {
        return satBoo;
    }

    public void eat(Plate plate) {

        int satiety = 0;
        satiety = satiety + plate.getAmount();// сытость равно нулевой сытости плюс количеству съеденной еды

        if ((satiety == finalSatiety) && (plate.getFood() >= plate.getAmount())) {
            satBoo = true;// если сытость полная и количества еды хватает
        System.out.println("Кот " + name + " ест..." + name + " " + satBoo + " cытость = " + satiety);
        plate.decrease();}
            else {
            System.out.println("Кот " + name + " крайне недоволен таким количеством еды и отказался есть");
            satiety = 0;
            System.out.println("Кот " + name + " не поел, сытость = " + satBoo + " " + satiety);
        }

    }
}
