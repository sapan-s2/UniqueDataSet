package Services;

import java.util.*;

/**
 * Created by sjain on 1/15/2016.
 */
public class UniqueElementsImplSol3 implements UniqueElements {
    @Override
    public int[] uniqueArray(int[] DataArray) {
        int[] arrayOfUniqueElements = new int[DataArray.length];

        Map<Integer, Integer> elementAndCount = new HashMap();

        for (int elements : DataArray) {
            Integer count = elementAndCount.get(elements);
            if (count == null) {
                elementAndCount.put(elements, 1);
            } else {
                elementAndCount.put(elements, ++count);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = elementAndCount.entrySet();
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() >= 1) {
                arrayOfUniqueElements[index] = entry.getKey();
            }
            index++;
        }

        return arrayOfUniqueElements;
    }

}
