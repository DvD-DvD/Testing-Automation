package selenium2;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.awt.Desktop;
import java.util.Vector;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelImport {
	
	public void readExcel(String filePath,String sheetName,Vector<String> v) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		File file = new File(filePath);
		FileInputStream is = new FileInputStream(file);
		Workbook tsWb = new XSSFWorkbook(is);
		Sheet tsSheet = tsWb.getSheet(sheetName);
		int rowCount = tsSheet.getLastRowNum() - tsSheet.getFirstRowNum() -1;
		System.out.println("No.of Test Cases :"+ rowCount);
		CellStyle greencolor  = tsWb.createCellStyle();
		greencolor.setFillForegroundColor(IndexedColors.GREEN.getIndex());

		CellStyle redcolor  = tsWb.createCellStyle();
		redcolor.setFillForegroundColor(IndexedColors.RED.getIndex());
		for(int i= 1 ; i<= rowCount ; i++) {
			 Row row = tsSheet.getRow(i);
			 int j=0;
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("headless");
			 options.addArguments("window-size=1200x600");
			 WebDriver driver = new ChromeDriver(options);
			 String baseurl = "http://localhost:8081/selenium2/src/index.php";
			 driver.get(baseurl);
			 WebElement uid = null,fname = null,lname=null,email=null,dob=null,flat=null,street=null,locality=null,city=null,state=null,pin=null,sod=null,laddress=null,labdir=null,pdate=null,submit=null;
			 Select tmethod = null;
			 try {
				 uid = driver.findElement(By.id("uid"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try {
			 	fname = driver.findElement(By.id("fname"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try {
				 lname = driver.findElement(By.id("lname"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace(); 
			 }
			 try {
				 email = driver.findElement(By.id("email"));
			 }catch(Exception e) { 
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try {
				 dob = driver.findElement(By.id("dob"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try {
				flat = driver.findElement(By.id("flat"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace(); 
			 }
			 try {
				 locality = driver.findElement(By.id("locality"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace(); 
			 }
			 try{
				 street = driver.findElement(By.id("street"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try{
				 city = driver.findElement(By.id("city"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try{
				state = driver.findElement(By.id("state"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try{
				 pin = driver.findElement(By.id("pin"));
			 }
			 catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace(); 
			 }
			 try{
				sod = driver.findElement(By.id("sod"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try{
			   laddress = driver.findElement(By.id("laddress"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try{
				 labdir = driver.findElement(By.id("lab_director"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try{
				 tmethod = new Select(driver.findElement(By.id("tmethod")));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try{
				pdate = driver.findElement(By.id("performed_date"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
			 try{
				  submit = driver.findElement(By.id("button1"));
			 }catch(Exception e) {
				 System.out.println("webelement exception");
				 e.printStackTrace();
			 }
		     try { 
			 	 if(row.getCell(j) != null) {
					uid.sendKeys(Integer.toString((int)(row.getCell(j).getNumericCellValue())));
				 }
				 j++;
				 if(row.getCell(j) != null) {
				 	fname.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					lname.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					 email.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					 dob.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
				 	flat.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					street.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					locality.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					city.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					state.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					pin.sendKeys(Integer.toString((int)row.getCell(j).getNumericCellValue()));
				 }
				 j++;
				 if(row.getCell(j) != null) {	
					 sod.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					 laddress.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {	
					 labdir.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
				 	tmethod.selectByValue(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					 pdate.sendKeys(row.getCell(j).getStringCellValue());
				 }
				 j++;
				 if(row.getCell(j) != null) {
					 WebElement res = driver.findElement(By.id(row.getCell(j).getStringCellValue()));
					 res.click();
				 }
				 j++;
				 String expRes = row.getCell(j).getStringCellValue();
				 j++;
				 submit.click();
				 String status = "";
				 if(driver.getPageSource().contains("Saved") || driver.getPageSource().contains("Updated")) {
					 status = status + "Accepted";
					 v.add(status);
				 }
				 else {
					 status = status + "Declined";
					 v.add(status);
				 }	 
				 Cell cell = row.createCell(j);
				 cell.setCellValue(v.get(i-1));
				 j++;
				 Cell cell2 = row.createCell(j);
				 if(expRes.equals(status)) {
					 cell2.setCellValue("Passed");
					 cell2.setCellStyle(greencolor);
				 }
				 else {
					 cell2.setCellValue("Failed");
					 cell2.setCellStyle(redcolor);
				 }
				 driver.close();

		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
		     System.out.println("Processed Test Cases : "+i+"/"+rowCount);

		}
		is.close();
		
		FileOutputStream fo = new FileOutputStream(file);
		tsWb.write(fo);
		fo.close();
		tsWb.close();
		Desktop desktop = Desktop.getDesktop();
		desktop.open(file);
	}
	
	public static void main(String[] args) {
		
		String path = "D:/x3/htdocs/selenium2/src/selenium2/testcases.xlsx";
		String sheetname = "Sheet1";
		Vector<String> v = new Vector<String>();
		ExcelImport e = new ExcelImport();
		try {
			e.readExcel(path,sheetname,v);
		}
		catch(Exception ex) {
			System.out.println("caught ioexception");
			ex.printStackTrace();
		}
	}

}
