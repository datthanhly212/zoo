package animal;

public class Pig {
        String name;
        String gender;
        int age;
        String appearance;
        int weight;
        String interest;

        @Override
        public String toString() {
            return "Pig{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    ", appearance='" + appearance + '\'' +
                    ", weight=" + weight +
                    ", interest='" + interest + '\'' +
                    '}';
        }

        public Pig(String name, String gender, int age, String appearance, int weight, String interest) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.appearance = appearance;
            this.weight = weight;
            this.interest = interest;
        }
    }
