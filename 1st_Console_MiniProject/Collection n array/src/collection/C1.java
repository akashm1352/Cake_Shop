package collection;

import java.util.ArrayList;
public class C1 {
	public static void main(String[]args) {
		ArrayList ref = new ArrayList();
		System.out.println(ref);
		
		ref.add(15);
		ref.add(25.22);
		ref.add("akash");
		ref.add(null);
		ref.add(15);
		ref.add(18.1);
		ref.add('s');
		ref.add(true);
		System.out.println(ref);
		System.out.println(ref.size());
	}
}
