/*
 * 
 * This program draws a regular polygon with how many sides the user tells it to.
 * 
 * @author Jaden Turner
 * @version 1.0
 * @since 9/18/19
 * 
*/
import java.util.Scanner;

public class Program{

    public static void main(String[] args) {
   

    
    
      
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter the number of sides for the polygon: ");
	int sides = keyboard.nextInt();
	int angles= (((sides-2)*180)/sides);
		angles=180-angles;
	Turtle bob;
    bob = new Turtle();
	drawPolygon(sides,bob,angles);
		
	}
	public static void drawPolygon(int sides,Turtle bob,int angles){
		
		if (sides>0){
			bob.speed(100);
			bob.forward(50);
			bob.left(angles);
			bob.forward(50);
			sides=sides-1;
		
		
	}	else{
	
			return;
	}
		drawPolygon(sides,bob,angles);
  }
	
}
