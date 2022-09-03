
public class CastDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		Test t = new Test();
//		if(d instanceof Test) {
//			t = (Test)d;
//		}else {
//			System.out.println("안되요.");
//		}
		Object obj = "Hello, World";
		if(obj instanceof String) {
			String another = (String)obj;
			System.out.println("잘되요.");
		}else {
			System.out.println("안되요.");
		}
		
	}
}
class Demo{}
class Test extends Demo{}