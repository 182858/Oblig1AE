package no.hvl.dat100.Oblig1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {
    public static void main(String[] args) {

        int score = 0;
        for (int i = 1; i <= 10; i++) {
            score = Integer.parseInt(showInputDialog("Score"));
            if (score > 100 || score < 0) {
                showMessageDialog(null, "Enter a real value");
                i--;
            }
            else if (score > 89) {
                String grade = "A";
                System.out.println("Your grade is: " + grade);
            }
            else if (score > 79) {
                String grade = "B";
                System.out.println("Your grade is: " + grade);
            }
            else if (score > 59) {
                String grade = "C";
                System.out.println("Your grade is: " + grade);
            }
            else if (score > 49) {
                String grade = "D";
                System.out.println("Your grade is: " + grade);
            }
            else if (score > 39) {
                String grade = "E";
                System.out.println("Your grade is: " + grade);
            }
            else if (score <= 39) {
                String grade = "F";
                System.out.println("Your grade is: " + grade);
            }
        }
    }
}
