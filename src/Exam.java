public class Exam {

    public int max_value;
    private int value;
    public Course course;
    public Question[] questions;
    public Student[] students;

    public Exam(int max_value, Course course, Question[] questions, Student[] students){
        this.max_value = max_value;
        this.course = course;
        this.questions = questions;
        this. students = students;
    }

    public boolean register(Student student){
        if(value < max_value) {
            Student[] helpArray = new Student[students.length];
            for (int i = 0; i < students.length; i++)
                helpArray[i] = students[i];
            students = new Student[students.length + 1];
            for (int i = 0; i < students.length; i++)
                students[i] = helpArray[i];
            students[students.length - 1] = student;
            return true;
        }
        else
            return false;
    }

    public void addQuestion(int id, String task, int value){
        Question[] helpArray = new Question[questions.length];
        for(int i = 0; i < questions.length; i++)
            helpArray[i] = questions[i];
        questions = new Question[questions.length+1];
        for(int i = 0; i < questions.length; i++)
            questions[i] = helpArray[i];
        questions[questions.length-1] = new Question(id, task, value);
    }

    public Student[] getRegisteredStudents(){
        return students;
    }

    public void setMaxValue(int max){
        max_value = max;
    }

}
