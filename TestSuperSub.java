class SuperClass {
	private int n;
	
	SuperClass() { //构造方法
		System.out.println("SuperClass()");
	}
	
	SuperClass(int n) {
		System.out.println("SuperClass(" + n + ")");
		this.n = n;
	}
}

class SubClass extends SuperClass {
	private int n;
	
	SubClass(int n) { 
		//子类构造方法中没有显示地调用基类构造方法，系统默认调用基类无参数的构造方法
		System.out.println("Subclass(" + n + ")");
		this.n = n;
	}
	
	SubClass() {
		super(300);
		System.out.println("SubClass()");
	}
}
public class TestSuperSub {
	public static void main(String arg[]) {
		SubClass sc1 = new SubClass();
		SubClass sc2 = new SubClass(400);
		
	}

}
