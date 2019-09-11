package lab_0;

import javax.swing.*;

public class HelloWorld2 {
    public static void main(String[] args) {
        // This is a comment.
        String name = JOptionPane.showInputDialog("Enter name: ");

        JOptionPane.showMessageDialog(null, name);
    }
}
