public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ravi", 85);
        Student s2 = new Student("Priya", 92);

        // Display students
        s1.displayStudent();
        s2.displayStudent();

        // Update marks
        s1.setMarks(90);
        System.out.println("After update:");
        s1.displayStudent();
    }
}
