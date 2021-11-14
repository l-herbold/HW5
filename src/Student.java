public class Student {

    public String name;
    public int StudentId;
    public Project project;

    public Student(String name, int id){
        this.name = name;
        StudentId = id;
    }

    public void setProject(Project project){
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public Project getProject() {
        return project;
    }
}
