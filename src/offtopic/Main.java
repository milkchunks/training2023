package offtopic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static int subject = 0;
    static String verb = References.masterList[(int) (Math.random() * (References.masterList.length - 0) + 0)];
    static int correct = 0;
    static int total = 0;
    //stops prgm from rolling subject indefinitely. there are absolutely better ways to do this
    static boolean badSolution = true;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Preterite Practice");
        SwingFrame.setUpFrame(frame);
        frame.setVisible(true);
        while (true) {
            //TODO find a way to not have to do this print statement
            //System.out.println("");
            if (badSolution) {
                verb = References.masterList[(int) (Math.random() * (References.masterList.length - 0) + 0)];
                String subjectString = "";
                subject = (int) (Math.random() * (6 - 0) + 0);
                switch (subject) {
                    case 0:
                        subjectString = "yo";
                        break;
                    case 1:
                        subjectString = "tú";
                        break;
                    case 2:
                        subjectString = "él/ella/usted";
                        break;
                    case 3:
                        subjectString = "nosotros";
                        break;
                    case 4:
                        subjectString = "vosotros";
                        break;
                    case 5:
                        subjectString = "ellos/ellas/ustedes";
                        break;
                }
                SwingFrame.verbText.setText(verb);
                SwingFrame.subjectText.setText(subjectString);
                badSolution = false;
                System.out.println(badSolution);
            }
        }
    }
    //TODO split into two actionlisteners (if i knew how to do that)
    static ActionListener buttonAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton pressedButton = (JButton) e.getSource();
            SwingFrame.answerBox.setText(SwingFrame.answerBox.getText() + pressedButton.getText());
        }
    };
    static ActionListener textAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTextField actionedField = (JTextField) e.getSource();
            if (actionedField.getText().equals(Sectioning.attachEnding(verb))) {
                ++total;
                ++correct;
                SwingFrame.score.setText(correct + "/" + total);
                SwingFrame.correct.setText("");
                SwingFrame.correct.setText("Correct");
                SwingFrame.answerBox.setText("");
            } else {
                ++total;
                SwingFrame.score.setText(correct + "/" + total);
                SwingFrame.correct.setText("Incorrect. Correct answer: " + Sectioning.attachEnding(verb));
                SwingFrame.answerBox.setText("");
            }
            badSolution = true;
        }
    };
}