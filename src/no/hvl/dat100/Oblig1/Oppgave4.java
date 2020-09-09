package no.hvl.dat100.Oblig1;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave4 {
    public static void main(String[] args) {
        int income = Integer.parseInt(showInputDialog("Årlig inntekt"));

        double percentage1 = 0.00;
        double percentage2 = 0.019;
        double percentage3 = 0.042;
        double percentage4 = 0.132;
        double percentage5 = 0.162;

        double stage = 0;

        if (income <= 180800) {
            stage = percentage1;
        }

        if (income > 180800 && income <= 254500) {
            stage = percentage2;
        }

        if (income > 254500 && income <= 639750) {
            stage = percentage3;
        }

        if (income > 639750 && income <= 999550) {
            stage = percentage4;
        }

        if (income > 999550) {
            stage = percentage5;
        }

        double tax = income * stage;

        System.out.println("Your tax is: " + tax);
    }
}
