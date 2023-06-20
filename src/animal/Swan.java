package animal;

public class Swan {
    String name;
    String gender;
    int age;

    public Swan(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    @Override
    public String toString(){
        return "Swan{"+
                "name='"+ name + '\''+
                ",gender='" + gender + '\''+
                ",age=" + age +
                '}';
    }
}
