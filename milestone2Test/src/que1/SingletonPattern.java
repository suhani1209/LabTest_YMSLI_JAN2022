package que1;

import java.io.Serializable;

//Enum is a singleton by Default
enum MySingleton{
	INSTANCE;
}

public class SingletonPattern implements Serializable, Cloneable{
	// Attempt 1 eager implementation 
	// already object is created .. we can access using getSingleton method 
	private static SingletonPattern singleton =new SingletonPattern();
	
	
	// Attempt 2 lazy implementation 
	// if object not created then only create new object 
	private static SingletonPattern singleton2=new SingletonPattern();
	private SingletonPattern() {}
	public static SingletonPattern getSingletion() {
		if(singleton2==null)
		{
			singleton2=new SingletonPattern();
		}
		return singleton2;
	}
	
	// Attempt 3
	// if t1 ,t2 want to access .. race condition 
	// make the getSingleton method synchronized
	
	public synchronized static SingletonPattern getSingleton() {
		if(singleton2==null)
		{
			singleton2=new SingletonPattern();
		}
		return singleton2;
	}
	
	// Attempt 4 making critical block synchronised 
	public static SingletonPattern getSingleton() {
		if(singleton2==null)
		{
			synchronized (SingletonPattern.class) {
				singleton2=new SingletonPattern();
			}
			
		}
		return singleton2;
	}
	
	// Attempt 5 double checking the lock ..
	public static SingletonPattern getSingleton() {
		if(singleton2==null)
		{
			synchronized (SingletonPattern.class) {
				if(singleton2==null)
				{
					singleton2=new SingletonPattern();
				}
			}
			
		}
		return singleton2;
	}
	
	// Attempt 6 use volatile (because it can be breakable when 2 threads are executing on different cores 
	
	// Attempt 7 serialisation issue 
	/*
	 * we can use readResolve method .. as if we have defined readresolve method 
	 * then during de serialisation then java will not go for de -ser
	 */
	private Object readResolve() {
		return singleton2;
	}
	
	// CLONNING ISSUE 
	/*
	 *  for this if we try to clone then another object is created so for
	 *  this what we can do either return exception from clone method
	 *  or simply return the already created singleton object 
	 */
	protected Object clone() throws CloneNotSupportedException{
		//throws new CloneNotSupportedException();
		return singleton2;
	}
	
	// reflection is used to create object then also this pattern breaks
	/*
	 * for this what we can do in constructor we can return error if singleton
	 * object already exists and we are trying to create object 2nd time 
	 */
	
	/*private Singleton() {
		if(singleton!=null){
			throw new IllegalStateException();
		}
	}
	*/
	
}

