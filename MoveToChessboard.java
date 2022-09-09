package 力扣刷题;

public class MoveToChessboard {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 0}, {0, 0,1}, {0, 0, 1}};
        int d = movesToChessboard(a);
        System.out.println(d);
    }

    public static int movesToChessboard(int[][] board) {
        int b = 0, w = 0, bb = 0, ww = 0;
        for (int i = 0; i < board.length; i++) {
            for (int[] ints : board) {
                if (ints[i] == 0) {
                    b++;
                } else {
                    w++;
                }

            }
            if (Math.abs(b - w) > 1) return -1;
            b = 0;
            w = 0;
        }
        for (int[] ints : board) {
            if (ints[0] == 0) {
                b++;
            } else {
                w++;
            }

        }
        for (int i = 0; i < board.length; i++) {
            for (int ints : board[i]) {
                if (ints == 0) {
                    bb++;
                } else {
                    ww++;
                }
            }
            if (Math.abs(bb - ww) > 1) return -1;
            bb = 0;
            ww = 0;
        }
        int time = 0;
        if (board.length % 2 == 0) {
            int left = 0, right = 0;
            for (int i = 0; i < board.length; i++) {
                if (board[i][0] == 0) {
                    if (i % 2 == 0) {
                        left++;
                    } else {
                        right++;
                    }
                }
            }
            if (left >= right) {
                int line = 0;
                for (int i = 0; i < board.length; i++) {
                    if (board[i][0] == 0) line = i;
                    if (board[i][0] == 0 && i % 2 == 1) time++;
                }
                int lef = 0, righ = 0;
                for (int j = 0; j < board.length; j++) {
                    if (board[line][j] == 0) {
                        if (j % 2 == 0) {
                            lef++;
                        } else {
                            righ++;
                        }
                    }
                }
                if (lef >= righ) {
                    for (int k = 0; k < board.length; k++) {
                        if (board[line][k] == 0 && k % 2 == 1) time++;

                    }

                } else {
                    for (int k = 0; k < board.length; k++) {
                        if (board[line][k] == 1 && k % 2 == 1) time++;

                    }

                }
            } else {
                int line = 0;
                for (int i = 0; i < board.length; i++) {
                    if (board[i][0] == 1) line = i;
                    if (board[i][0] == 1 && i % 2 == 1) time++;
                }
                int lef = 0, righ = 0;
                for (int j = 0; j < board.length; j++) {
                    if (board[line][j] == 1) {
                        if (j % 2 == 0) {
                            lef++;
                        } else {
                            righ++;
                        }
                    }
                }
                if (lef >= righ) {
                    for (int k = 0; k < board.length; k++) {
                        if (board[line][k] == 1 && k % 2 == 1) time++;

                    }

                } else {
                    for (int k = 0; k < board.length; k++) {
                        if (board[line][k] == 0 && k % 2 == 1) time++;

                    }

                }
            }

        } else {
            int line = 0, big = 1;
            if (b > w) {
                big = 0;
                b = 0;
                w = 0;
                for (int i = 0; i < board.length; i++) {
                    if (board[i][0] == big) line = i;
                }
                for (int ints : board[line]) {
                    if (ints == 0) {
                        b++;
                    } else {
                        w++;
                    }
                }
                for (int i = 0; i < board.length; i++) {
                    if (board[i][0] == 0 && i % 2 == 1) time++;
                }
                if (b > w) {
                    for (int k = 0; k < board.length; k++) {
                        if (board[line][k] == 0 && k % 2 == 1) time++;

                    }

                } else {
                    for (int k = 0; k < board.length; k++) {
                        if (board[line][k] == 1 && k % 2 == 1) time++;

                    }

                }

            } else {
                b = 0;
                w = 0;
                for (int i = 0; i < board.length; i++) {
                    if (board[i][0] == big) line = i;
                }
                for (int ints : board[line]) {
                    if (ints == 0) {
                        b++;
                    } else {
                        w++;
                    }
                }
                for (int i = 0; i < board.length; i++) {
                    if (board[i][0] == 1 && i % 2 == 1) time++;
                }
                if (b > w) {
                    for (int k = 0; k < board.length; k++) {
                        if (board[line][k] == 0 && k % 2 == 1) time++;

                    }

                } else {
                    for (int k = 0; k < board.length; k++) {
                        if (board[line][k] == 1 && k % 2 == 1) time++;

                    }

                }

            }
        }
        if (time == 0) {
            for (int i = 0; i < board[0].length - 1; i++) {
                if (board[0][i] == board[0][i + 1]) return -1;
            }
        }
        return time;

    }


}
