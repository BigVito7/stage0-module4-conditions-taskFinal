package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        int month = monthNumber;
        if(month ==1 || month == 2 || month == 12){
            System.out.println("Winter");
        }
        if(month == 3 || month == 4 || month == 5){
            System.out.println("Spring");
        }
        if (month == 6 || month == 7 || month == 8){
            System.out.println("Summer");
        }
        if (month == 9 || month == 10 || month == 11){
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong month number");
        }
    }
}
