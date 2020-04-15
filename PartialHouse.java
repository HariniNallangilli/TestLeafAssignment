package week3.day3;

public abstract class PartialHouse implements HouseDesign {
	
	public int getNumberOfFloors() {
		return 2;
	}
	
	public abstract void implementLift();

}