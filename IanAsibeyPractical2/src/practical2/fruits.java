package practical2;

public class fruits {

	public static void main(String[] args) {

		String s2 = "Apple a fruit a tech firm Table an object contains rows and columns when used in context of computers ";
		int i;
		int j;
		for (i = 0; i <= s2.length() - 1; i++) {
			if (s2.substring(i).startsWith("") || i == 0) {

				for (j = i + 1; j <= s2.length() - 1; j++) {

					if (s2.substring(j).startsWith("") || j == s2.length() - 1) {
						System.out.println(s2.substring(i, j));
						i = j;
					}
				}
			}
		}
	}

}
