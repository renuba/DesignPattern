package singleton;


public class ThreadSafeSingleton {

	/*
	 * private static variable.
	 */
    private static ThreadSafeSingleton instance;
    
    /*
     * private constructor
     */
    private ThreadSafeSingleton(){}
    
    /*
     * Thread safe double checked locking get method
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    
}