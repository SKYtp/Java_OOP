public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        if(numberOfStudents >= students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }
    public void dropStudent(String student){
        for(int i = 0;i<numberOfStudents;i++){
            if(students[i].equals(student)){
                numberOfStudents--;
                while(i < numberOfStudents){
                    students[i] = students[i+1];
                    i++;
                }
                students[numberOfStudents] = "";
            }
        }
    }
    public void clear(){
        for(int i = 0; i<100; i++){
            students[i] = "";
        }
        numberOfStudents = 0;
    }

}
