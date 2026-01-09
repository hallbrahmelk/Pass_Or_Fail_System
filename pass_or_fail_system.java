import java.util.InputMismatchException;
import java.util.Scanner;

public class pass_or_fail_system {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("İsminizi girin (Enter your name): ");
		String name = scan.next();
		boolean validinput1=false;
		boolean validinput2=false;
		boolean validinput3=false;
		System.out.print("Numaranızı girin(Enter your school number): ");
		int visa = 0;
		int fınal = 0;
		int homework = 0;
		int number = scan.nextInt();
		System.out.println("Hoşgeldin (Welcome) "+ name.toUpperCase());
		
		
		
		while (!validinput1) {
			System.out.print("Vize notunuzu girin(Enter your Visa Grade): ");
			visa = scan.nextInt();
			try {
				if (visa<0) {
					System.out.println("Vize 0 dan küçük olamaz.(The Midterm grade cannot be less than zero)");
				}else if (visa>100) {
					System.out.println("vize 100 den büyük olamaz(The Midterm grade cannot be greater than one hundred).");
				}else {
					validinput1=true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Hata oluştu lütfen tekrar deneyin(An error occurred, please try again).");
			}
		}
		
		while (!validinput2) {
			System.out.print("Final notunuzu girin(Enter your Final Grade): ");
			fınal=scan.nextInt();
			try {
				if (fınal<0) {
					System.out.println("Final 0 dan küçük olamaz(The Final grade cannot be less than zero).");
				}else if (fınal>100) {
					System.out.println("Final 100 den büyük olamaz(The Final grade cannot be greater than one hundred).");
				}else {
					validinput2=true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Hata oluştu lütfen tekrar deneyin(An error occurred, please try again).");
			}
		}
		
		
		while (!validinput3) {
			System.out.print("Ödev notunuzu giriniz: ");
			homework=scan.nextInt();
			try {
				if (homework<0) {
					System.out.println("Ödev 0 dan küçük olamaz(Enter your Assignment Grade).");
				}else if (homework>100) {
					System.out.println("Ödev 100 den büyük olamaz(The Assignment score/grade cannot be greater than one hundred).");
				}else {
					validinput3=true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Hata oluştu lütfen tekrar deneyin(An error occurred, please try again).");
			}
		}
		
		double total = (visa*0.4)+ (fınal*0.5)+ (homework*0.1);
		if (total>=50) {
			System.out.println("Geçtiniz(Passed).");
			System.out.println("Not ortalamanız(Your grade point average): "+total);
		}else {
			System.out.println("Kaldınız(You failed).");
			System.out.println("Not ortalamanız(Your grade point average): "+total);
		}
		

	}

}

