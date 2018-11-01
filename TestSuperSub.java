class SuperClass {
	private int n;
	
	SuperClass() { //���췽��
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
		//���๹�췽����û����ʾ�ص��û��๹�췽����ϵͳĬ�ϵ��û����޲����Ĺ��췽��
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
