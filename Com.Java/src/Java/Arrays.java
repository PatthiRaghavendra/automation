package Java;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		
		/*ArrayList b=new ArrayList();
		b.add(2);
		b.add("a");
		b.add("ab");
		System.out.println(b);
		b.remove(2);
		System.out.println(b);
		b.add(null);
		System.out.println(b);*/
		
		a.add("Bangalore");
		a.add("India");
		a.add("hubli");
		a.add("dharwad");
		a.add("HongKong");
		
		
//		a.remove(1);
		
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(i+"  " +a.get(i));
		}
   		
		System.out.println("Size of the arrays is -> "+a.size());

}

	public static void sort(int[] a) {
		// TODO Auto-generated method stub
		
	}
}
