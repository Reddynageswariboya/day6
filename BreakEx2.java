import java.util.Scanner;
class BreakEx2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
byte i=0;
while(true){
i++;
if(i%5==0)continue;
else
System.out.print(i+",");
}
}
}