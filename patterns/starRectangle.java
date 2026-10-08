import java.util.*;
class StarRectangle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter rows value");
int rows = sc.nextInt();
System.out.println("Enter columns value");
int columns =sc.nextInt();
for(int i=1;i<=rows;i++){
for(int j=1;j<=columns;j++){
System.out.print("*"+" ");
}
System.out.println(" ");
}
}}
