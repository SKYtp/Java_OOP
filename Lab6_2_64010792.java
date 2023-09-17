public class Lab6_2_64010792 {
    public static void main(String[] args) {
        Course Course1 = new Course("math");
        Course1.addStudent("Tom AA");
        Course1.addStudent("George BB");
        Course1.addStudent("Oliver CC");
        Course1.dropStudent("George BB"); //drop
        String[] student = Course1.getStudents();
        int num = Course1.getNumberOfStudents();
        for(int i = 0;i<num;i++){
            System.out.println(student[i]);
        }
        // Course1.clear();
        // System.out.println(Course1.getNumberOfStudents());
    }
}
