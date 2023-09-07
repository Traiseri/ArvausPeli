import java.util.Scanner;

public class ArvausPeli {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i = 0;
		int j = 0;
		boolean win = false;
		String guess;
		String nimi="Emma";
		
		while (win==false) {
				
			System.out.println("Guess my name (type stop to exit)");
			guess =in.nextLine();
			i++;
				
				
			
				if(i <= 4) {
					System.out.println((i)+ ". Kirjain." + nimi.charAt(j));	
					j++;
					}
				
				
					
					
				
			
			
				if (guess.equals("Emma")) {
					win = true;
					System.out.println("Congratulations!");
					System.out.println("You guessed " + i + " times.");
						
				}
				else if (guess.equals("stop")){
					i--;
					System.out.println("You guessed " + i + " times.");
					break;
				}
		}
	}

}
