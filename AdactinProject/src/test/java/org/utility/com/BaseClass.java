package org.utility.com;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	@BeforeClass
	public static void loginMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void get(String text) {
		driver.get(text);
	}
	@AfterClass
	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static WebElement id(String id) {
		return driver.findElement(By.id(id));
	}

	public static WebElement name(String name) {
		return driver.findElement(By.name(name));
	}

	public static WebElement cName(String className) {
		return driver.findElement(By.className(className));
	}

	public static WebElement tName(String tagName) {
		return driver.findElement(By.tagName(tagName));
	}

	public static WebElement linkText(String linkText) {
		return driver.findElement(By.linkText(linkText));
	}

	public static WebElement pLinkText(String partialLinkText) {
		return driver.findElement(By.partialLinkText(partialLinkText));
	}

	public static WebElement xpaths(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public static WebElement css(String cssSelector) {
		return driver.findElement(By.cssSelector(cssSelector));
	}

	public static String pro(String key) {

		try {
			File file = new File("C:\\Users\\sksur\\eclipse-workspace\\AdactinProject\\src\\test\\resources\\TestProperties\\Properties");
			FileInputStream fis = new FileInputStream(file);
			Properties po = new Properties();
			po.load(fis);
			String property = po.getProperty(key);
			return property;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return key;
	}

public static String readMethod(int X, int Y)  {
		
		String Value =null; 
		try {
		File file = new File("C:\\Users\\sksur\\Desktop\\Test.xls");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
//		int rows = sheet.getPhysicalNumberOfRows();
//		for(int i = 0;i<rows;i++) {
			Row row = sheet.getRow(X);
//			int cells = row.getPhysicalNumberOfCells();
//			for(int j=0;j<cells;j++) {
				Cell cell = row.getCell(Y);
				int cellType = cell.getCellType();
				if(cellType==1) {
					Value = cell.getStringCellValue();
					System.out.println(Value);
				}else if (cellType==0) {
						if(DateUtil.isCellDateFormatted(cell)) {
							Date dateCellValue = cell.getDateCellValue();
							SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
							 Value = f.format(dateCellValue);
							System.out.println(Value);
						}else {
							double nu = cell.getNumericCellValue();
							long lo = (long)nu;
							Value = String.valueOf(lo);
							System.out.println(Value);
						}
						}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return Value;
	}

 public static void textsend(WebElement element,String text) {
	 element.sendKeys(text);
 }
 public static void clear(WebElement element) {
	 element.clear();
 }
 public static void gText(WebElement element) {
	 element.getText();
 }
 public static void Click(WebElement element) {
	 element.click();
 }
 
 public static void SelecetIndex(WebElement element, int X) {
	 Select sc = new Select (element);
	 sc.selectByIndex(X);
 }
 public static void SelecetValue(WebElement element, String text) {
	 Select sc = new Select (element);
	 sc.selectByValue(text);
 }
 public static void SelecetVisible(WebElement element, String text) {
	 Select sc = new Select (element);
	 sc.selectByVisibleText(text);
 }
 
}
