package no.hvl.dat100.Oblig1;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave6 {
    public static void main(String[] args) {

        int product = 1;
        int n = Integer.parseInt(showInputDialog("Inputvalue"));

        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        System.out.println(product);
    }
}
