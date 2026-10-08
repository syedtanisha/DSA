import java.util.*;
class StarTriangle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value: ");
int n = sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("* ");
}
System.out.println(" ");
}
System.out.println("Number Triangle");
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(i+" ");
}
System.out.println(" ");
}
System.out.println("Another Number Triangle");
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(j+" ");
}
System.out.println(" ");
}
}}
