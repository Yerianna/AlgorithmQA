package main;

public class Test {

    public static void main(String[] args){


        int[][] array = {{ 0, 1, 2, 6},
                {2, 3, 4, 7},
                {4, 4, 4, 8},
                {5, 7, 7, 9}};

        Matrix matrix = new Matrix(array);
        boolean result = matrix.findInMatrix(6);

        System.out.println("result of finding 6s in matrix is: " + result);

    }


}
