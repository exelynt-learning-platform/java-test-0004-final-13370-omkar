public class Javatest4 {
    public static void main(String[] args) {

        int max = 4;
        int length = 2 * max - 1;

        for (int r = 0; r < length; r++) {
            for (int c = 0; c < length; c++) {

                int topDist = r;
                int leftDist = c;
                int rightDist = length - c - 1;
                int bottomDist = length - r - 1;

                int smallest = Math.min(Math.min(topDist, bottomDist), Math.min(leftDist, rightDist));

                System.out.print((max - smallest) + " ");
            }

            System.out.println();
        }
    }
}