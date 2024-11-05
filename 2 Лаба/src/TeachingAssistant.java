public class TeachingAssistant extends Person {
    public TeachingAssistant() {
        this("Unknown", 0, "Unknown");
    }

    public TeachingAssistant(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I am a teaching assistant " + getName() + ".");
    }

    @Override
    public String toString() {
        return "TeachingAssistant [name=" + getName() + ", age=" + getAge() + ", gender=" + getGender() + "]";
    }
}