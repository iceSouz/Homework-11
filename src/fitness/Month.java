package fitness;

public enum Month {
    JANUARY("January", 1),
    FEBRUARY("February", 2),
    MARCH("March", 3),
    APRIL("April", 4),
    MAY("May", 5),
    JUNE("June", 6),
    JULY("July", 7),
    AUGUST("August", 8),
    SEPTEMBER("September", 9),
    OCTOBER("October", 10),
    NOVEMBER("November", 11),
    DECEMBER("December", 12);

    private final String month;
    private final int numberOfMonth;

    Month(String month, int numberOfMonth) {
        this.month = month;
        this.numberOfMonth = numberOfMonth;
    }

    public int getNumberOfMonth() {
        return numberOfMonth;
    }

    @Override
    public String toString() {
        return month;
    }
}
