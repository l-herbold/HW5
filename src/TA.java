public class TA {

    public String name;
    public Course[] courses;

    public TA(Course[] courses){
        this.courses = courses;
    }

    public Course getCourse(){
        return courses[courses.length-1];
    }

    public String getName(){
        return name;
    }

    public void extendContract(Course course){
        Course[] helpArray = new Course[courses.length];
        for(int i = 0; i < courses.length; i++)
            helpArray[i] = courses[i];
        courses = new Course[courses.length+1];
        for(int i = 0; i < courses.length; i++)
            courses[i] = helpArray[i];
        courses[courses.length-1] = course;
    }

    public void setName(String name){
        this.name = name;
    }
}
