import java.util.HashSet;
import java.util.Set;

public class data {
    public static int[] twosame(int[] array, int target) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < array.length - 1; i++) {
            int num = array[i];
            int match = target - num;
            System.out.println(match + "here");
            if (nums.contains(match)) {

                ;
                return new int[] { num, match };

            } else {
                nums.add(num);
            }

        }
        return new int[0];

    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 6, 4, 3, 4, 5 };
        int target = 10;
        int[] result = twosame(array, target);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
