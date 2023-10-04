package offtopic;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
/*
    A file to set up the JFrame
 */

public class SwingFrame {
    private static JTextField verbText = new JTextField("temp1");
    private static JTextField subjectText = new JTextField("temp2");
    private static JTextField answerBox = new JTextField();
    static JTextArea correct = new JTextArea();
    private static JTextField score = new JTextField("0/0");

    /**
     * @return set up frame
     */
    public static JFrame setUpFrame() {
        JFrame frame = new JFrame("Preterite Practice");
        JTextField title = new JTextField("Preterite Practice");
        String[] accents = {"á", "é", "í", "ó", "ú", "ñ"};
        for (int i = 0; i <= 5; i++) {
            JButton accent = new JButton(accents[i]);
            accent.setMargin(new Insets(0, 0, 0, 0));
            //127-12
            accent.setBounds(112 + (i * 30), 250, 25, 25);
            accent.addActionListener(Main.buttonAction);
            frame.add(accent);
        }
        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        title.setEditable(false);
        title.setBounds(100, 50, 200, 75);
        title.setName("title");
        title.setHorizontalAlignment(JTextField.CENTER);
        title.setBorder(null);
        answerBox.setBounds(100, 200, 200, 50);
        answerBox.addActionListener(Main.textAction);
        answerBox.setBorder(BorderFactory.createLineBorder(new Color(205, 205, 205)));
        verbText.setEditable(false);
        verbText.setBounds(125, 132, 150, 30);
        verbText.setBorder(BorderFactory.createLineBorder(new Color(225, 225, 225)));
        subjectText.setBounds(125, 162, 150, 30);
        subjectText.setEditable(false);
        subjectText.setBorder(BorderFactory.createLineBorder(new Color(225, 225, 225)));
        score.setBounds(150, 287, 100, 50);
        score.setFont(new Font("SansSerif", Font.BOLD, 16));
        score.setEditable(false);
        score.setBorder(null);
        score.setHorizontalAlignment(JTextField.CENTER);
        correct.setBounds(50, 350, 300, 50);
        correct.setFont(new Font("SansSerif", Font.BOLD, 14));
        //makes 'correct' look like a jtextfield
        correct.setBorder(null);
        //TODO use getter for default background instead of guessing
        correct.setBackground(new Color(235, 236, 236));
        correct.setEditable(false);
        frame.add(verbText);
        frame.add(subjectText);
        frame.add(answerBox);
        frame.add(score);
        frame.add(correct);
        frame.add(title);
        frame.setLayout(null);
        //5:4
        frame.setBounds(0, 0, 400, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return frame;
    }
    //getters and setters
    public static void setVerbText(String text) {
        verbText.setText(text);
    }
    public static String getVerbText() {
        return verbText.getText();
    }
    public static void setSubjectText(String text) {
        subjectText.setText(text);
    }
    public static String getSubjectText() {
        return subjectText.getText();
    }
    public static void setCorrectText(String text) {
        correct.setText(text);
    }
    public static String getCorrectText() {
        return correct.getText();
    }
    public static void setAnswerBoxText(String text) {
        answerBox.setText(text);
    }
    public static String getAnswerBoxText() {
        return answerBox.getText();
    }
    public static void setScoreText(String text) {
        score.setText(text);
    }
    public static String getScoreText() {
        return score.getText();
    }
}
