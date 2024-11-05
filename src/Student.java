public class Student extends Person {
    private static int studentCount = 0;

    public Student() {
        this("Unknown", 0, "Unknown");
    }

    public Student(String name, int age, String gender) {
        super(name, age, gender);
        studentCount++;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a student " + getName() + ".");
    }

    public static int getStudentCount() {
        return studentCount;
    }

    @Override
    public String toString() {
        return "Student [name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() + "]";
    }
}