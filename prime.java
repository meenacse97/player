package guvi;
import java.util.*;
public class prime {
	public static void main(String[] args) {
		int a;
		int count=0;
		int b;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Range");
		a=s.nextInt();
		b=s.nextInt();
		int k=0;
for(int i=a;i<=b;i++){
	count=0;
		for(int j=1;j<=i;j++){
			if(i%j==0){
				count++;
				}
			}
		if(count==2){
		System.out.println(i);
		k++;
		}
	}
System.out.println(k);
	}
}
