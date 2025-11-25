import java.util.Scanner;
class H{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i,j,start = 1;
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }

    }
}