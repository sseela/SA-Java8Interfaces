import java.util.Collection;
import java.util.List;

interface A {
	
	void m1();
}

interface B {
	public static final int i=0;
	void m2();
	public void m3();
}

interface C {
	int i =0;
	default void m4() {
		int i;
		System.out.println("m4 method called");
	}
	static void m5() {}
	void m6();
}

class E implements C {
	public void m6() {
		
	}
	
}

class M {
	public static void main(String[] args) {
		int i;
		E e = new E();
		e.m4();
	}
}








interface D {
	static void m5() {
		System.out.println("m5 method called");
	}
	void m7();
}



class F implements D {
	public void m7() {
		
	}
	static void m5() {					// not overriding
		System.out.println("looks overiding but method hiding");
	}
}












abstract class K {
	public final int i=0;
	public abstract void k1();
	public void k2() {
		
	}
	
}

class L extends K {

	@Override
	public void k1() {
		// TODO Auto-generated method stub
		
	}
}










/*Multiple inheritance problem with default methods*/

interface interface1 {
	public void n1();
	default void n2() {
		System.out.println("interface1");
	}
}

interface interface2 {
	public void n1();
	default void n2() {
		System.out.println("interface2");
	}
}

class MultipleInheritance implements interface1, interface2 {
	public void n1() {
		System.out.println("no problem");
	}
	public void n2() {
		System.out.println("conflict");
	}
}


public class DefaultAndStaticMethods {
	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		m.n2();
	}
}










@FunctionalInterface
interface Buck {
	public void m1();
	default void m2() {
		
	}
}