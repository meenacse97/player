package guvi;

import java.util.Scanner;

public class swapevenodd {
	public static void main(String[] args) {
		System.out.print("string: ");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuffer a=new StringBuffer();
		char[] ch=str.toCharArray();
		int i;
		for(i=0;i<ch.length;i++){
			if(i%2==0){
				if((i+1)<ch.length){
				a.append(ch[i+1]);
			}
				a.append(ch[i]);
				}
		}
			System.out.print(a);
	}


}


