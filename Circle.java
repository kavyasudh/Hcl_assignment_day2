package day2_hcl_assgn;

public class Circle {
	private double r;
	private String color="red";
	
	public Circle() {}
	public Circle(double r) {
		this.r=r;
		System.out.println("Color:"+color);
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	public double getperem() {
		double p=2*Math.PI*r;
		return p;
	}
	public double getArea() {
		double a=2*r*r;
		return a;
	}
	
	}

