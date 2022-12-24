package com.hdcompany.phanbiethoathuong.duc;

public class PhanBietHoaThuong {

	void ChuHoaChuThuong(char c) {
		if ((c >= 'a') && (c <= 'z')) {
			System.out.println(c + " la chu thuong!!!");

		}
		if ((c >= 'A') && (c <= 'Z')) {
			System.out.println(c + " la chu hoa!!!");

		} else {
			System.out.println("Ky tu khac!!!");
		}
	}

}
