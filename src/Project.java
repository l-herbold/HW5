public class Project {
    public String name;
    public Student[] members;
    public Course course;

    public Project(String name, Student[] members, Course course){
        setName(name);
        this.members = members;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNewMember(Student s){
        Student[] helpArray = new Student[members.length];
        for(int i = 0; i < members.length; i++)
            helpArray[i] = members[i];
        members = new Student[members.length+1];
        for(int i = 0; i < members.length; i++)
            members[i] = helpArray[i];
        members[members.length-1] = s;
        s.setProject(this);
    }

    public Student[] getMembers() {
        return members;
    }
}
