package GithubLearn;

public class Helloworld {
	public static void main(String[] args) {
		String s = "a3b2c1";
//		String res="";
		StringBuilder res = new StringBuilder();
		char letter = '0';
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isLetter(c)) {
				letter = c;
			} else {
				int num = c - '0';

				for (int j = 0; j < num; j++) {
					res.append(letter);
				}
			}
		}
		System.out.println(res);

	}
}
