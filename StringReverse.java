import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		String str1="";
		for(int i=str.length()-1;i>=0;i--){
			str1+=str.charAt(i);
		}
		System.out.println(str1);
	}

}
