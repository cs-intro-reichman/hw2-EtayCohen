public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0].substring(0, 2));
        int minutes = Integer.parseInt(args[0].substring(3, 5));

        int minutesToAdd = Integer.parseInt(args[1]);

        int cuurentTimeInMinutes = hours * 60 + minutes + minutesToAdd;
        int newMinutes = cuurentTimeInMinutes % 60;
        int newHours = (cuurentTimeInMinutes / 60) % 24;

        System.out.println(String.format("%d:%02d", newHours, newMinutes));
    }
}
