import junit.framework.testCase;
public class ReverseTest extends Testcase{
	Reverse obj=new Reverse();
	public ReverseTest(String name){
		super(name);
	}
	public void testreverse(){
		assertEquals(231,obj.rev(123));
	}
}