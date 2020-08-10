 class Calculator{
		
		public int add(int a,int b)
		{
			return a+b;
		}
		public int sub(int a,int b)
		{
			return a-b;
		}
		public int mul(int a,int b)
		{
			return a*b;
		}
		public int div(int a,int b)
		{
			return a/b;
		}
		
	}

public class pro3 {
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
int valueOne=10;
int valueTwo=5;

Calculator myCalculator=new Calculator();
int addResult=myCalculator.add(valueOne,valueTwo);
int subValue=myCalculator.sub(valueOne,valueTwo);
int mulValue=myCalculator.mul(valueOne,valueTwo);
int divValue=myCalculator.div(valueOne,valueTwo);
System.out.println("add :" + addResult);
System.out.println("sub :" + subValue);
System.out.println("mul :" + mulValue);
System.out.println("div :" + divValue);
	}
	}




