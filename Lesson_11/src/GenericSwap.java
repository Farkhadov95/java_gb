import java.util.Arrays;

public class GenericSwap<A> {
        public void swapMachine (A[] receivedArray, int first, int second) {
            A[] arr = receivedArray;
            System.out.println(Arrays.toString(arr));
            A temp = arr[first];
            receivedArray[first] = receivedArray[second];
            receivedArray[second] = temp;
            System.out.println(Arrays.toString(arr));
        }
}
