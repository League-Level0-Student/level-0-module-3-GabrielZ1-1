package _02_loop_variables._4_99_bottles.bottles;

public class Bottles {

	public static void main(String[] args) {
		for(int i=99; i>2; i--) {
			int a = i-1;

			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down and pass it around, " + a + " bottles of beer on the wall.");

		}

		System.out.println("2 bottles of beer on the wall, 2 bottles of beer. Take one down and pass it around, 1 bottle of beer on the wall.");
		System.out.println("1 bottle of beer on the wall, 1 bottle of beer. Take one down and pass it around, no more bottles of beer on the wall.");
		System.out.println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall.");



	}
}
