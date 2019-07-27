package FirstPackage;

public class rectangle implements shape{
	public double length;
	public double width;
	public rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
		public double getArea() {
			return this.length * this.width;
		}
		
		public double getSideLength() {
			return this.length * 2 + this.width * 2;
		}
		
		public String getDimensions(){
			return "Length: " + this.length + "\n" +
					"Width: " + this.width;
		}

	}


