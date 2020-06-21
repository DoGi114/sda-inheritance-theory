package pl.sda;

import java.math.BigDecimal;

public class JavaProgrammer extends Programmer {

    public JavaProgrammer(String name, String surname, BigDecimal salary, Integer age, SeniorityLevel seniorityLevel) {
        super(name, surname, salary, age, BackendLanguage.Java, seniorityLevel);
    }

    @Override
    public void setBackendLanguage(BackendLanguage backendLanguage) {
        try{
        if (BackendLanguage.Java.equals(backendLanguage)) {
            super.setBackendLanguage(backendLanguage);
        } else {
            throw new Exception("This has to be JAVA!!!!!");
        }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
