package chapter3Decorator;

public abstract class Beverage {
	
	Size size = Size.TALL;
	String description = "Unknown Beverage";
	
	public abstract double cost();
	
	public String getDescription() {
		return this.description;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public String getSizeString() {
		String sizeString;
		switch(this.size) {
			case GRANDE:
				sizeString = "Grande";
				break;
			case VENTI:
				sizeString = "Venti";
				break;
			default:
				sizeString = "Tall";
		}
		return sizeString;
	}
}
