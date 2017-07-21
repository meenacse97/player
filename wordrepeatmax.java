package guvi;
import java.util.*;
public class wordrepeatmax {
		 public static void main(String[] args){
	            Scanner s=new Scanner(System.in);
	            System.out.println("Enter the string: ");
	            String a=s.nextLine();
	            int n=a.length();
	            int i,j,count,len=1;
	            TreeMap<Integer,String> tm=new TreeMap<Integer,String>(); 
	            for(i=0;i<n;i++)
	            {
	                count=0;
	                for(j=i;j<n;j++)
	                {
	                    if((a.substring(i,i+1) ).equals(a.substring(j,j+1)))
	                    {
	                        count++;
	                    }
	                    tm.put(count,(a.substring(i,i+1)));
	                }
	            }
	           
	            for(Map.Entry<Integer, String> obj: tm.entrySet())
	            {
	                if(len==tm.size())
	                System.out.println(obj.getValue()+" "+obj.getKey());
	                len++;
	            }
		 }
}
