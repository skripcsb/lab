public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nastya", 20, "Female");
        Teacher teacher = new Teacher("Katya", 45, "Female");
        TeachingAssistant ta = new TeachingAssistant("Maria", 25, "Female");

        System.out.println(student);
        student.introduce();

        System.out.println(teacher);
        teacher.introduce();

        System.out.println(ta);
        ta.introduce();

        System.out.println("Total students created: " + Student.getStudentCount());
    }
}