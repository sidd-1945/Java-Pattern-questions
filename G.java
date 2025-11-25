// For input value 3

// Show output :

// 1 1 1
// 2 2 2
// 3 3 3

import java.util.Scanner;
class G{
    public static void main(String[] args){
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        for(i = 1; i <= input; i++){
            for(j = 1; j <= input; j++){
                System.out.print(i);          
            }
            System.out.println();
        }
    }
}