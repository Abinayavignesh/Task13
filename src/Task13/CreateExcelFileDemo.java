package Task13;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelFileDemo {

	public static void main(String[] args) throws Exception {
		
				//Creation of new Blank workbook 
				XSSFWorkbook wb=new XSSFWorkbook();
								
				//creates an excel file at the specified location  
				String filepath=".\\datafiles\\NewEmployeeData.xlsx";
				
				// Write the workbook in file system
				FileOutputStream fos=new FileOutputStream(filepath);
				wb.write(fos);
				
				// Closing file output connections 
				fos.close();
				System.out.println("NewEmployeeData.xlsx Written Successfully!");
	}

}

/*
NewEmployeeData.xlsx Written Successfully!

And a new Excel sheet will be created in the particular folder */