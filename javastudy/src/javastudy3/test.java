package javastudy3;

public class test { 
public static void main(String[] args) { 
       System.out.println("return value of getValue(): " + getValue());
       StringBuilder aa=new StringBuilder("");
       StringBuilder bb=aa;
       //StringBuilder cc=new StringBuilder("1");
       bb=bb.append("1");
       System.out.println(";"+aa.toString()+";"+bb.toString());
       
    } 
 
public static int getValue() { 
       int i = 1; 
       try { 
                return ++i; 
       } finally { 
    	   
                i=i+4; 
                System.out.println(i);
	        System.out.println("llllllllllllll");
	       
                
       } 
       
    } 
	
}
