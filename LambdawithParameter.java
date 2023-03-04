public class LambdawithParameter{
	interface rax{
		public String rax(String raxText);
	}
	public static void main (String args[]){
		rax r1=(raxText)->{
			return "we have an important announcement to be more"+raxText;
		};
		System.out.println(r1.rax("the flight going to NewYork has been cancelled"));
		rax r2=raxText->{
			return "we have an important announcement to be made"+raxText;
		};
		System.out.println(r2.rax("The flight going to Boston has been arrived"));
	}
}