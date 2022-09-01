public class Program {
    public static void main(String[] args) {
        Program pg = new Program();
        System.out.println(pg.getSquareRoot(9));
    }

    public int getSquareRoot(int value) {

        int temp;

        int dividedNumber = value / 2;

        do {
            temp = dividedNumber;
            dividedNumber = (temp + (value / temp))/2;
        }while ((temp-dividedNumber) != 0);

        return dividedNumber;
    }
    // 1  2  3  4  5  6  7  8  9  10 11 12  13  14  15  16  17
    // 1  1  1  2  2  2  2  2  3  3  3  3   3   3   3   4   4
    // 1 2 3 4 ..
    // 1 4 9 16 ..
}
