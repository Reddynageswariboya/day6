/*
W A P to print count of factors of a number input by user
INPUT
12           
OUTPUT	
1,2,3,4,6,12
6
*/
import java.util.Scanner;
class CountFactors{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=1;i<=n;i++) {
if (n%i==0)
{count++;
System.out.print(i);
if(i!=n)System.out.print(",");
}
}
System.out.println("\n Count of factors of"+n+"is"+count);
}
}
