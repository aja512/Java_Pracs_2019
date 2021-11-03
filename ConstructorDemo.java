package dbit;
import java.util.*;
class Box
{
	double width,height,depth;
	Box(double w, double h, double d) 
	{ 
		width = w; 
		height = h; 
		depth = d; 
	} 
	Box() 
	{ 
		width = height = depth = 0; 
	} 
	Box(double len)
	{
		width = height = depth = len; 
	}
	double volume() 
	{ 
		return width * height * depth; 
	} 
}
public class ConstructorDemo 
{
	public static void main(String args[]) 
	{ 
		// create boxes using the various 
		// constructors 
		Box mybox1 = new Box(10, 20, 15); 
		Box mybox2 = new Box(); 
		Box mycube = new Box(7); 

		double vol; 

		// get volume of first box 
		vol = mybox1.volume(); 
		System.out.println(" Volume of mybox1 is " + vol); 

		// get volume of second box 
		vol = mybox2.volume(); 
		System.out.println(" Volume of mybox2 is " + vol); 

		// get volume of cube 
		vol = mycube.volume(); 
		System.out.println(" Volume of mycube is " + vol); 
	} 
}
/*
 * O/P:-
 Volume of mybox1 is 3000.0
 Volume of mybox2 is 0.0
 Volume of mycube is 343.0 
*/