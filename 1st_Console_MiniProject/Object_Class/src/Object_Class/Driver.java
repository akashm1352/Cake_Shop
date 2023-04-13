package Object_Class;

class Mango{
	@Override
	public int hashCode() {
		return 111;
	}
	
}

public class Driver {
	public static void main(String[]args) {
		Mango ref1=new Mango();
		System.out.println(ref1);
		System.out.println(ref1.hashCode());
		
		Mango ref2=new Mango();
		System.out.println(ref2);
		System.out.println(ref2.hashCode());
	}
}
