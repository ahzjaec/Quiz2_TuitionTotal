import java.util.Scanner;


public class Calculator {
	
		public static void main(String[] args) {
			
				java.util.Scanner input = new Scanner(System.in);
				
				System.out.println("How much is your tuition your freshman year?");
				double tuition = input.nextDouble();
				
				System.out.println("What is the percentage increase on your tuition per year?");;
				double rate = 1 + ((input.nextDouble()) / 100);
				
				double Total = 0;
				for (int i = 0; i < 4; i++){
					
					double annualT = tuition * Math.pow(rate,  i);
					tuition = annualT;
					Total += annualT;
					input.close();
				}
				
				System.out.printf("the total tuition to complete your degree is $%4.2f\n" , Total);
		}

}
