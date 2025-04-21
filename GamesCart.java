package JavaAssesment;

import java.util.Scanner;

public class GamesCart {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1.Call of Warfare	 - ₹1500  ");
		System.out.println("2. Speed Racers      - ₹1200 ");
		System.out.println("3. Mystery Mansion   - ₹1000 ");
		System.out.println("4. Pixel Adventure   - ₹800 ");
		System.out.println("5. Puzzle Mania      - ₹500 ");
		System.out.println("6. Checkout / Exit");
		System.out.println("Choose a game between 1-5");
		int choose=scanner.nextInt();
		int copies;
		int cost;
		if(choose==6) {
			System.exit(0);
		}
			
		if(choose==1) {
			System.out.println("How many copies you want?");
			copies=scanner.nextInt();
			System.out.println("Games added to your cart!" );
			cost=copies*1500;
			System.out.println("Total cost:"+cost);
		}
		if(choose==2) {
			System.out.println("How many copies you want?");
			copies=scanner.nextInt();
			System.out.println("Games added to your cart!" );
			cost=copies*1200;
			System.out.println("Total cost:"+cost);
		}
		if(choose==3) {
			System.out.println("How many copies you want?");
			copies=scanner.nextInt();
			System.out.println("Games added to your cart!" );
			cost=copies*1000;
			System.out.println("Total cost:"+cost);
		}
		if(choose==4) {
			System.out.println("How many copies you want?");
			copies=scanner.nextInt();
			System.out.println("Games added to your cart!" );
			cost=copies*800;
			System.out.println("Total cost:"+cost);
		}
		if(choose==5) {
			System.out.println("How many copies you want?");
			copies=scanner.nextInt();
			System.out.println("Games added to your cart!" );
			cost=copies*500;
			System.out.println("Total cost:"+cost);
		}
		
		

	}

}
