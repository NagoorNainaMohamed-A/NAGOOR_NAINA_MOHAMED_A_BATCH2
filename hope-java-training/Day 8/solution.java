import java.util.*;
class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int r = sc.nextInt();
        int len = str.length();
        int row = r;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < r; i++) {
            if (row <= 0) {
                row = r+1;
            }

            int j = i;

            while (j < len && row > 0) {
                sb.append(str.charAt(j));
                j += row+1;
            }

           row=row/2;
        }
        System.out.println(sb.toString());
    }
}