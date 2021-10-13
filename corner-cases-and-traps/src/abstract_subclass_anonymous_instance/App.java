// https://stackoverflow.com/questions/13670991/can-we-instantiate-an-abstract-class

package abstract_subclass_anonymous_instance;

public class App {
	public static void main(String[] args) {
		// creating subclass of AbcClass
		AbcClass abcClass = new AbcClass() {}; 
		abcClass.myMethod();
		System.out.println(abcClass instanceof AbcClass);
	}
}
