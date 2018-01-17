package factory;

public class FactoryBaseSecond extends FactorySuper{
	
	String rdd;
	String name;
	

	public FactoryBaseSecond(String rdd, String name) {
		super();
		this.rdd = rdd;
		this.name = name;
	}

	@Override
	public String getrdd() {
		return this.rdd;
	}

	@Override
	public String getname() {
		return this.name;
	}

	

	
}
