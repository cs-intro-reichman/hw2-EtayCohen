public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0].substring(0, 2));
        int minutes = Integer.parseInt(args[0].substring(3, 5));

        int minutesToAdd = Integer.parseInt(args[1]);

        int cuurentTimeInMinutes = hours * 60 + minutes + minutesToAdd;
        int newMinutes = cuurentTimeInMinutes % 60;
        int newHours = (cuurentTimeInMinutes / 60) % 24;

        String formattedHours = newHours < 10 ? "0" + newHours : Integer.toString(newHours);
        String formattedMinutes = newMinutes < 10 ? "0" + newMinutes : Integer.toString(newMinutes);

        System.out.println(formattedHours + ":" + formattedMinutes);
    }
}
