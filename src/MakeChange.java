import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter Item Price: ");
		double iPrice = sc.nextDouble();
		
		System.out.println("Enter Ammount Paid: ");
		double aPaid = sc.nextDouble();
		
		if (aPaid < iPrice) {
			System.out.println("ERROR: INSSUFFICIENT FUNDS");
			
		} 
		else if (aPaid > iPrice){
			System.out.print("Result: ");
			double leftOver = aPaid - iPrice;
			leftOver = leftOver + 0.005;
			double subOne = leftOver - (int)leftOver;
			
			if (leftOver >= 1) {
			bills(leftOver);
			change(subOne);
			}
			else if (leftOver < 1) {
				change(subOne);
			}
		}
		else if (aPaid == iPrice) {
			System.out.println("EXACT AMMOUNT PROVIDED");
		}	
		
	sc.close();			
	
	
	}

	
	
	
	
	
public static void change(double total) {
	double quart, dime, nickel, penny;
	double nTotal;
	if (total >= 0.25) {
		quart = total / 0.25;
		nTotal = total - ((int)quart * 0.25);
		System.out.print((int)quart + " quarter, ");
		if (nTotal >= 0.10) {
			dime = nTotal / 0.10;
			System.out.print((int)dime + " dime, ");
			nTotal = nTotal - ((int)dime * 0.10);
			if (nTotal >= 0.05) {
				nickel = nTotal / 0.05;
				System.out.print((int)nickel + " nickel, ");
				nTotal = nTotal - ((int)nickel * 0.05);
				if (nTotal >= 0.01) {
					penny = nTotal / 0.01;
					System.out.print((int)penny + " pennies ");
				}
			}
			else if (nTotal >= 0.01) {
			penny = nTotal / 0.01;
			System.out.print((int)penny + " pennies ");
			}
		}
		else if (nTotal >= 0.05) {
		nickel = nTotal / 0.05;
		System.out.print((int)nickel + " nickel, ");
		nTotal = nTotal - ((int)nickel * 0.05);
			if (nTotal >= 0.01) {
				penny = nTotal / 0.01;
				System.out.print((int)penny + " pennies ");
			}
		}
		else if (nTotal >= 0.01) {
			penny = nTotal / 0.01;
			System.out.print((int)penny + " pennies ");
		}
	}
	
	
	else if (total >= 0.10) {
		dime = total / 0.10;
		System.out.print((int)dime + " dime, ");
		nTotal = total - ((int)dime * 0.10);
		System.out.println(nTotal);
		if (nTotal >= 0.05) {
			nickel = nTotal / 0.05;
			System.out.print((int)nickel + " nickel, ");
			nTotal = nTotal - ((int)nickel * 0.05);
			if (nTotal >= 0.01) {
				penny = nTotal / 0.01;
				System.out.print((int)penny + " pennies ");
			}
		}
		else if (nTotal >= 0.01) {
			penny = nTotal / 0.01;
			System.out.print((int)penny + " pennies ");
		}
	}
	
	else if (total >= 0.05) {
		nickel = total / 0.05;
		nTotal = total - ((int)nickel * 0.05);
		System.out.print((int)nickel + " nickel, ");
		if (nTotal >= 0.01) {
			penny = nTotal / 0.01;
			System.out.print((int)penny + " pennies ");
		}
	}
	else if (total >= 0.01) {
		penny = total / 0.01;
		System.out.print((int)penny + " pennies ");
	}	
}


public static void bills(double total) {
	double ten, five, one;
	
	if (total >= 10){
		ten = total / 10;
		System.out.print((int)ten + " ten dollar bill, ");
		total = total - ((int)ten * 10);;
		if (total >= 5.00) {
			five = total / 5;
			System.out.print((int)five + " five dollar bill, ");
			total = total - ((int)five * 5);
			if (total >= 1);{
			one = total / 1;
			System.out.print((int)one + " one dollar bill, ");
			total = total - (one * 1);
			}
		}	
	else if (total >= 5.00) {
		five = total / 5;
		System.out.print((int)five + " five dollar bill, ");
		total = total - ((int)five * 5);
		if (total >= 1);{
		one = total / 1;
		System.out.print((int)one + " one dollar bill, ");
		total = total - (one * 1);
		}
	}
	
	else if (total >= 1) {
		one = total / 1;
		System.out.print((int)one + " one dollar bill, ");
		total = total - (one * 1);
		}
	
	}
}
	





}


























//git add
//git commit -m "message"
//git push