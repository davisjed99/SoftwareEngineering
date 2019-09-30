package csce247.assignments.factory;

public class ToyStore {

	public Toy createToy(String type) {
		if (type.equals("doll")) {
			return new Doll();
		} else if (type.equals("car")) {
			return new Car();
		} else if (type.equals("rattle")) {
			return new Rattle();
		}
		return null;
	}

	public Toy orderToy(String type) {
		Toy toy = createToy(type);
		
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		
		return toy;
	}
	
}