public class Matrix {

    private float[][] data;
    private int rowCount, columnCount;


    public Matrix(float[][] data){

        this.data = data;
        this.rowCount = data.length;
        this.columnCount = data[0].length;
    }

    public Matrix(){
    }

    public Matrix add(Matrix... others){
        float[][] result = this.data;

        for(Matrix other: others){

            if(this.rowCount != other.rowCount || this.columnCount != other.columnCount){
                System.err.println("i hate you!");
                System.exit(-1);
            }

            for(int row=0; row < other.rowCount; row++){
                for(int column=0; column < other.columnCount; column++){
                    result[row][column] += other.data[row][column];
                }
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other){

        if(this.columnCount!=other.rowCount){
            System.err.println("i hate you!");
            System.exit(-1);
        }
        
        float[][] result = new float[this.rowCount][other.columnCount];

        for(int row = 0; row < other.rowCount; row++){
            for(int column = 0; column < other.columnCount; column++){
                for(int element = 0; element < other.rowCount; element++){
                    result[row][column] += this.data[row][element] * other.data[element][column];
                }
            }
        }
        return new Matrix(result);
    }

    @Override
    public String toString(){
        String output = "";
        for(int row=0; row < this.rowCount; row++){
            output += "|";
            for(int column=0; column < this.columnCount; column++){
                output += data[row][column]+ "\t";

            }
            output += "|\n";
        }
        return output; 
    }
}
