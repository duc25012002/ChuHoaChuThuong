package com.hdcompany.phanbiethoathuong.duc;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char c = '9';
		
		PhanBietHoaThuong phanBietHoaThuong = new PhanBietHoaThuong();
		phanBietHoaThuong.ChuHoaChuThuong(c);

	}
}
