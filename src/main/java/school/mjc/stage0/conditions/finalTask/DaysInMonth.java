package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 1 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int daysInMonth;
        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2: // February
                daysInMonth = isLeapYear ? 29 : 28;
                break;
            default:
                daysInMonth = -1; // This will never happen due to validation
                break;
        }
        System.out.println(daysInMonth);
    }
}
