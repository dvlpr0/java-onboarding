package onboarding;

import java.util.*;

public class Problem6 {
	private static HashSet<String> emails;
	private static Hashtable<String, Integer> words;
	private static void fillSetEach(List<String> form) {
		String nickname = form.get(1);
		String word;
		int last;

		last = nickname.length();
		if (last == 1)
			return;
		last--;
		for (int i = 0; i < last; i++) {
			word = nickname.substring(i, i + 2);
			words.put(word, words.getOrDefault(word, 0) + 1);
		}
	}
	private static void fillSetAll(List<List<String>> forms) {
		forms.forEach(Problem6::fillSetEach);
	}

	public static List<String> solution(List<List<String>> forms) {
		emails = new HashSet<>();
		words = new Hashtable<>();
		List<String> answer;

		fillSetAll(forms);
//		findDuplicated(forms);
//		answer = new ArrayList<>(emails);
//		Collections.sort(answer);
		return (answer);
	}
}
