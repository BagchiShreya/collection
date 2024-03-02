package arraylist;
import java.util.ArrayList;
import java.util.List;
public class prog1 {
	public static void main(String args[]) {
		int i;
		ArrayList<String> a1=new ArrayList<String>();
		
		a1.add("HTML");
		a1.add("JAVA");
		a1.add("SQL");
		a1.add("ANGULAR");
		
		System.out.println(a1);
		
		int size=a1.size();
		
		String arr[]=new String[size];
		for(i=0;i<size;i++) {
			arr[i]=a1.get(i);
			System.out.println(arr[i]);
		}
		
		List<String> nal=a1.subList(1, 3);
		System.out.println(nal);
	}
}
