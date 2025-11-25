import java.util.Scanner;

class N{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 

        int num = 1;
        char ch = 'A';

        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < n; col++) {
                if (row % 2 == 1) {           
                    System.out.print(ch);
                    ch++;
                } else {                    
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
