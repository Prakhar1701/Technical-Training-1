package microsoft_teams_assignments.due13feb2023;

public class Solution7 {
    public static void main(String[] args) {
        int noOfLines = 6;
        for (int i = 1; i <= noOfLines; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        System.out.print("1  ");
                    } else {
                        System.out.print("0  ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("1  ");
                    } else {
                        System.out.print("0  ");
                    }
                }

            }
            System.out.println();
        }
    }
}