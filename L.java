// For input value 3

// Show output :

// A 1 B
// 2 C 3
// D 4 E

import java.util.Scanner;
class L{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = sc.nextInt();
        int i,j,num = 1,position; 
        char c = 'A';   
        for(i = 1; i <= k; i++){
            for(j = 1; j <= k; j++){
                position = (i-1)*k+j;
                 if(position % 2 != 0){
                    System.out.print(c);
                    c++;
                }else{
                    System.out.print(num);
                    num++;
                } 
            }
            System.out.println();
        }


        sc.close();
    }
}