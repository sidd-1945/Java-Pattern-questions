// For input value 3

// Show output :

// A 2 C
// 4 E 6
// G 8 I
import java.util.Scanner;
class M{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = sc.nextInt();
        int i,j,num = 2,position;
        char c = 'A';

        for(i = 1; i <= k; i++){
            for(j = 1; j <= k; j++){
                position = (i-1)*k+j;
                if(position % 2 != 0){
                    System.out.print(c +" ");
                    c+=2;
                }else{
                    System.out.print(num +" ");
                    num+=2;
                }
            }
            System.out.println();
        } 
        sc.close();       
    }
}