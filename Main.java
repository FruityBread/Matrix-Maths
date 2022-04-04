public class Main{
    public static void main(String args[]){

        Matrix matrix1 = new Matrix(new float[][] {
            {1,4,2},
            {2,3,2},
            {3,4,2}
        });

        Matrix matrix2 = new Matrix(new float[][] {
            {7,2,2},
            {2,7,2},
            {1,6,6}
        });

        System.out.println(matrix1.multiply(matrix2));

        // Matrix matrix1 = new Matrix(new float[][] {
            // {1,2},
            // {3,4}
        // });

        // Matrix matrix2 = new Matrix(new float[][] {
        //     {1,2,3},
        //     {4,5,6}
        // });

        // System.out.println(matrix1.add(matrix2, matrix2));
        
        // Matrix matrix3 = matrix1.multiply(matrix2);
        // System.out.println(matrix3.add(matrix3));



        // System.out.println(matrix1.multiply(matrix1, matrix2)); // this operation is equal to the following three operations

        // Matrix matrix3 = matrix1.multiply(matrix2);
        // // System.out.println(matrix3);

        // System.out.println(matrix1.multiply(matrix3)); // 2x2 matrix can be multiplied by a 3x2 matrix
        // System.out.println(matrix3.multiply(matrix1)); // but a 3x2 cannot be multiplied by a 2x2

    }
}