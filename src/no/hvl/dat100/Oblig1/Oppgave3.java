package no.hvl.dat100.Oblig1;

import static java.lang.Math.pow;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave3 {
    public static void main(String[] args) {

        double originNumber = Double.parseDouble(showInputDialog("Origin-Number"));
        double exponential = Double.parseDouble(showInputDialog("Exponential"));

        double ans = pow(originNumber, exponential);

        String firstpart = originNumber + " ^ " + exponential + " = ";

        System.out.println(firstpart + ans);


        double a = 1.0;
        double loops = 0;
        double ans2 = 0;

        while (loops < exponential) {
            ans2 = a * originNumber;
            a = ans2;
            loops++;
        }
        System.out.println(firstpart + ans2);
    }
}
