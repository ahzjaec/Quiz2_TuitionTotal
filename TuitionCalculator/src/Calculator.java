import java.util.Scanner;


public class Calculator {
	
		public static void main(String[] args) {
			
			System.out.println("What is the initial tuition?");
			Scanner tuition = new Scanner(System.in);
			float Tuition = tuition.nextFloat();
			
			System.out.println("What is the annual percentage increase?");
			Scanner rate = new Scanner(System.in);
			float Rate = rate.nextFloat();
			Rate = Rate/100;
			
			float Total = Tuition;
			
			for(int year=1; year<4; year++){
				float annualT = Tuition * (1+Rate);
				Total = Total + annualT;
				Tuition = annualT;
			}
	System.out.println(String.format("The cost to complete your degree is: %.2f",Total));
		}
}
