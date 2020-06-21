package pl.sda;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // funWithInheritance();
        /*

        3. Do jednej z klas dopisz toString, tak aby po ich uruchomieniu było widoczne imie, nazwisko i roczna pensja
        4. Utworz obiekt każdej klasy i ustaw wynagrodzenia w każdym z nich na 1000, nie zapomnij o ustawieniu imienia i nazwiska
        5. Wypisz wszystkie obiekty na konsole, sprawdz czy zadanie zostalo wykonane prawidlowo
        ** pole salary zmien na BigDecimal
         */

        Employee employee = new Employee("Damian", "Nguyen", new BigDecimal("1000"), 27);
        Accontant accontant = new Accontant("Damian", "Nguyen", new BigDecimal("1000"), 27, 5);
        Programmer programmer = new Programmer("Damian", "Nguyen", new BigDecimal("1000"), 27, BackendLanguage.Delphi, SeniorityLevel.Mid);
        JavaProgrammer javaProgrammer = new JavaProgrammer("Damian", "Nguyen", new BigDecimal("1000"), 27, SeniorityLevel.Junior);
        FullstackProgrammer fullstackProgrammer = new FullstackProgrammer("Damian", "Nguyen", new BigDecimal("1000"), 27, FrontendLanguage.JS);


    }

    private static void funWithInheritance() {
        //* Ile jedna klasa moze rozszerzac klas? Jedną
        //* Co jesli klasa nie ma konstruktora domyslnego? (Java wygeneruje)
        //* Czy klasa dziedziczaca ma dostep do pol klasy bazowej? Zwykle nie, bo powinny byc prywatne (jak nie sa prywatne to ma dostep)
        //* Czy moge przypisc obiekt klasy Programmer do zmiennej klasy Employee? tak
        //* Czy moge przypisc zmienna klasy Employee do obiektu klasy Programmer? nie, bo bedzie brakowalo pol
        //* Co z metodami statycznymi i polami statycznymi? tutaj skonczylismy
        //* Jak zrobic, zeby obiekty Programmer zwracaly innego toStringa?
        //* Jak zrobic, zeby roczna pensja dla programisty byla podwojna?
        //* Jak stworzyc osobna klase programisty dla programistow Java?
        //* Po jakiej klasie dziedziczy każda klasa w Java?
        //* Czy mogę zaimplementować własną wersję klasy służącej do porównywania?
        //* Jaka jest kolejność wywoływania konstruktorów?

    }
}
