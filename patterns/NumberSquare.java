import java.util.*;
class NumberSquare{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter n value: ");
int n = sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(j+" ");
}
System.out.println(" ");
}
System.out.println("Another one ");
for(int i=1;i<=n;i++){
for(int j=1;j<=n;j++){
System.out.print(i+" ");
}
System.out.println(" ");
}

}}