package animal;

    public class fish {
        String name;// tên
        String gender;// giới tính
        int age;// tuổi
        String Strength;// điểm mạnh

        public fish (String name, String gender, int age, String Strength) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.Strength = Strength;
        }
        @Override
        public String toString() {
            return "fish{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    ", Strength='" + Strength + '\'' +
                    '}';
        }
    }

