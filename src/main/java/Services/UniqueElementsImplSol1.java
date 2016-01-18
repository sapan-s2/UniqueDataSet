package Services;

import java.util.Arrays;

/**
 * Created by sjain on 1/14/2016.
 */
public class UniqueElementsImplSol1 implements UniqueElements {

    public int[] uniqueArray(int[] DataArray) {
        return Arrays.stream(DataArray).distinct().toArray();
    }


}
