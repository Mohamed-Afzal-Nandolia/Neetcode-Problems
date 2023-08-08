package ArraysAndHashing.ValidSudoku;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        //to find the repeated element we are going to use HastSet
        Set set = new HashSet();
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (board[i][j] != '.') {//if the set doesn't add the value then it breaks
                    //we are adding elements in the set in the form of "row05" or "col16" or "box19"
                    if(!set.add("row"+i+board[i][j]) || !set.add("col"+j+board[i][j]) || !set.add("box"+(i/3)*3+j/3 + board[i][j]))
                        return false;
                    //!set.add("box"+(i/3)*3+j/3 + board[i][j]) this is just to find the 3x3 box
                }
            }
        }
        return true;
    }
}
