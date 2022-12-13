import java.util.Scanner;

public class Main {
    public static String prev = "";
    public static void main(String[] args) {
        int N;
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter the number of bids");
        N = S1.nextInt();
        String[] bidder = new String[N];
        int[] bid = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter your name");
            bidder[i] = S1.next();
            System.out.println("Enter you bid");
            bid[i] = S1.nextInt();
        }
        System.out.println(bidfunction(bidder,bid));
    }
    public static String bidfunction(String[] arr, int [] bid) {
        int max = 0;
        String highest_bid = arr[max];
        for(int i=1; i<=bid.length-1; i++){
            if (bid[max]<bid[i]){
                max = i;
                highest_bid = arr[i];
            }
    }
        return highest_bid;

       String str2;
        while (true) {
            str2 = S1.nextLine();
            if (str2.equals("99999")) {
                break;
            }
            System.out.println(direction(str2) + str2.substring(2, 5));
        }
    }
        public static String direction(String str) {
            String num = str.substring(0, 2);
            int sum = Integer.parseInt(num.substring(0, 1)) + Integer.parseInt(num.substring(1));
            if (sum == 0) {
                return prev;
            } else if (sum % 2 == 0) {
                prev = "right";
                return "right";
            } else {
                prev = "left";
                return "left";
            }

        }
}
