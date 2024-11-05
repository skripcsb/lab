public class Teacher extends Person {
    public Teacher() {
        this("Unknown", 0, "Unknown");
    }

    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a teacher " + getName() + ".");
    }

    @Override
    public String toString() {
        return "Teacher [name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() + "]";
    }
}