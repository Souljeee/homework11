import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> boxArray;

    public Box(T... items) {
        this.boxArray = new ArrayList<T>(Arrays.asList(items));
    }

    public void addFruit(T fruit){
        boxArray.add(fruit);
    }

    public void clear() {
        boxArray.clear();
    }

    public float getWeight() {
        if (boxArray.size() == 0) return 0;
        float weight = 0;
        for (T item: boxArray) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void transfer(Box<T> box) {
        box.boxArray.addAll(this.boxArray);
        clear();
    }
}
