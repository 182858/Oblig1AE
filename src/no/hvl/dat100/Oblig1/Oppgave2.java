package no.hvl.dat100.Oblig1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave2 {
    public static void main(String[] args) {

        int upperlimit = Integer.parseInt(showInputDialog("upperLimit"));

        int lowerlimit = Integer.parseInt(showInputDialog("lowerLimit"));

        String firstPart = "Odd numbers between " + lowerlimit + " and " + upperlimit + " are:  ";
        String secondPart = "";

        if (lowerlimit % 2 == 0) {
            lowerlimit = lowerlimit + 1;
        }

        for (int n = lowerlimit; n <= upperlimit; n += 2)  {
            secondPart += n + ", ";
        }

        String result = firstPart + secondPart;
        showMessageDialog(null, result);
    }
}
