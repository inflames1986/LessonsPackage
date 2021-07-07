package Lesson5;

public class Slave {
        private String fio; //
        private String position;
        private String tNumber;
        private int payday;
        private int age;

    public Slave(String fio, String position, String tNumber, int payday, int age) {
        this.fio = fio;
        this.position = position;
        this.tNumber = tNumber;
        this.payday = payday;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printHead() {

        System.out.printf("%-35s %-20s %-20s %-10s %-10s\n", "Фамилия Имя Отчество", "Должность", "Номер телефона", "Зарплата", "Возраст");

    }

    public void slaveInfo() {

    System.out.printf("%-35s %-20s %-20s %-10d %-10d\n", fio, position, tNumber, payday, age);
    }

    @Override
    public String toString() {
        return "Slave{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", tNumber='" + tNumber + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}


