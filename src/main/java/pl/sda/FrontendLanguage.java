package pl.sda;

public enum FrontendLanguage {
    JS("JavaScript");

    private String value;

    FrontendLanguage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
