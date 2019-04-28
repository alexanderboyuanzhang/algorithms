package com.boyuanzhang.gcd;

public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd1(17,1));
	}

	public static long gcd1(long x, long y) {
		if (y == 0)
			return x;
		return gcd1(y, x % y);
	}

	public static long gcd2(long x, long y) {
		while (y != 0) {
			long r = x % y;
			x = y;
			y = r;
		}
		return x;
	}

}
