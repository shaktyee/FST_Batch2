package readexceldata;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("./TestData/ReadData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("emp_details");
		
		int row_count = sheet.getLastRowNum();
		System.out.println("Total number of rows is: "+ row_count);
		
		int col_count = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of columns is: "+ col_count);
		
		System.out.println("-------- Read all Excel Data -------");
		
		for(int i = 1; i<=row_count;i++) {
			for(int j=0;j<col_count;j++) {
			String val = sheet.getRow(i).getCell(j).toString();
			System.out.println(val);
		}
		}
	}

}
