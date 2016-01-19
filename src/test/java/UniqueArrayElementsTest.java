import Services.UniqueElementsImplSol1;
import Services.UniqueElementsImplSol2;
import Services.UniqueElementsImplSol3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Created by sjain on 1/14/2016.
 */

@RunWith(MockitoJUnitRunner.class)
public class UniqueArrayElementsTest {

    @InjectMocks
    UniqueElementsImplSol1 uniqueArrayElements;

    @InjectMocks
    UniqueElementsImplSol2 uniqueElementsImplSol2;

    @InjectMocks
    UniqueElementsImplSol3 uniqueElementsImplSol3;

    @Test
    public void UniqueArraySol1Test() {
        int[] randomIntegers = {1, 2, 1, 3, 3, 4, 4, 5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = uniqueArrayElements.uniqueArray(randomIntegers);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void UniqueArraySol2Test() {
        int[] randomIntegers = {1, 2, 1, 3, 3, 4, 4, 5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = uniqueElementsImplSol2.uniqueArray(randomIntegers);
        assertEquals(expectedResult.length, actualResult.length);
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void UniqueArraySol3Test() {
        int[] randomIntegers = {1, 2, 1, 3, 3, 4, 4, 5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = uniqueElementsImplSol3.uniqueArray(randomIntegers);
        assertArrayEquals(expectedResult, actualResult);
    }


}
