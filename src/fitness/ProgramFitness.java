package fitness;

import fitness.model.User;


public class ProgramFitness {
    public static void main(String[] args) {
        User anna = new User(
                "Anna", "Ivanova", 3, Month.FEBRUARY, 1985,
                "anna.ivanova@gmail.com", 380991234567L,
                65.5, new int[]{120, 80}, 8500
        );

        User peter = new User(
                "Peter", "Sidorov", 25, Month.JULY, 1990,
                "p.sidorov@gmail.com", 380931112233L,
                80, new int[]{130, 85}, 10_000
        );

        User olga = new User(
                "Olga", "Petrova", 10, Month.JANUARY, 1976,
                "olga.petrova@gmail.com", 380971234567L,
                70.2, new int[]{125, 82}, 7500
        );

        User ivan = new User(
                "Ivan", "Kozlov", 3, Month.MAY, 1982,
                "ivan.kozlov@gmail.com", 380501234567L,
                90.6, new int[]{140, 90}, 6000
        );

        User ekaterina = new User(
                "Ekaterina", "Morozova", 20, Month.SEPTEMBER, 1995,
                "ekaterina.morozova@gmail.com", 380631234567L,
                61.8, new int[]{110, 75}, 12_000
        );

        anna.printAccountInfo();
        peter.printAccountInfo();
        olga.printAccountInfo();
        ivan.printAccountInfo();
        ekaterina.printAccountInfo();

        System.out.println("========================================================================");

        anna.setStepsCount(15_000);
        anna.setLastName("Melnik");

        peter.setWeight(75.6);
        peter.setPressure(new int[]{120, 82});

        anna.printAccountInfo();
        peter.printAccountInfo();
    }
}
