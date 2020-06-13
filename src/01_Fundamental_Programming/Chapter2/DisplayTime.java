package Chapter2;

import javax.swing.JOptionPane;

public class DisplayTime {
    public static void main(String[] args) {
        int seconds = 500;
        int minutes = seconds / 60;
        int remaining_sec = seconds % 60;

        JOptionPane.showMessageDialog(null, seconds +" seconds is "+ minutes
                + " minutes and " + remaining_sec + " seconds");
    }
}
