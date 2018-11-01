import java.io.*;
public class TestEx {
	public static void main(String[] args) {
		/*
		int[] arr = {1, 2, 3};
		try {
			System.out.println(2/0); //try里面写可能遇到的错误
		}catch (ArithmeticException ae) {  //ae是我们自己定义的扑捉到的异常的名字，相当于一个形参，系统自己初始化
			System.out.println("异常");  //catch“扑捉”异常之后，处理异常
			ae.printStackTrace();
		}
		*/
		try {
			new TestEx().f2();
		}catch (IOException e) {
			e.printStackTrace();
		}
		/*
		try {
			new TestEx().m(0);
		}catch (ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("出错了");
		}
		*/
		FileInputStream in = null;
		try {
			in = new FileInputStream("myfile.txt");
			int b;
			b = in.read();
			while(b != -1) {
				System.out.print((char) b);
				b = in.read();
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	void m(int i) throws ArithmeticException {
		if(i==0)
			throw new ArithmeticException("被除数为0");
	}
	
	void f() throws FileNotFoundException,IOException {
		FileInputStream in = new FileInputStream("myfile.txt");
		int b;
		b = in.read();
		while (b!=-1) {
			System.out.print((char) b);
			b = in.read();
		}
	}
	
	void f2() throws IOException {
		f();
	}

}
