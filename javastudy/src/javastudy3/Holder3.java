package javastudy3;

import java.util.List;

public class Holder3<T> {
	private T a;
	public static <e> void getData(List<e> data) {
	      System.out.println("data :" + data.get(0));
	   }
	public static  void getData2(List<?> data) {
	      System.out.println("data :" + data.get(0));
	      //boolean i=1;
	  	
	   }
	
}
