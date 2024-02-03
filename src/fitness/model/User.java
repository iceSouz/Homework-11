package fitness.model;

import fitness.Month;

import java.time.LocalDate;
import java.util.Arrays;


public class User {
    private String name;
    private String lastName;
    private int day;
    private Month month;
    private int year;
    private String email;
    private long phoneNumber;
    private double weight;
    private int[] pressure;
    private int stepsCount;
    private int age;

    public User(
            String name, String lastName, int day, Month month, int year, String email,
            long phoneNumber, double weight, int[] pressure, int stepsCount
    ) {
        this.name = name;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = Arrays.copyOf(pressure, pressure.length);
        this.stepsCount = stepsCount;
        this.age = calculateAge();
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int[] getPressure() {
        return Arrays.copyOf(pressure, pressure.length);
    }

    public void setPressure(int[] pressure) {
        this.pressure = Arrays.copyOf(pressure, pressure.length);
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.printf("%s %s, date of birth: %s %d, %d, age = %d years old, e-mail: %s, phone number: +%d, " +
                        "weight: %.1f kg, blood pressure: systolic = %d, diastolic = %d; steps count: %d\n",
                name, lastName, month, day, year, age, email, phoneNumber, weight, pressure[0], pressure[1], stepsCount
        );
    }

    private int calculateAge() {
        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.of(now.getYear(), month.getNumberOfMonth(), day);

        if (now.isBefore(birth)) {
            return now.getYear() - year - 1;
        }

        return now.getYear() - year;
    }
}
