
public class ChildClass extends ParentClass{
	private int age;

	public ChildClass(String name, int age) {
		super(name);
		/*
		 * 1)생성자 메소드에서만 사용
		 * 2)첫번째 줄에 위치해야
		 */
		this.age = age;
	}
	
	@Override
	/*
	 * Override method의 4가지 조건
	 * 1. 메소드의 필수 3요소가 일치해야 한다.
	 * 2. 자식의 접근제한자는 부모의 접근제한자보다 같거나 더 넓어야 한다. 
	 * 3. 자식의 exception은 부모의 exception 보다 더 적거나 같아야 한다. 
	 * 4. 클래스 메소드를 멤버 메소드로, 멤버 메소드를 클래스 메소드로 변경 불가
	 * 
	 */
	public static void print() {
		
	}
}
