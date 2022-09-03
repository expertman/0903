
public class GenericDemo {
	public static void main(String[] args) {
		GenernalClass<Double> gc = new GenernalClass<Double>("89.5");
		//GenernalClass<Integer> gc1 = new GenernalClass<Integer>(89);
		//GenernalClass<String> gc2 = new GenernalClass<String>("89.5");
		GenernalClass<Car> gc3 = new GenernalClass<Car>(new Car("", 22, 33, ""));
	}
}
class GenernalClass<T>{
	private T value;
	public GenernalClass(T value) { this.value = value; }
	public T getValue() { return this.value; }
	public void setValue(T value) { this.value = value; }
}