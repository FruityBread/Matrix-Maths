public class Main{
    public static void main(String args[]){

        Matrix matrix1 = new Matrix(new float[][] {
            {0,1},
            {2,3}
        });

        Matrix matrix2 = new Matrix(new float[][] {
            {4,5,8},
            {6,7,8}
        });

        // System.out.println(matrix1.add(matrix2, matrix2));
        // System.out.println(matrix1.add(matrix2));
        System.out.println(matrix1.multiply(matrix2));
    }
}