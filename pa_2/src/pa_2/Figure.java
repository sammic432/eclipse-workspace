package pa_2;

public class Figure {
	
	String shapeName;
	String className;
	
	public Figure() {
		shapeName = "no name";
	}
	public Figure (Figure shape) {
		shapeName = shape.getName();
		className = shape.getClass().getSimpleName();
	}
	
	public void erase () {
		System.out.println("Name of class: " + className );
		System.out.println("Method called: erase");
	}
	public void draw() {
		System.out.println("Name of class: " + className );
		System.out.println("Method called: draw");
	}
	public void center() {
		erase();
		draw();
		System.out.println("Method called: center");
	}
	
	public String getName() {
		return this.shapeName;
	}

}
