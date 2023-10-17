class Bike{
	String name;
	int id;
	String size;
	String colour;
	int price;
	int a;
	int b;
	
	public void display() {
		System.out.println("details of bike:");
	}
	public Bike() {
		a=45;
	}
	public Bike(int n) {
		a=n;
	}
	public Bike(double d,int n) {
		a=(int)d;
		b=n;
	}
}
class Example{
	public static void main(String args[]) {
		Bike obj=new Bike(7.5,8);
		obj.display();
		obj.name="honda";
		obj.id=123;
		obj.size="large";
		obj.colour="black";
		obj.price=100000;
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.size);
		System.out.println(obj.colour);
		System.out.println(obj.price);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
