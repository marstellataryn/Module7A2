public class QuizBean {
    private int[] numbers;
    private char[] operators;
    private int[] correctAnswers;

    //constructor
    public QuizBean(int numQuestions) {
        generateQuiz(numQuestions);
    }
    
    //getter methods
    public int[] getNumbers() {
        return numbers;
    }

    public char[] getOperators() {
        return operators;
    }

    public int[] getCorrectAnswers() {
        return correctAnswers;
    }

    // method to generate a quiz
    private void generateQuiz(int numQuestions) {
        numbers = new int[numQuestions * 2];
        operators = new char[numQuestions];
        correctAnswers = new int[numQuestions];
        Random random = new Randoom();

        for (int i = 0; i < numQuestions; i++) {
            numbers[i * 2] = random.nextInt(10) + 1;
            numbers[i * 2 + 1] = random.nextInt(10) + 1;
            operators[i] = '+';
            correctAnswers[i] = numbers[i * 2] + numbers[i * 2 + 1];
        }
    }
}

