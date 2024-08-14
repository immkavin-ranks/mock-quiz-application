package kavin.quizapp;

import javax.swing.*;
import java.io.IOException;

public class Results extends QuizApp {
    public Results() throws IOException {
        submitQuiz.addActionListener(e -> onSubmit());
    }

    private void onSubmit() {
        setResponse();

        int i = 0, marks = 0;

        for (String[] question : questions) {
            String answer = question[question.length - 1];

            if (answer.equals(responses[i])) marks++;
            i++;
        }
        JOptionPane.showMessageDialog(this, "Correct Answers =" + marks);
        System.exit(0);
    }
}
