package Challenges.mostFrequentITem;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static int mostFrequentItem(int[] items) {
        if(items.length == 0) return 0;
        Map<Integer, Integer> itemCount = new HashMap<>();
        for (int item : items) {
            if (itemCount.containsKey(item)) {
                itemCount.put(item, itemCount.get(item) + 1);
            } else itemCount.put(item, 1);
        }
        return itemCount.entrySet().stream().max((item1, item2) -> item1.getValue() > item2.getValue() ? 1 : -1)
                .get().getValue();
    }
}
