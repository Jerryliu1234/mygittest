package javastudy3;

public class Sandwich extends Meal{
	int j=0;
	private Bread b=new Bread();
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		Sandwich s= new Sandwich();
		s.j=2;
		Meal m=s;
	//	Meal m=new Meal();
		System.out.println(m instanceof Sandwich);
		Sandwich s2=(Sandwich)m;
		System.out.println(s2.j);
		System.out.println(s2 instanceof Meal);
        //Meal m=new Meal();
    }


}
