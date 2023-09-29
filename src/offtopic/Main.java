package offtopic;

import java.util.Scanner;
public class Main {
    public static int subject = 0;
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int correct = 0;
        while (loop) {
            String subjectString = "";
            subject = (int) (Math.random() * (5 - 0) + 0);
            switch (subject) {
                case 0:
                    subjectString = "1s";
                    break;
                case 1:
                    subjectString = "2s";
                    break;
                case 2:
                    subjectString = "3s";
                    break;
                case 3:
                    subjectString = "1p";
                    break;
                case 4:
                    subjectString = "2p";
                    break;
                case 5:
                    subjectString = "3p";
                    break;
            }
            String verb = References.masterList[(int) (Math.random() * (References.masterList.length - 0) + 0)];
            System.out.println("Conjugate " + verb + " in " + subjectString);
            String answer = scanner.next();
            if (answer.equals("quit")) {
                System.out.println("Score: " + correct + "/" + total);
                System.exit(0);
            } else if (!answer.equals(Sectioning.attachEnding(verb))) {
                System.out.println("Incorrect");
                ++total;
                System.out.println("The correct answer was: " + Sectioning.attachEnding(verb));
                System.out.println("Score: " + correct + "/" + total);
            } else {
                System.out.println("Correct");
                ++total;
                ++correct;
                System.out.println("Score: " + correct + "/" + total);
            }
            /*
            ó
            é
            í
        */
        }
        /*
        for (int i=0; i<=3; i++) {
            subject = (int) (Math.random() * (5 - 0) + 0);
            String verb = References.masterList[(int) (Math.random() * (References.masterList.length - 0) + 0)];
            System.out.println(verb);
            System.out.println("verb type: " + Sectioning.getVerbEnding(verb));
            System.out.println("verb stem: " + Sectioning.getVerbStem(verb));
            System.out.println("subject: " + subject);
            System.out.println("completed verb??: " + Sectioning.attachEnding(verb));
            System.out.println("---");
        }
         */
    }
}
