import Services.UniqueElementsImplSol1;
import Services.UniqueElementsImplSol2;
import Services.UniqueElementsImplSol3;

import java.util.Arrays;

/**
 * Created by sjain on 1/17/2016.
 */
public class DeDup {

    public static void main(String [] args){
        int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
        UniqueElementsImplSol1 uniqueElementsImplSol1 = new UniqueElementsImplSol1();
        UniqueElementsImplSol2 uniqueElementsImplSol2 = new UniqueElementsImplSol2();
        UniqueElementsImplSol3 uniqueElementsImplSol3 = new UniqueElementsImplSol3();
        Arrays.stream(uniqueElementsImplSol1.uniqueArray(randomIntegers)).forEach(System.out::println);
        Arrays.stream(uniqueElementsImplSol2.uniqueArray(randomIntegers)).forEach(System.out::println);
        Arrays.stream(uniqueElementsImplSol3.uniqueArray(randomIntegers)).forEach(System.out::println);


    }
}
