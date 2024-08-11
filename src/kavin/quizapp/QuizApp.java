package kavin.quizapp;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class QuizApp extends JFrame{
    JLabel question;
    JRadioButton[] options = new JRadioButton[4];
    JButton nextQuestion;
    ButtonGroup bg;
    List<String[]> questions = new Questions().getQuestions();
    int current = 1;
    int count = questions.size();
    public QuizApp() throws IOException {

        question = new JLabel();
        add(question);

        bg = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton();
            add(options[i]);
            bg.add(options[i]);
        }

        setCurrentQuestion();

        nextQuestion = new JButton("Next");
        add(nextQuestion);

        nextQuestion.addActionListener(e -> onNext());

        setComponents();

    }

    private void setComponents() {

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

    private void onNext() {

        if (current < count - 1) {
            current++;
            setCurrentQuestion();
        }

    }

    public String[] getCurrentQuestion() {
        return questions.get(current);
    }

    public void setCurrentQuestion() {

        String[] q = getCurrentQuestion();

        question.setText(q[0]);

        for (int i = 0; i < 4; i++) {
            options[i].setText(q[i + 1]);
            bg.clearSelection();
        }
    }

}
