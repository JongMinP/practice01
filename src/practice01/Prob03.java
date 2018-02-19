package practice01;

import java.util.Scanner;

public class Prob03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			int temp = 0;

			if (num % 2 == 1) {
				for (int i = 0; i <= num; i++) {
					if (i % 2 == 1) {
						temp += i;
					}
				}
			} else {
				for (int i = 0; i <= num; i++) {
					if (i % 2 == 0) {
						temp += i;
					}
				}
			}

			System.out.println("결과값 : " + temp + "\n");

		}

	}

}
