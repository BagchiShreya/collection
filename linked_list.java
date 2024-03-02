package linked_list;
import java.util.Collections;
import java.util.LinkedList;

public class linked_list {
	public static void main(String args[]) {
		int i;
		LinkedList<String> l1=new LinkedList<String>();
		LinkedList<String> l2=new LinkedList<String>();
		l1.push("abc");
		l1.push("xyz");
		
		l2.push("hello");
		l2.push("tataa");
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println();
		
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println();
		
		Collections.swap(l1, 1, 3);
		System.out.println(l1);
		System.out.println();
		
		System.out.println(Collections.max(l1));
		System.out.println(Collections.min(l1));
		System.out.println();
		
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println();
		
		int size=l1.size();
		
		String arr[]=new String[size];
		for(i=0;i<size;i++) {
			arr[i]=l1.get(i);
			System.out.println(arr[i]);
		}
		System.out.println();
		
		l1.remove();
		for(String s:l1) {
			System.out.println(s);
		}
	}
}	