package Ex09;

class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        this.bonus = 0.0;
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        if (bonus < 0) {
            throw new IllegalArgumentException("Tiền thưởng không hợp lệ.");
        }
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tiền thưởng: " + bonus;
    }
}

