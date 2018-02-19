package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();

		String[] ary = text.split("");
		int k = 1;

		for (int j = 0; j < ary.length; j++) {
			for (int i = 0; i < k; i++) {
				System.out.print(ary[i]);
			}
			k++;
			System.out.println();
		}

	}
}