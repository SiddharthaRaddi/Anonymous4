questions.add(new Question("Who is the father of C language?",
new String[]{"Steve Jobs"," James Gosling", "Dennis Ritchie","Rasmus Lerdorf"},"Dennis Ritchie"));
questions.add(new Question("All keywords in C are in?", new
String[]{"LowerCase letters","UpperCase letters" ," CamelCase letters" ," None of the mentioned"},"Lowercase letters"));
questions.add(new Question("what is the correct file extension for python files?",new String[] {".pt",".pyth",".pyt",".py"},".py"));
Collections.shuffle(questions);
return questions;
}
private static int conductQuiz(List<Question> questions) {
Scanner scanner = new Scanner(System.in);
int score = 0;
for (Question q : questions) {
System.out.println(q.question);
for (int i = 0; i < q.options.length; i++) {
System.out.println((i + 1) + ". " + q.options[i]);
}
System.out.print("Enter your choice (1-" + q.options.length +
"): ");
int userAnswer = scanner.nextInt();
if (q.answer.equalsIgnoreCase(q.options[userAnswer - 1])) {
score++;
}
}
return score;
}
private static void displayResults(Student student, int score,
List<Question> questions) {
System.out.println("Student Name: " + student.name);
System.out.println("Roll Number: " + student.rollNo);
System.out.println("Your total score is: " + score);
System.out.println("Here are the correct answers:");
for (Question q : questions) {
System.out.println("Question: " + q.question);
System.out.println("Answer: " + q.answer);
}
}
}
