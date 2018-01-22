package main;

public class Matrix {

    int[][] vals;
    int col, row;


    public Matrix(int[][] vals) {
        this.vals = vals;
        col = vals[0].length;
        row = vals.length;
    }

    public boolean findInMatrix(int o){
        // 1 search in column for max range smaller than ans
        // 2 search in row for the answer
        // 3 if not found, go up from the min range larger than ans
        // 4 find the max range smaller than ans
        // 5 repeat step 2
        int i = 0;
        int j =0; // i is row, j is col

        // step 1
        while(i < row  && vals[i][j] < o ){
            i++;
        }
        if(vals[--i][j] == o){ return true;}

        while(j < col && i >= 0){
            if(j+1 < col && vals[i][j+1] > o){
                i--;
                j++;
                continue;
            }
            if( j == col-1 && vals[i][j] > o ){
                i--;
                continue;
            }
            if(vals[i][j] == o){ return true;}
            j++;
        }

        return false;
    }
}
