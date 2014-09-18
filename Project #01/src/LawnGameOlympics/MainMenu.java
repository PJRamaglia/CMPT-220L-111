package LawnGameOlympics;

/**
 * Created by Peter J. Ramaglia on 9/16/2014.
 */
public class MainMenu {

    public static String[] eventArray = new String[5]; {
            eventArray[0] = "Wa-Shoos";
            eventArray[1] = "KanJam";
            eventArray[2] = "Horseshoes";
            eventArray[3] = "Cornhole";
            eventArray[4] = "Ladderball";
            eventArray[5] = "Sticks 'N Cups";
    };

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

        } else if (args[0].equals("olympians") || args[0].equals("o")) {
            System.out.println(olympianArray[0][0] + " " + olympianArray[0][1] + " " + olympianArray[0][2]);
            System.out.println(olympianArray[1][0] + " " + olympianArray[1][1] + " " + olympianArray[1][2]);
            System.out.println(olympianArray[2][0] + " " + olympianArray[2][1] + " " + olympianArray[2][2]);
            System.out.println(olympianArray[3][0] + " " + olympianArray[3][1] + " " + olympianArray[3][2]);
            System.out.println(olympianArray[4][0] + " " + olympianArray[4][1] + " " + olympianArray[4][2]);
            System.out.println(olympianArray[5][0] + " " + olympianArray[5][1] + " " + olympianArray[5][2]);
            System.out.println(olympianArray[6][0] + " " + olympianArray[6][1] + " " + olympianArray[6][2]);
            System.out.println(olympianArray[7][0] + " " + olympianArray[7][1] + " " + olympianArray[7][2]);
            System.out.println(olympianArray[8][0] + " " + olympianArray[8][1] + " " + olympianArray[8][2]);
            System.out.println(olympianArray[9][0] + " " + olympianArray[9][1] + " " + olympianArray[9][2]);
            System.out.println(olympianArray[10][0] + " " + olympianArray[10][1] + " " + olympianArray[10][2]);
            System.out.println(olympianArray[11][0] + " " + olympianArray[11][1] + " " + olympianArray[11][2]);
            System.out.println(olympianArray[12][0] + " " + olympianArray[12][1] + " " + olympianArray[12][2]);
            System.out.println(olympianArray[13][0] + " " + olympianArray[13][1] + " " + olympianArray[13][2]);
            System.out.println(olympianArray[14][0] + " " + olympianArray[14][1] + " " + olympianArray[14][2]);
            System.out.println(olympianArray[15][0] + " " + olympianArray[15][1] + " " + olympianArray[15][2]);

        } else if (args[0].equals("help") || args[0].equals("h")) {


        } else {
            System.out.println("That argument is not recognized.");
        }

    }
}


