import java.util.*;
class Ex{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] arr = new int[5];
System.out.println("Enter Array Numbers:");
for(int i=0;i<5;i++){
	arr[i] = sc.nextInt();
}
 for(int i=0;i<=arr.length;i++){
	if(i%2==0){
		arr[i] += 10;
	}
	else{
		arr[i]=arr[i]*2;
		}
System.out.println(arr[i]);
}
}
}






