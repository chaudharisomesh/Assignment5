package Learning.Assignment5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareElementInCollection {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);

        int minimum = Collections.min(l1);

        int maximum= Collections.max(l1);

        if (maximum==minimum){
            System.out.println("All element is equal");
        }
        else {
            System.out.println("Minimum value="+minimum);
            System.out.println("Maximum value="+maximum);
        }

    }
}
