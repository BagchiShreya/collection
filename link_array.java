package linked_list;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class link_array {
	public static void main(String args[]) {
		LinkedList<String> l2=new LinkedList<String>();
		
		l2.add("a");
		l2.push("b");
		l2.addFirst("c");
		l2.addLast("d ");
		l2.add(2,"e");
		
		System.out.println(l2+"\n");
		
		for(String s:l2) {
			System.out.println(s);
		}
		System.out.println();
		
		List<String> list=new ArrayList<String>(l2);
		
		System.out.println(list);
	}
}
