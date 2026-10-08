import java.util.*;
class Vvit{
public static void main(String args[]){
	char op;
	int a,b;
	int r;
	Scanner sc = new Scanner(System.in);
	op = sc.next().charAt(0);
	a=sc.nextInt();
	b=sc.nextInt();
	switch(op){
	 case '+' : r=a+b;
		System.out.println(r);
		break;
	 case '-' : r=a-b;
		System.out.println(r);
		break;
	 case '*' : r=a*b;
		System.out.println(r);
		break;
	case '/':
		if(b==0)
		 System.out.println("Error: Division by zero is not possible");
		else
		 r=a/b;
		 System.out.println(r);
		break;
	case '%' :
		  r=a%b;
		  System.out.println(r);
		break;
	default: System.out.println("Invalid operator! please use one of the following : +,-,*,/,%");
		break;
}
}
}

		