package animal;

public class Panda {
    String name;
    String gender;
    int age;
    String hobbies;

    public Panda(String name, String gender, int age, String hobbies) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}


