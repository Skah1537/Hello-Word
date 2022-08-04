public class Exception1
{
public void dvisionbyzero(int a,int b)
{
if(a<18)
{
throw new ArithmeticException("Not eligible");

}
else
{
System.out.print("eligible");
}

}
public static void main(String[] args)
{
Exception1 obj=new Exception1();
obj.Exception1(19);
}
}