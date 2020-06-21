package pl.sda;

import java.math.BigDecimal;
//        2. Utworz klase FullstackProgrammer, ktora bedzie dziedziczyla z klasy JavaProgrammer, powinna dodatkowo:
//                - miec pole frontendLanguage (+setter)
//                - roczna pensja powinna byc powiekszona DODATKOWO WZGLEDEM PROGRAMISTY JAVA o 300%
public class FullstackProgrammer extends JavaProgrammer {
    private FrontendLanguage frontendLanguage;

    public FullstackProgrammer(String name, String surname, BigDecimal salary, Integer age, FrontendLanguage frontendLanguage) {
        super(name, surname, salary, age, SeniorityLevel.FullStack);
        this.frontendLanguage = frontendLanguage;
    }

    @Override
    public BigDecimal yearlySalary() {
        return super.yearlySalary().multiply(new BigDecimal("3"));
    }

    public FrontendLanguage getFrontendLanguage() {
        return frontendLanguage;
    }

    public void setFrontendLanguage(FrontendLanguage frontendLanguage) {
        this.frontendLanguage = frontendLanguage;
    }
}
