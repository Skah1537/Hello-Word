class A
{
	void show()
	{
		System.out.println("As show");
	}
}
class B extends A

{
	void show()
	{
		System.out.println("Bs show");
	
	}
}
class C extends A
{
	void show()
	{
		System.out.println("Cs show");
	
	}
}
class MainDemoPoly
{
		public static void main(String[]args)
		{
		A aa=new A();
		B bb=new B();
		C cc=new C();
		aa.show();
		bb.show();
		cc.show();
		Aa ref;
		ref=new A();
		ref.show();
		ref=new B();
		ref.show();
		ref=new C();
		ref.show();
		
		}
}