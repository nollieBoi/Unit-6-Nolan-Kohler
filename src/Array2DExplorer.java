public class Array2DExplorer {
    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };
        Array2DExplorer exp = new Array2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRowPractice(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

        System.out.println();

        System.out.print("Test minRowAssignment: \n Expecting: 2 \n Actual: ");
        System.out.println(exp.minRowAssignment(array, 2));

        System.out.println();

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();
    }

    public int minRowPractice(int[][] nums, int row) {
        int min = nums[row][0];
        for(int i : nums[row]){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public int[] colMaxs(int[][] matrix) {
        //that searches through each column of an array and returns an array with the largest integer from each column.
        int[] colsMax = new int[matrix[0].length];
        for(int col = 0; col < matrix[0].length; col++){
            int max = matrix[0][col];
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][col] >= max){
                    max = matrix[row][col];
                }
            }
        }
        return colsMax;
    }

    public int[] allRowSums(int[][] data) {
        //that calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
        int[] sumArray = new int[data.length];
        for(int i = 0; i < data.length; i++){
            int sum = 0;
            for(int j = 0; j < data[i].length; j++){
                sum += data[i][j];
            }
            sumArray[i] = sum;
        }
        return sumArray;
    }

    public double[] averageCol(int[][] nums) {
        //that calculates the average of each column in the array nums, and returns those values in an array of doubles.
        double[] avgArray = new double[nums[0].length];
        for(int i = 0; i < nums[i].length; i++){
            int avg = 0;
            for(int j = 0; j < nums.length; j++){
                avg += nums[j][i];
            }
            avg = avg/nums.length;
            avgArray[i] = avg;
        }
        return avgArray;
    }

    public int smallEven(int[][] matrix) {
        //That finds and returns the smallest even number in the array matrix. Assume that the array is filled with only positive ints.
        
    }

    public static int biggestRow(int[][] nums) {
        //That returns the row index number that has the greatest sum of its elements.

    }

    public boolean evenRow(int [][] mat, int row){
        for(int i = 0; i < mat[row].length; i++){
            if(mat[row][i] % 2 != 0){
                return false;
            }
        }
        return true;

    }


    public boolean oddColSum(int[][] nums, int col){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i][col];
        }
        if(sum%2 != 0){
            return true;
        }else{
            return false;
        }
    }


    public int[] minRow(int [][] mat){
        int minRows = 0;
        int min = mat[0][0];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] < min){
                    min = mat[i][j];
                    minRows = i;
                }
            }
        }
        return mat[minRows];

    }
}
