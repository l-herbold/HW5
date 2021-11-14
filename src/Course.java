public class Course {

    public int id;
    public String name;
    public int maxCapacity;
    private int capacity;
    public boolean isFull;
    public Professor prof;
    private TA ta;
    public Student[] students;
    public Exam[] exams;

    public Course(int id, String name, int cap, Professor prof){
        this.id = id;
        this.name = name;
        this.prof = prof;
        capacity = cap;
    }

    public void Enroll(Student student){
        if(capacity < maxCapacity){
            Student[] helpArray = new Student[students.length];
            for(int i = 0; i < students.length; i++)
                helpArray[i] = students[i];
            students = new Student[students.length+1];
            for(int i = 0; i < students.length; i++)
                students[i] = helpArray[i];
            students[students.length-1] = student;
        }
    }

    public void Apply(TA ta){
        //if(condition to teach course)
            setNewTA(ta);
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Professor getProf() {
        return prof;
    }

    public TA getTa() {
        return ta;
    }

    public void setNewTA(TA ta) {
        this.ta = ta;
    }

    public void setName(String name) {
        this.name = name;
    }
}
