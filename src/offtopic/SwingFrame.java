package offtopic;

import javax.swing.*;
import java.awt.*;

public class SwingFrame {
    static JTextField verbText = new JTextField("temp1");
    static JTextField subjectText = new JTextField("temp2");
    static JTextField answerBox = new JTextField();
    static JTextField correct = new JTextField();
    static JTextField score = new JTextField("0/0");
    public static void setUpFrame(JFrame frame) {
        JTextField title = new JTextField("Preterite Practice");
        String[] accents = {"á", "é", "í", "ó", "ú"};
        for (int i=0;i<=4;i++) {
            JButton accent = new JButton(accents[i]);
            accent.setMargin(new Insets(0, 0, 0, 0));
            accent.setBounds(127 + (i * 30), 250, 25, 25);
            accent.addActionListener(Main.textAction);
            frame.add(accent);
        }
        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        title.setEditable(false);
        title.setBounds(100, 50, 200, 75);
        title.setName("title");
        title.setHorizontalAlignment(JTextField.CENTER);
        answerBox.setBounds(100, 200, 200, 50);
        answerBox.addActionListener(Main.textAction);
        verbText.setEditable(false);
        verbText.setBounds(125, 132, 150, 30);
        subjectText.setBounds(125, 162, 150, 30);
        subjectText.setEditable(false);
        score.setBounds(150, 287, 100, 50);
        score.setFont(new Font("SansSerif", Font.BOLD, 16));
        score.setEditable(false);
        correct.setBounds(50, 350, 300, 50);
        correct.setFont(new Font("SansSerif", Font.BOLD, 16));
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
    }
}
