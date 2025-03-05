package com.codingjava;

public class multidimensional_array {

    public static void main(String[] args) {
        int [] [] numbers = { {1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers));
    }
}

//2d arrays(matrices): for tables, spreadsheets, or game boards
//3d arrays: for 3d models, storing data by rows, columns and layers
//higher dimensions: for complex simulations or scientific calculations