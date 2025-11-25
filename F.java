// For input value 3

// Show output :

// a a a
// a a a
// a a a
import java.util.Scanner;
class F{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int i,j;
        for(i = 1; i <= a; i++){
            for(j = 1; j <= a; j++){
                System.out.print("a ");
            }
            System.out.println("");
        }
        sc.close();
    }
}