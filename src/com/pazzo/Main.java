package com.pazzo;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int boardDimension = 8;

        char[][] board = new char[boardDimension][boardDimension];

        boolean isWhite = false;

        for (int y = 0; y < board.length; y++) {

            isWhite = !isWhite;

            for (int x = 0; x < board[y].length; x++) {

                if (isWhite){
                    board[x][y] = 'W';
                }
                else{
                    board[x][y] = 'B';
                }

                isWhite = !isWhite;

            }

        }

        for (int i = 0; i < board.length; i++) {

            System.out.println(Arrays.toString(board[i]));
        }

    }
}
