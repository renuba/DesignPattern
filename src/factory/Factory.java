package factory;

public class Factory {
	
	public static FactorySuper getComputer(String type, String ram, String cpu){
		if("first".equalsIgnoreCase(type)) return new FactoryBaseFirst(ram, cpu);
		else if("second".equalsIgnoreCase(type)) return new FactoryBaseSecond(ram, cpu);
		
		return null;
	}

}
