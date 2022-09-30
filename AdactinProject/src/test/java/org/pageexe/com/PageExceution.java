package org.pageexe.com;


import org.pagefactory.com.BookingEndPage;

public class PageExceution extends BookingEndPage {
	
	public static void  url1() {
		get(readMethod(0, 0));
	}
	
	public static void username() {
		textsend(id(emaili), readMethod(1, 0));
	}
	
	public static void Pass() {
		textsend(id(Passi), readMethod(2, 0	));
	}
	
	public static void login() {
		Click(id(logbi));
	}
	public static void dropd1() {
		SelecetIndex(xpaths(drop1), 2);
		}
	public static void dropd2() {
		SelecetIndex(xpaths(drop2), 1);
		}
	public static void dropd3() {
		SelecetIndex(xpaths(drop3), 3);
		}
	public static void dropd4() {
		SelecetIndex(xpaths(drop4), 2);
		}
	public static void inDate() {
		textsend(xpaths(inDate),readMethod(3, 0));
	}
	public static void outDate() {
		textsend(xpaths(outDate),readMethod(4, 0));
	}
	public static void dropd5() {
		SelecetIndex(xpaths(drop5), 3);
		}
	public static void dropd6() {
		SelecetIndex(xpaths(drop6), 2);
		}
	public static void search() {
		Click(xpaths(submit));
	}
	public static void radio1() {
		Click(xpaths(radio));
	}
	public static void contin() {
		Click(xpaths(contin));
	}
	public static void FirstN() {
		textsend(xpaths(firstn), readMethod(5, 0));
	}
	public static void lasttN() {
		textsend(xpaths(lastn), readMethod(6, 0));
	}
	public static void baddress() {
		textsend(xpaths(Baadress), readMethod(7, 0));
	}
	public static void Ccard() {
		textsend(xpaths(Ccard), readMethod(8, 0));
	}
	public static void drop7() {
		SelecetIndex(xpaths(Ctype), 2);
	}
	public static void drop8() {
		SelecetIndex(xpaths(Cmonth), 5);
	}
	public static void drop9() {
		SelecetIndex(xpaths(Cyear), 5);
	}
	public static void Cvv() {
		textsend(xpaths(Cvv), readMethod(9, 0));
	}
	public static void Bookbtn() {
		Click(xpaths(Bbut));
	}
	public static void myLine() {
		Click(xpaths(Myline));
	}
	public static void checkbBtn1() {
		Click(xpaths(checkbtn));
	}
	public static void cancelB() {
		Click(xpaths(Cancel));
		driver.switchTo().alert().accept();
	}
	public static void logout1() {
		Click(xpaths(logout));
	}
	
	

	

	
	

	}
	
	 


