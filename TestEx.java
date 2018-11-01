import java.io.*;
public class TestEx {
	public static void main(String[] args) {
		/*
		int[] arr = {1, 2, 3};
		try {
			System.out.println(2/0); //try����д���������Ĵ���
		}catch (ArithmeticException ae) {  //ae�������Լ��������׽�����쳣�����֣��൱��һ���βΣ�ϵͳ�Լ���ʼ��
			System.out.println("�쳣");  //catch����׽���쳣֮�󣬴����쳣
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
			System.out.println("������");
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
			throw new ArithmeticException("������Ϊ0");
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
