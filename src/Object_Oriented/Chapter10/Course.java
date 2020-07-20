package Object_Oriented.Chapter10;

class Course {

    // Data fields
    private String courseName;
    private String[] students= new String[100];
    private int numberOfStudent;

    // Constructor
    public Course(String coursename){
        this.courseName = coursename;
        numberOfStudent = 0;
    }

    // Methods
    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student){
        students[numberOfStudent] = student;
        numberOfStudent++;
    }

    public void dropStudent(String student){
        students[numberOfStudent] = student;
        numberOfStudent--;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }
}
class CourseTest{
    public static void main(String[] args) {
        Course INTE2512 = new Course("INTE2512");
        System.out.printf("Course name: %s\n",INTE2512.getCourseName());

        INTE2512.addStudent("Nguyen Le");
        INTE2512.addStudent("Nguyen Thanh Luan");
        INTE2512.addStudent("Le Anh Quan");
        INTE2512.addStudent("Nguyen Quoc Huy");

        System.out.printf("Total number of student in INTE2512 class: %d\n",INTE2512.getNumberOfStudent());

        INTE2512.dropStudent("Nguyen Le");
        System.out.printf("Total number of student in INTE2512 class: %d",INTE2512.getNumberOfStudent());
    }
}
