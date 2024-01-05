/*
1 2 3  4 5 6 7 8 9 11 12 13 14 15 16 17 18 19 21 23 24
*/

import java.util.Scanner;
class ContinueEx1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=1;
while(i<25){
if(i%5==0)continue;
System.out.print(i+"");
i++;
}
}
}