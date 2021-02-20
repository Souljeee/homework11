import java.util.ArrayList;

public class ArrayChanger {
    public <V> void arrayChange(V...a){
        V t;
        //меняем местами два первых элемента массива
        t = a[0];
        a[0] = a[1];
        a[1] = t;
        for (V element : a) {
            System.out.print(element+" ");
        }
    }

    public <K> ArrayList<K> ToArrayList(K...a){
        ArrayList<K> arrayList = new ArrayList<>();
        for (K element : a) {
            arrayList.add(element);
        }
        return arrayList;
    }
}
