import java.io.*;

public class substring{
	public static void main (String [] args)throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter String: ");
		String word= br.readLine();
		System.out.println("Enter first: ");
		int first = Integer.parseInt(br.readLine());
		System.out.print("Enter last: ");
		int last = Integer.parseInt(br.readLine());
		String substr="";
		substr= word.substring(first, last);
		System.out.print(substr);
	}
}