package apparatus;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String s = "3 1\n110\n011";
		// String s = "4 2\n1000\n1000\n0000\n0010";

		Scanner sc = new Scanner(s);

		Integer lights = sc.nextInt();
		Integer pictures = sc.nextInt();

		List<String> switchesState = Arrays.asList(sc.next().split(""));
		List<String> lightsState = Arrays.asList(sc.next().split(""));
		sc.close();

		Collections.sort(switchesState);
		Collections.sort(lightsState);

		for (int i = 0; i < switchesState.size(); i++) {
			if (switchesState.get(i).equals("0")) {
				lights -= 1;
			}
		}

		System.out.println(factorial(lights));
	}

	public static BigInteger factorial(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(new BigInteger(i + ""));
		}
		return fact.mod(new BigInteger("1000003"));
	}
}
