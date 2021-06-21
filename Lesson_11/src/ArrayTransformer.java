import java.util.Arrays;
import java.util.List;

public class ArrayTransformer<C> {
    public void arrayToList(Object[] array1) {
        List<C> arrayList = (List<C>) Arrays.asList(array1);
        System.out.println(arrayList);
        System.out.println(arrayList.getClass());
    }
}
