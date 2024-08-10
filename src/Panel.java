import javax.swing.*;
import java.awt.*;

public class Panel {
    Panel() {
        JFrame frame = new JFrame();
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 1));
        JLabel questionLabel = new JLabel("Que1: Which one among these is not a datatype?", SwingConstants.LEFT);
        JRadioButton radioButton1 = new JRadioButton("int");
        JRadioButton radioButton2 = new JRadioButton("Float");
        JRadioButton radioButton3 = new JRadioButton("boolean");
        JRadioButton radioButton4 = new JRadioButton("char");
        JButton nextButton = new JButton("Next");
        nextButton.setBounds(130, 100, 100, 40);

        ButtonGroup choiceGroup = new ButtonGroup();
        choiceGroup.add(radioButton1);
        choiceGroup.add(radioButton2);
        choiceGroup.add(radioButton3);
        choiceGroup.add(radioButton4);

        frame.add(questionLabel);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(radioButton3);
        frame.add(radioButton4);

        frame.add(nextButton);

        frame.setVisible(true);
    }
}
