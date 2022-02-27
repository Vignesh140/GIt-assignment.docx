package oops;

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "draws Rectangle....";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "draws Line....";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "draws cube....";
    }
}
abstract class Shape5 {
    abstract public String draw();
}

public class AssignmentQ5 {
	
	  public static void main(String[] args) {
	    	Cube5 cube = new Cube5();
	    	Line5 line = new Line5();
	    	Rectangle5 rectangle = new Rectangle5();
	    	System.out.println(rectangle.draw());
	    	System.out.println(line.draw());
	    	System.out.println(cube.draw());
	    }
	}




