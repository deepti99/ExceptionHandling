// One more example with index out of bound
import java.util.ArrayList;
public class ArrayIndexOutOfBound2
{
	public static void main(String[] args)
	{
		ArrayList<String> lis = new ArrayList<>();
		lis.add("My");
		lis.add("Name");
		lis.add("is");
		
		System.out.println(lis.get(0));
		System.out.println(lis.get(1));
		System.out.println(lis.get(2));
		System.out.println(lis.get(3));
	}
}
