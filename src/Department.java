public class Department {

        public String name;
        public Employee[] employees;
        public Professor chair;
        public Course[] courses;

        //Documentation: If Department has 0 employees or courses, parameter can be null
        public Department(String name, Employee[] employees, Professor chair, Course[] courses){
            this.name = name;
            this.employees = employees;
            this.chair = chair;
            this.courses = courses;

    }

}
