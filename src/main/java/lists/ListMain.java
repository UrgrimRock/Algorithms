package lists;

import java.util.Random;

public class ListMain {
    public static void main(String[] args) {
        IList<Integer> list = new ArrayList2x<>();
        Random rand = new Random();
        int numbersCount = 10;
        for (int i = 0; i < numbersCount; i++) {
            list.add(rand.nextInt(101));
        }
        ListUtilities.display(list);
        list.add(11,2);
        ListUtilities.display(list);
        list.remove(3);
        ListUtilities.display(list);
        ListUtilities.insertSort(list);
        ListUtilities.display(list);



    }
}
