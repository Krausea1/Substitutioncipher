import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		System.out.println("To Encrypt this message choose 1");
		System.out.println("To Decrypt this message choose 2" );
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		
	if (choice == 1) {
		System.out.println("Encryption");
		in.nextLine();
		
		System.out.println("Message can only be the alphabet");
		System.out.print("Write Message Here: ");
		String msg = in.nextLine(); 
		
		System.out.print("Enter key (0-25): ");
		int key = in.nextInt();
		
		String encryptMsg = "";
		
		for (int i = 0; i < msg.length(); i++) {
			if ((int)msg.charAt(i) == 32) {
			encryptMsg += (char)32; 
				
			} else if ((int)msg.charAt(i) + key > 122) {
				int temp = ((int)msg.charAt(i) + key) - 122;
				encryptMsg += (char) (96 + temp);
				
			} else if ((int)msg.charAt(i) + key > 90 && (int)msg.charAt(i) < 96) {
				int temp = ((int)msg.charAt(i) + key) - 90;
				encryptMsg += (char)(64+temp);
			
		} else {
			encryptMsg += (char)((int)msg.charAt(i) + key);
			
		}
			
		}
			
			
			System.out.println(encryptMsg);
	} else if (choice == 2) {
		System.out.println("Decryption");
		in.nextLine();
	
		System.out.print("Message can only be the alphabet");
		System.out.print("Enter encrypted Message: ");
		String encypText = in.nextLine ();
		
		System.out.println("Enter key (0-25): "); 
		int dcyptkey = in.nextInt ();
		
		String decryptMsg = "";
		
		for (int i = 0; i < encypText.length(); i++) {
			if((int)encypText.charAt(i) == 32) {
				decryptMsg += (char) 32;
			} else if (((int)encypText.charAt(i) - dcyptkey) < 97 && ((int)encypText.charAt(i) - dcyptkey) > 90) {
				int temp = ((int)encypText.charAt(i) - dcyptkey) + 26;
				decryptMsg += (char) temp;
		} else if ((encypText.charAt(i) - dcyptkey) < 65) { 
			int temp = ((int)encypText.charAt(i) - dcyptkey) + 26;
			decryptMsg += (char) temp;
		} else {
			decryptMsg += (char)((int)encypText.charAt(i) - dcyptkey);
		}
		
		
	}
	System.out.println(decryptMsg);

	}
	}
	
	}
	
