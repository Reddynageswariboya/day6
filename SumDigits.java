/*
sum of digits
input
231
output
6
input
1223
output
8
*/

import java.util.Scanner;
class SumDigits
{
public static void main(String aegs[])
{
Scanner sc=new Scanner(System.in);
int n;
int sd=0;
n=sc.nextInt();
while(n>0){
sd=sd+n%10;
n=n/10;
}
System.out.println(sd);
}
}
