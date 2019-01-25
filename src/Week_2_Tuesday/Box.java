package Week_2_Tuesday;

public class Box {
	// fields:
	private double height, length, depth, costSq;

	// properties:
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public double getCostSq() {
		return costSq;
	}
	public void setCostSq(double costSq) {
		this.costSq = costSq;
	}
	
	// Calculates combined surface area of all 6 sides.
	public void calcSurf(){
		System.out.println("Surface Area: " + (6 * (length * depth)));
	}
	
	// Calculates volume of box.
	public void calcVol(){
		System.out.println("Volume: " + (height * length * depth));
	}

	// Calculates the cost per inch2.
	public void calcCost(){
		System.out.println("Cost: " + (costSq * (height * length * depth)) + "\n");
	}
}
