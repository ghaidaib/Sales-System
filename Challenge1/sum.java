import java.util.Scanner;
public class sum {

 public static void main (String[] args)
 {

System.out.println("Enter the size of your array.");
Scanner scanS=new Scanner(System.in);
int size=scanS.nextInt();
int number[]=new int[size];
 
 System.out.println("Enter the element of your array.");
 Scanner scanE=new Scanner(System.in);
 for(int i=0;i<size;i++)
 {
     number[i]=scanE.nextInt();
 }
 
  System.out.println("Enter expected sum");
 Scanner scanSum=new Scanner(System.in);
 int sum=scanSum.nextInt();
 for(int j=0;j<(size-1);j++){
     for(int z=(j+1);z<size;z++){
     if(number[j]+number[z]== sum){  
        System.out.println("the array index of the two numbers whose sum equals the expected sum is "+sum +"="+j+","+z);
   
     }
     }  
 }
 }  
}