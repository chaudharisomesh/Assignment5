package Assignment5;
import java.io.*;
import java.util.*;

public class distinctquadrupletsarraysum {

    static class Pair {
        int index1;
        int index2;

        Pair(int x, int y)
        {
            index1 = x;
            index2 = y;
        }
    }

    public static void
    GetQuadruplets(ArrayList<Integer> nums,
                   int target) {
        HashMap<Integer, ArrayList<Pair> > map
                = new HashMap<>();
        for (int i = 0;
             i < nums.size() - 1; i++) {

            for (int j = i + 1;
                 j < nums.size(); j++) {

                int sum = nums.get(i)
                        + nums.get(j);

                if (!map.containsKey(sum)) {

                    ArrayList<Pair> temp
                            = new ArrayList<>();
                    Pair p = new Pair(i, j);
                    temp.add(p);

                    map.put(sum, temp);
                }

                else {

                    ArrayList<Pair> temp
                            = map.get(sum);

                    Pair p = new Pair(i, j);
                    temp.add(p);
                    map.put(sum, temp);
                }
            }
        }

        HashSet<ArrayList<Integer> > ans
                = new HashSet<ArrayList<Integer> >();

        for (int i = 0;
             i < nums.size() - 1; i++) {

            for (int j = i + 1;
                 j < nums.size(); j++) {

                int lookUp = target
                        - (nums.get(i)
                        + nums.get(j));
                if (map.containsKey(lookUp)) {
                    ArrayList<Pair> temp
                            = map.get(lookUp);

                    for (Pair pair : temp) {
                        if (pair.index1 != i
                                && pair.index1 != j
                                && pair.index2 != i
                                && pair.index2 != j) {

                            ArrayList<Integer> values
                                    = new ArrayList<>();
                            values.add(
                                    nums.get(pair.index1));
                            values.add(
                                    nums.get(pair.index2));
                            values.add(nums.get(i));
                            values.add(nums.get(j));
                            Collections.sort(values);
                            ans.add(values);
                        }
                    }
                }
            }
        }
        for (ArrayList<Integer> arr : ans) {
            System.out.println(arr);
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(0);
        arr.add(-1);
        arr.add(0);
        arr.add(-1);
        arr.add(1);
        int K = 0;
        GetQuadruplets(arr, K);
    }
}
