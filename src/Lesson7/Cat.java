package Lesson7;

public class Cat {

    private String name;
    private int satiety = 0;// начальная сытость кота
    private int finalSatiety = 100;// необходимая сытость кота

    public Cat(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {

        satiety = satiety + plate.getAmount();// сытость равно нулевой сытости плюс количеству съеденной еды
        if ((satiety == finalSatiety) && (plate.getFood() >= plate.getAmount())) {// если сытость полная и количества еды хватает
        System.out.println("Кот " + name + " ест..." + name + " cытость = " + satiety);
        plate.decrease();}
            else {
            System.out.println("Кот " + name + " крайне недоволен таким количеством еды и отказался есть");
            satiety = 0;
            System.out.println("Кот " + name + " не поел, сытость = " + satiety);
        }

    }
}
