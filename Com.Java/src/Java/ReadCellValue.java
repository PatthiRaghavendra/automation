package Java;
//reading value of a particular cell  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

public class  ReadCellValue{
	

	 

	 
	{  
	public static void main(String[] args)   
	{  String vOutput=null;
	  String file1="E:\\Basic java training\\Test_files\\test_emp.xlsx";
		ReadCellValue rc=new ReadCellValue();  //object of the class  
	//reading the value of 2nd row and 2nd column  
		
	for(int i=1;i<3;i++)	
	{
		for(int j=0;j<2;j++) {
			System.out.println(i);
			System.out.println(j);
		  vOutput=rc.ReadCellData(i, j,file1);   
		System.out.println(vOutput);  
		}
	}

	//This is how independently this can be called from out side as a method in java

	String usname=rc.ReadCellData(3, 0,file1);   
	String password1=rc.ReadCellData(3, 1,file1);  

	System.out.println("user name got is "+usname);  
	System.out.println("password got is "+password1);  

	}
	//method defined for reading a cell  
	public String ReadCellData(int vRow, int vColumn,String file)  
	{  
	String value=null;          //variable for storing the cell value  
	Workbook wb=null;           //initialize Workbook null  
	try  
	{  
	//reading data from a file in the form of bytes  
	FileInputStream fis=new FileInputStream(file);  
	//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
	wb=new XSSFWorkbook(fis);  
	}  
	catch(FileNotFoundException e)  
	{  
	e.printStackTrace();  
	}  
	catch(IOException e1)  
	{  
	e1.printStackTrace();  
	}  
	Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
	value=cell.getStringCellValue();    //getting cell value  
	return value;               //returns the cell value  
	}
	}

	public String ReadCellData(int i, int j, String file) {
		// TODO Auto-generated method stub
		return null;
	}  

}
