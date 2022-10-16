import java.util.Scanner;
class Task4{
     public static void main(String[] args) {
     int i,j,k,row;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter the number of rows: ");
     row= s.nextInt();
     for(i=1; i<=row; i++){
          for(j=4; j>=i; j--){
               System.out.print(" ");
          }
          for(k=1; k<=(2*i-1); k++){
               System.out.print("*");
          }
     System.out.println("");
     }
     }
}
