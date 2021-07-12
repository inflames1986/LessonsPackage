package Lesson6.animals;

public class Cat extends Animals {

   private final int maxRun = 200;
   private final int maxSwim = 0;


   public Cat(String name, String ysi, String lapi, String hvost, int age) {
      super(name, ysi, lapi, hvost, age);
   }



   public int getMaxRun() {
      return maxRun;
   }

   public int getMaxSwim() {
      return maxSwim;
   }

   public String getname() {return name; }





   public void catcantswim() {

      System.out.println(name + " плавать не умеет, так что вводить дистанцию бесполезно");
   }
}
