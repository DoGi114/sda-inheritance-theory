package pl.sda;

public enum BackendLanguage {
    Java("Java"),
    Cpp("C++"),
    C("C)"),
    ObjectiveC("Objective C"),
    CS("C#"),
    Delphi("Delphi");

    private String value;

    BackendLanguage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
