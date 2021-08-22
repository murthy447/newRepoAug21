package amazonSearch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandle {

	public static XSSFSheet sheet;
	public static XSSFWorkbook WorkBook;
	public static XSSFCell cell;
	public static XSSFRow Row;
	public static FileInputStream FIStream;
	public static FileOutputStream FOStream;
	public static File filepath;
	public static int row;
	public static int col;
	
	public static void setExcelfile( String sheetname) throws IOException{
		try{
			String WorkingDir= System.getProperty("user.dir");
			 filepath= new File(WorkingDir+File.separator+"src"+File.separator+"input.xlsx");
			
			FIStream= new FileInputStream(filepath);
	  WorkBook= new XSSFWorkbook(FIStream);
	  sheet=  WorkBook.getSheet(sheetname);
		 row = sheet.getLastRowNum();
		 col=sheet.getRow(0).getLastCellNum();
	  
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.print(e.getMessage());
		}}
	
	
	public static String readCellValue(int rownum, int colnum){
		cell= sheet.getRow(rownum).getCell(colnum);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		String data= cell.getStringCellValue();
		return data;
		
	}
	
	
	public static void writeCellvalue(int rownum, int colnum, String data){
		
		try {
			
			FOStream= new FileOutputStream(filepath);
			cell=sheet.getRow(rownum).createCell(colnum);
			cell.setCellType(Cell.CELL_TYPE_STRING);
			cell.setCellValue(data);
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
	}
	
	public static void fileClose() throws IOException{
		
		try {
			FIStream.close();
		WorkBook.write(FOStream);
		FOStream.close();
		
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
	}
	
}
