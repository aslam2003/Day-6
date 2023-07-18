package hello;
class Monday{
	public void Day() {
	System.out.println("Today is Monday");
}
	public void Health() {
		System.out.println("Hi People!");
	}
}
public class Method_Overriding extends Monday {
	public void Day() {
		System.out.println("Today is Tuesday");
	}
	public void Hachim() {
		System.out.println("Hachim Mastour");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Monday mon=new Monday();
         Method_Overriding tue=new Method_Overriding();
         mon.Day();
         tue.Day();
         tue.Health();
         tue.Hachim();
	}

}
