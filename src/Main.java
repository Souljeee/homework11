import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayChanger arrayChanger = new ArrayChanger();
        //задание 1
        Double[] a = {1.0,4.0,56.0,5.0,3.0,7.0,12.0};

        for (Double element : a) {
            System.out.print(element + " ");
        }
        System.out.println("");

        arrayChanger.arrayChange(a);

        //задание 2
        Integer[] a1 = {1,6,3,8,9,3,5};
        ArrayList<Integer> arrayList = new ArrayList<>(arrayChanger.ToArrayList(a1));
        System.out.println("");
        System.out.println(arrayList);

        //задание 3
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<>(orange1, orange2);

        System.out.println(box1.compare(box2));

        box1.addFruit(apple4);
        System.out.println(box1.compare(box2));


        Box<Orange> box3 = new Box<>();
        box2.transfer(box3);




    }


}
