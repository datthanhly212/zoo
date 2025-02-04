import animal.*;

import java.util.ArrayList;

public class Main {
    static ArrayList<Object> zoo;
    public static void main(String[] args) {
        zoo = new ArrayList<>();
        //dvhoang
        Lion lion = new Lion("Siba", "male", 3);
        zoo.add(lion);

        //dvhoang
        Dog dog = new Dog("Ki ", "male", 1);
        zoo.add(dog);

        //manhquynhne
        Monkey monkey = new Monkey("Khỉ đầu chó","male",10);
        zoo.add(monkey);


        //Lê Thị Kim Oanh
        Tiger tiger = new Tiger("Black Gold", "female", 2);
        zoo.add(tiger);


        //Mỹ Duyên
        Cat cat = new Cat("Maine Coon","male",1,"gừ gừ","cute vãi òooo","Quàng thuợng");
        zoo.add(cat);

        //Ngọc Bích
        Chicken chicken = new Chicken("Gà ta", "hen", 3);

        //Trần Thành Đạt
        Cheetah cheetah = new Cheetah("Báo đen","Male", 19,"Báo đời");
        zoo.add(cheetah);

        //Thế Bảo
        Panda panda = new Panda("Gấu trúc","male",10,"ăn tre và ngủ cả ngày");
        zoo.add(panda);
        //Lê Minh Duy
        fish fish = new fish("con cá con","male",2,"nhõng nhẻo");
        zoo.add(fish);
        //Ngọc Hải
        Wolf wolf=new Wolf("Xám","Wolf gray","male",5);
        zoo.add(wolf);
        //Thanh Thảo
        Pig pig = new Pig("Cog","female",1,"mập mập sâu kiu",70,"ăn và ngủ");
        zoo.add(pig);
         //Lý Thành Đạt
        Swan swan = new Swan("Swain","male",7);
        zoo.add(swan);
        //Nguyễn Hùng
        snake snake = new snake("Na", "2m", "male", "viper", "2kg");
        zoo.add(snake);
                //In ra danh sách các con vật có trong sở thú
        printAllAnimals();
    }

    //In ra danh sách các con vật trong sở thú.
    static void printAllAnimals(){
        for (Object animal: zoo) {
            System.out.println(animal);
        }
    }
}
