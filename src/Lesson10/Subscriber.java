package Lesson10;

import java.util.HashSet;
import java.util.Set;

public class Subscriber {



    private String fam;
    private Set<String> numbers = new HashSet<>();

    public Subscriber(String fam, Set<String> numbers) {
        this.fam = fam;
        this.numbers = numbers;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public Set<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(Set<String> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Абонент: {" +
                "Фамилия: '" + fam + '\'' +
                ", Номера телефонов: " + numbers +
                '}';
    }}


