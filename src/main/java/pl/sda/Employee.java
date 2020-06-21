package pl.sda;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private BigDecimal salary;
    private Integer age;

    public Employee(String name, String surname, BigDecimal salary, Integer age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal yearlySalary() {
        return this.salary.multiply(new BigDecimal("12")) ;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
