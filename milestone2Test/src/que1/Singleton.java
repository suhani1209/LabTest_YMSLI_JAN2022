package que1;

public class Singleton {
	public static void main(String[] args) {

		MySingleton mySingleton = MySingleton.INSTANCE;

		MySingleton mySingleton2 = MySingleton.INSTANCE;

		System.out.println(mySingleton.hashCode());

		System.out.println(mySingleton2.hashCode());

	}
}
