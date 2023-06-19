package animal;

public class Tiger {
    String name; // tên
    String gender; // giới tính

    int age; // tuổi

    public Tiger(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
