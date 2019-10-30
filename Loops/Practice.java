import java.util.Scanner;
import java.util.Random;
public class Practice {
	public static void main(String[] args){
			int[] a = { 1,2,3,4,5};
			int[] b=a; 
			pritnArr(a);
			pritnArr(b);
			System.out.println(a);
			
			a[2]=7;
			pritnArr(a);
			pritnArr(b);
	}
	public static void pritnArr(int[] arr){
		for (int i:arr){
			System.out.printf("%4d", i);
		}
		System.out.println();
	}
	

	/*
	 	Turtle[] tmnt = new Turtle[4];
			Random rand = new Random();
			Double dir;
		
			for (int i = 0; i<tmnt.length; i++){
				tmnt[i] = new Turtle();
			}
		
		
			for (Turtle t: tmnt){
				int r, g, b;
				r = rand.nextInt(255);
				g = rand.nextInt(255);
				b = rand.nextInt(255);
				t.penColor(new Color(r,g,b));
			}
		
			for (int i = 0; i < 50; i++){
				for(Turtle t: tmnt){
					dir = 360*rand.nextDouble();
					t.left(dir);
					t.forward(100);
			}
			tmnt[0].zoomFit(); 
	 * 
	 * 
	 
	 int[] nums ={1,2,3,4}
		int[] num = new int[10];
		Random rand = new Random();
		System.out.println("The length of the array is " + num.length);
		
		for(int i = 0; i < num.length; i++) {
			num[i] = rand.nextInt(100);
			
		}
		for(int nums : num) {
			
			System.out.println(nums);
		}
	}
	int n =3;
		
		n=10;
		for (int i = 0; i<100; i+=n){
			System.out.println(j);
			
		} 
	
	 	int i;	
	Scanner in = new Scanner(System.in);
	boolean flag = true
	while(flag){	
			System.out.println("Enter an integer, please.");
			
	
			if(in.hasNextInt()){
				//break;
				flag=false
			}else{
				String word = in.next();
				//continue;
			}
			
		}
		i = in.nextInt();
	System.out.println("Your integer was " + i);
	public static void printTable(int row, int col){
		int m = 1;
		while (m<=row){
			printRow(m,col);
			m=m+1;	
			System.out.println();
	}

	public static void printRow(int m,int col){
		int n=1;
		while (n<=col){
			System.out.printf("%6d",n*col);
			n=n+1;
		
	}
}
*/
}
