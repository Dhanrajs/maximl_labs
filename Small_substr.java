
import java.util.*;
public class Small_substr
{
	public static void main(String[] args) {
	    String str;
	    char temp_char;
	    int asci_val,dis_count=0;
	    int char_array[]=new int[27];
	   	Scanner s=new Scanner(System.in);
		str=s.nextLine();
		for(int i=0;i<str.length();i++)
		{
		    temp_char=str.charAt(i); //gets each character from the string 
		    asci_val=(int)temp_char; //saving the ascii value from character
		    char_array[asci_val&31]++; //increments character count array 
		    if(char_array[asci_val&31]==1)
		    dis_count++;
		}
		System.out.println(dis_count);
	}
}
