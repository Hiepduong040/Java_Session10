package Ex03;

import java.time.Year;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        int currentYear = Year.now().getValue(); // Lấy năm hiện tại
        if (year > 1885 && year <= currentYear) { // Xe hơi xuất hiện từ năm 1886
            this.year = year;
        } else {
            System.out.println("Năm sản xuất không hợp lệ! Phải từ 1886 đến " + currentYear);
        }
    }

}
