package LawnGameOlympics;

/**
 * Created by Peter J. Ramaglia on 9/16/2014.
 */
public class Events {
    public static void main(String[] args) {
        // This declares an array of strings for the events.
        String[] eventArray;

        // This allocates memory for 10 strings (or events in this case).
        eventArray = new String[10];

        // Initialize the events into the actual array.
        eventArray[0] = "Wa-Shoos";
        eventArray[1] = "KanJam";
        eventArray[2] = "Horseshoes";
        eventArray[3] = "Cornhole";
        eventArray[4] = "Ladderball";
        eventArray[5] = "Sticks 'N Cups";

        // These array elements are reserved for future events.
        eventArray[6] = null;
        eventArray[7] = null;
        eventArray[8] = null;
        eventArray[9] = null;
    }
}
