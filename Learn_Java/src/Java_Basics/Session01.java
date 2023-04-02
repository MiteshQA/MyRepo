package Java_Basics;

public class Session01 {
	
	public int sum(int a, int b)
	{
		int output = a + b;
		return output;
	}
	public int sub(int c, int d)
	{
		int output = c - d;
		return output;
	}
	public int div(int x, int y) 
	{
		int output = x / y;
		return output;
	}
	public int mul(int p, int q)
	{
		int output = p * q;
		return output;
	}
	
	public static void main(String[] args) 
	{
		Session01 obj = new Session01();
		int OP1 = obj.sum(10, 2);
		int OP2 = obj.sum(OP1, 2);
		int OP3 = obj.sub(OP2, 2);
		int OP4 = obj.div(OP3, 2);
		int OP5 = obj.mul(OP4, 2);
		System.out.println("Result is :" + OP5);
		
	}

}
