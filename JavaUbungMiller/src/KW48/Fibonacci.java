package KW48;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibo(1));
		System.out.println(fibo(2));
		System.out.println(fibo(3));
		System.out.println(fibo(7));
		System.out.println(fibo(100));

	}

	private static List<Long> fibo(int n) {
		List<Long> list = new ArrayList<Long>();
		long fib1 = 0;
		long fib2 = 1;
		long count = 0;
		list.add(fib1);
		while (count < n) {
			count++;
			list.add(fib2);
			long temp = fib1 + fib2;
			fib1 = fib2;
			fib2 = temp;
		}
		return list;
	}
}
