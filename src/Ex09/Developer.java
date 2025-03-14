package Ex09;
class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        if (programmingLanguage.isEmpty()) {
            throw new IllegalArgumentException("Ngôn ngữ lập trình không được để trống.");
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ngôn ngữ lập trình: " + programmingLanguage;
    }
}