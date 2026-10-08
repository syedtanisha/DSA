import java.util.*;
class SecondMax{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int[] arr = new int[5];
System.out.println("Enter Array Numbers:");
for(int i=0;i<5;i++){
	arr[i] = sc.nextInt();
}
int max = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
if(arr[i]>max){
max = arr[i];
}
}
int smax = Integer.MIN_VALUE;
for (int i =0; i < arr.length; i++) {
        if (arr[i]>smax && arr[i]!=max) {
          smax = arr[i];
        }
    }
System.out.println("max element "+max);
System.out.println("second max element "+smax);
}
}