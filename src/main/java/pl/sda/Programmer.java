package pl.sda;

import java.math.BigDecimal;

public class Programmer extends Employee {
    private BackendLanguage backendLanguage;
    private SeniorityLevel seniorityLevel;

    public Programmer(String name, String surname, BigDecimal salary, Integer age, BackendLanguage backendLanguage, SeniorityLevel seniorityLevel) {
        super(name, surname, salary, age);
        this.backendLanguage = backendLanguage;
        this.seniorityLevel = seniorityLevel;
    }

    public BackendLanguage getBackendLanguage() {
        return backendLanguage;
    }

    public void setBackendLanguage(BackendLanguage backendLanguage) {
        this.backendLanguage = backendLanguage;
    }

    public SeniorityLevel getSeniorityLevel() {
        return seniorityLevel;
    }

    public void setSeniorityLevel(SeniorityLevel seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "backendLanguage='" + backendLanguage.getValue() + '\'' +
                ", seniorityLevel='" + seniorityLevel.getValue() + '\'' +
                '}';
    }
}
