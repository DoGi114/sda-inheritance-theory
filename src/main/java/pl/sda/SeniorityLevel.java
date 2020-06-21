package pl.sda;

public enum SeniorityLevel {
    Intern("Intern"),
    Junior("Junior"),
    Mid("Mid"),
    Senior("Senior"),
    FullStack("Full stack"),
    ProjectManager("Project manager");

    private String value;

    SeniorityLevel(String value) {
        this.value = value;

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
