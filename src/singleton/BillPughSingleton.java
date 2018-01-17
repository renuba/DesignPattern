package singleton;


public class BillPughSingleton {
	
	private BillPughSingleton() {
		
	}
	
	private static class helper{
		
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return helper.INSTANCE;
	}

}
