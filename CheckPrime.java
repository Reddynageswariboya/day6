import java.util.Scanner;
class CheckPrime{
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
if(count==2)System.out.println("PRIME");
else
System.out.println("NOT PRIME");
}
}