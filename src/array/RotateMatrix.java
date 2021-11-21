package array;

/*
Rotate Matrix by 90 degrees

Prob: 1.7., Pg: 60
 */

public class RotateMatrix {

    public static void main(String[] args) {
        String[][] arr = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};

        System.out.println("Original Matrix");
        print2DArray(arr);

        System.out.println("After 90 Degree Rotation");
        String[][] res = rotateMatrixBy90(arr);
        print2DArray(res);
    }

    public static String[][] rotateMatrixBy90(String[][] arr) {
        String[][] result = new String[arr.length][arr.length];

        if(arr.length != arr[0].length) {
            return result;
        }

        for(int i=0;i< arr.length;i++) {

            int col = arr.length - 1 - i;
            for(int j = 0;j< arr[i].length;j++) {
                result[j][col] = arr[i][j];
            }
        }

        return result;
    }

    static void print2DArray(Object[][] objects) {

        for (int i=0;i<objects.length;i++) {
            for (Object ob: objects[i]) {
                System.out.print(ob + " ");
            }
            System.out.println();
        }
    }
}
