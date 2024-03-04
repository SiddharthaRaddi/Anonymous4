public static void main(String[] args) {
        Student student = getStudentDetails();
        List<Question> questions = getQuestions();
        int score = conductQuiz(questions);
        displayResults(student, score, questions);
    }

    private static Student getStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your roll number: ");
        String rollNo = scanner.nextLine();
        return new Student(name, rollNo);
    }

    private static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        
        questions.add(new Question("Who is the father of C language?", new String[]{"Steve Jobs"," James Gosling", "Dennis Ritchie"," Rasmus Lerdorf"},"Dennis Ritchie"));
        questions.add(new Question("All keywords in C are in?", new String[]{"LowerCase letters","UpperCase letters" ," CamelCase letters" ," None of the mentioned"},"Lowercase letters"));
