package classwork;

public class MyInteger {
	int value;
	MyInteger(){
	value = 1082;
	}
	MyInteger(int value){
		if (value >= -2147483648 && value <= 2147483647) {
			this.value = value;
		}
		else {
			this.value = 1082;
		}
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isEven() {
		if (this.value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isOdd() {
		return this.value % 2 == 1;
	}
	public static int add(MyInteger x, MyInteger y) 
	{
		return x.getValue() + y.getValue();
	}
	@Override
	public String toString() {
		return "MyInteger [value=" + value + "]";
	}
	public static void main(String[] args) {
		MyInteger integer1 = new MyInteger();
		System.out.println("integer1 = " + integer1);
		MyInteger integer2 = new MyInteger(7);
		System.out.println("integer2 = " + integer2);
		System.out.println("integer1.isOdd(): " + integer1.isOdd());
		System.out.println("integer1.isEven(): " + integer1.isEven());
		System.out.println("integer2.isOdd(): " + integer2.isOdd());
		System.out.println("integer2.isEven(): " + integer2.isEven());
		System.out.println(integer1.getValue() + " + " + integer2.getValue() + " = " + MyInteger.add(integer1, integer2));
	}
}
