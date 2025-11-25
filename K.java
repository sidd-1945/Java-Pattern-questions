// For input value 3

// Show output :

// 1 2 3
// 2 3 4
// 3 4 5

import java.util.Scanner;
class K{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = sc.nextInt();
        int i,j,value;
        for(i = 1; i <= k; i++){
            for(j = 1; j <= k; j++){
                value = i + j -1;
                System.out.print(value);
            }
            System.out.println();
        }

    }
}