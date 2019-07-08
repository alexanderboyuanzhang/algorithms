package com.boyuanzhang.gcd;

public class GCD {
	public static void main(String[] args) {
		printArray(extendedGcd(819, 462));
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

	public static void printArray(long[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}

	public static long[] extendedGcd(long x, long y) {
		long[] u = { 1, 0, x }, v = { 0, 1, y }, t = new long[3];
		while (v[2] != 0) {
			long q = u[2] / v[2];
			for (int i = 0; i < 3; i++) {
				t[i] = u[i] - v[i] * q;
				u[i] = v[i];
				v[i] = t[i];
			}
		}
		return u;
	}
}
