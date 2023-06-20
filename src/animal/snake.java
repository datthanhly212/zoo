package animal;

public class snake {
    String name;
    String size;
    String gender;
    String species;
    String weight;

    public snake(String name, String size, String gender, String species, String weight) {
        this.name = name;
        this.size = size;
        this.gender = gender;
        this.species = species;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "snake{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", gender='" + gender + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}




