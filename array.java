public class array {
    public static int[] twosame(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[] { array[i], array[j] };
                }
            }
        }
        return new int[0];

    }

    public static void main(String[] args) {
        int[] array = { 6, 4, 5, 2, 4, 0, 2 };
        int target = 7;
        int[] result = twosame(array, target);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
