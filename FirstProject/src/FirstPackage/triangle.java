package FirstPackage;

public class triangle implements shape{
		private double sides1;
		private double sides2;
		private double sides3;
		public triangle(double sides1, double sides2, double sides3) {
			this.sides1 = sides1;
			this.sides2 = sides2;
			this.sides3 = sides3;
		}
		
		public double getSideLength() {
			return this.sides1 + this.sides2 + this.sides3;
		}
		
		public String getDimensions() {
			return "Sides: One:" + this.sides1 + " Two: " + this.sides2 + " Three: " + this.sides3;
		}
		
		public double getArea() {
			return 12.0;
		}
	}
		