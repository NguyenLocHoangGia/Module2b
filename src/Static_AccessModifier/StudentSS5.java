package Static_AccessModifier;

public class StudentSS5 {
    private String name = "Jonh";
    private String classes = "CO2";

    public StudentSS5(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "StudentSS5{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
