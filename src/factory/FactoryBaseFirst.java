package factory;

public class FactoryBaseFirst extends FactorySuper {
	
	String rdd;
	String name;
	

	public FactoryBaseFirst(String rdd, String name) {
		super();
		this.rdd = rdd;
		this.name = name;
	}

	@Override
	public String getrdd() {
		// TODO Auto-generated method stub
		return this.rdd;
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return this.name;
	}
	

}
