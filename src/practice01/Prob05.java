package practice01;

public class Prob05 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("");
			int number = i;
			String str = Integer.toString(number);
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				if (c == '3' || c == '6' || c == '9') {
					sb.append("짝");
				}
			}
			if (!sb.toString().equals(""))
				System.out.println(i + " " + sb.toString());
		}

	}

}
