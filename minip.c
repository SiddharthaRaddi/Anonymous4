import java.util.*;
public class quiz {
private static class Question {
String question;
String[] options;
String answer;
Question(String question, String[] options, String answer) {
this.question = question;
this.options = options;
this.answer = answer;
}
}
private static class Student {
String name;
String rollNo;
Student(String name, String rollNo) {
this.name = name;
this.rollNo = rollNo;
}
}
