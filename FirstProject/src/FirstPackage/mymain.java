package FirstPackage;

public class mymain {

	public static void main(String[] args) {
		shape myShape = new triangle(8,4,8);
		double area = myShape.getArea();
		System.out.println(myShape.getDimensions());
	}

}
