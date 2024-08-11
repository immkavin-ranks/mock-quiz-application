package kavin.quizapp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questions {
    String relativePath = "/src/kavin/quizapp/questions.csv";
    String path = System.getProperty("user.dir").concat(relativePath);
    List<String[]> questions = new ArrayList<>();

    public Questions() throws IOException {
        Scanner sc = new Scanner(new File(path));
        sc.useDelimiter(",");

        while (sc.hasNextLine()) {
            String[] data = sc.nextLine().split(",");
            questions.add(data);
        }

        sc.close();
    }

    public List<String[]> getQuestions() {
        return questions;
    }
}
