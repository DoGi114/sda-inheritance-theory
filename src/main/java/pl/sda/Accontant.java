package pl.sda;

import java.math.BigDecimal;

//        1. Utworz klase Accountant dziedziczaca po Employee, powinna dodatkowo:
//                - miec pole z informacja o przepracowanych latach (int) - pamietaj o setterach lub ustawieniu tego przez konstruktor
//                - roczna pensja powinna byc powiekszona o tyle razy ile wynosza przepracowane lata
public class Accontant extends Employee {
    private int workedForYears;

    public Accontant(String name, String surname, BigDecimal salary, Integer age, int workedForYears) {
        super(name, surname, salary, age);
        this.workedForYears = workedForYears;
    }

    public int getWorkedForYears() {
        return workedForYears;
    }

    public void setWorkedForYears(int workedForYears) {
        this.workedForYears = workedForYears;
    }

    @Override
    public BigDecimal yearlySalary() {
        return super.yearlySalary().multiply(new BigDecimal(workedForYears));
    }
}
