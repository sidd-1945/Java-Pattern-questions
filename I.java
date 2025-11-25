// For input value 3

// Show output :

// 9 8 7
// 6 5 4
// 3 2 1

import java.util.Scanner;
class I{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int m = sc.nextInt();
        int i, j,start = m*m;
        for(i = 1;i <= m; i++){
            for(j = 1; j <= m; j++){
                System.out.print(start + " ");
                start--;
            }
            System.out.println();
        }
    }
}