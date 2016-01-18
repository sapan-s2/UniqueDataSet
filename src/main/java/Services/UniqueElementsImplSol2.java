package Services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sjain on 1/15/2016.
 */
public class UniqueElementsImplSol2 implements UniqueElements {
    Set<Integer> uniqueElements = new HashSet<>();

    @Override
    public int[] uniqueArray(int[] DataArray) {
        return Arrays.stream(DataArray).filter(this::existInHashSet).toArray();
    }

    private boolean existInHashSet(int element) {
        return  uniqueElements.add(element)? true:false;
    }
}
