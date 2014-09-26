package LawnGameOlympics;

/**
 * Created by Peter J. Ramaglia on 9/16/2014.
 */
public class MainMenu {

    public static String[] eventArray = new String[] {"Wa-Shoos", "KanJam", "Horseshoes", "Cornhole", "Ladderball", "Sticks 'N Cups"};

    public static String[][] olympianArray = new String[][] {
            // {"Name", "Gender", "Age"}
            {"Thomas", "Male", "49"},
            {"David", "Male", "31"},
            {"James", "Male", "21"},
            {"Joseph", "Male", "38"},
            {"Robert", "Male", "23"},
            {"Leonard", "Male", "46"},
            {"Richard", "Male", "40"},
            {"Jose", "Male", "16"},
            {"Sarah", "Female", "17"},
            {"Kelly", "Female", "33"},
            {"Dana", "Female", "18"},
            {"Cathryn", "Female", "44"},
            {"Velma", "Female", "44"},
            {"Jessica", "Female", "24"},
            {"Pauline", "Female", "29"},
            {"Emily", "Female", "22"},
    };

    public static void main(String[] args) {
        System.out.println("Lawn Game Olympics");
        System.out.println("------------------");

        if (args[0].equals("events") || args[0].equals("e")) {
            //Syntax: for(initialization; condition; stepping)
            //This loop prints out each event in the eventArray, prefixed with the string "Event: "
            for(int i=0; i < eventArray.length; i++) {
                System.out.println("Event: " + eventArray[i]);
            }
        } else if (args[0].equals("olympians") || args[0].equals("o")) {
            for(int i=0; i < olympianArray.length; i++) {
                System.out.println("Olympian #" + i + ": " + olympianArray[i][i]);
            }
        } else if (args[0].equals("help") || args[0].equals("h")) {


        } else {
            System.out.println("That argument is not recognized.");
        }

    }
}


