package Loop;

public class HinhNgoiSao {
    public static void main(String[] args) {
        int chieuDai = 5;
        int chieuRong = 5;

        for (int i = 1; i <= chieuDai; i++) {
            for (int j = 1; j <= chieuRong; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= chieuDai; i++) {
            for (int j = 1; j <= chieuRong; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= chieuRong; i++) {
            for (int j = 1; j <= chieuDai + 2; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
