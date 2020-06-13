package Chapter2;

import javax.swing.*;

public class InputDialog {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Enter an input",
                "Input Dialog Demo", JOptionPane.QUESTION_MESSAGE);
    }
}
