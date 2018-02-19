package practice01;

public class Prob02 {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			int size = i + 10;
			for (int j = i; j < size; j++) {
				System.out.print(j);
				if (j < size - 1)
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
