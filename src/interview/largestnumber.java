package interview;

import java.util.ArrayList;
import java.util.List;

public class largestnumber {

	public static void main(String[] args) {
		int[] a= {10,20,50,10,14,26,35,28,47,66};
		List<Integer> list=new ArrayList<>();
	
		int[] s= new int[10];
		
	      for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
	      for (int i = 0; i < list.size(); i++) {
		
	    	  if (list.get(i)%2==0) {
				s[i]=list.get(i);
				
			}
		}
	      System.out.println(list);
	      for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
//	      Integer max = list.stream().sorted().max((o1, o2) -> {
//	    	  return o1.compareTo(o2);
//	      }).get();
//	      System.out.println(max);
//	      List<Integer> collect = list.stream().sorted((o1, o2) -> {return -(o1.compareTo(o2));}).collect(Collectors.toList());
//	      System.out.println(collect.get(1));
//	      
	      
	}
}
