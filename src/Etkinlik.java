import java.util.Scanner;

public class Etkinlik {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bugun ki hava sicakligi kac derece? : ");
		int derece = scanner.nextInt();
		
		if (derece < 5) {
			System.out.println("Kayak yapmani oneririm!!");
		} else if (derece >= 5 && derece < 15) {
			System.out.println("Sinemaya gitmeni oneririm!!!");
		} else if (derece >= 15 && derece < 25) {
			System.out.println("Piknik yapmani oneririm!!!");
		} else if (derece >= 25) {
			System.out.println("Yuzmeye gitmeni oneririm!!!");
		}

	}

}
