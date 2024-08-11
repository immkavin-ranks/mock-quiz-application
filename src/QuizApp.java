import javax.swing.*;

public class QuizApp extends JFrame{
    JLabel question;
    JRadioButton[] options = new JRadioButton[4];
    JButton nextQuestion;
    ButtonGroup bg;

    QuizApp() {

        question = new JLabel();
        question.setText("Que1: Which one among these is not a datatype?");
        add(question);

        bg = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton();
            add(options[i]);
            bg.add(options[i]);
        }

        nextQuestion = new JButton("Next");
        add(nextQuestion);

        options[0].setText("int");options[1].setText("Float");options[2].setText("boolean");options[3].setText("char");


        question.setBounds(50, 40, 450, 20);
        options[0].setBounds(70, 80, 100, 20);
        options[1].setBounds(70, 110, 100, 20);
        options[2].setBounds(70, 140, 100, 20);
        options[3].setBounds(70, 170, 100, 20);
        nextQuestion.setBounds(120, 240, 100, 30);

        setLocation(250, 100);
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}
