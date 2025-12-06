import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int w = 0; w < t; w++) {
            int n = s.nextInt();
            int ar[] = new int[n];
            boolean res = false;
            for(int z = 0; z < n; z++){
                ar[z] = s.nextInt();
            }
            int b = s.nextInt();
            for(int z = 0; z < n; z++){
                if(ar[z] == b) {
                    res = true;
                    break;
                }
            }
            System.out.println(res ? 1 : 0);
        }
    }
}
