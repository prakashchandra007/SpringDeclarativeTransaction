import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileReader {
	
	public List<Student> getAllStudent(String ezcelFilePath)
	{
		List<Student> studentList = new ArrayList<Student>();
		
		try {
			//Create the input stream from the xlsx/xls file
			/*FileInputStream fis = new FileInputStream("E:\\Input\\Book1.xlsx");*/
			FileInputStream fis = new FileInputStream(ezcelFilePath);
			
			//Create Workbook instance for xlsx/xls file input stream
			Workbook workbook =  new XSSFWorkbook(fis);
			/*if(fileName.toLowerCase().endsWith("xlsx")){
				workbook = new XSSFWorkbook(fis);
			}
			*/
			//Get the number of sheets in the xlsx file
			int numberOfSheets = 1;
			
			//loop through each of the sheets
			for(int i=0; i < numberOfSheets; i++){
				
				//Get the nth sheet from the workbook
				Sheet sheet = workbook.getSheetAt(i);
				
				//every sheet has rows, iterate over them
				Iterator<Row> rowIterator = sheet.iterator();
				Student student = null;
				int rowCount = 1;
				while (rowIterator.hasNext()) 
		        {
					Row row = rowIterator.next();
					if(rowCount >= 2)
					{
						student = new Student();
						//Every row has columns, get the column iterator and iterate over them
						Iterator<Cell> cellIterator = row.cellIterator();
			             int count =0;
			            while (cellIterator.hasNext()) 
			            {
			            	Cell cell = cellIterator.next();
			            	switch(count)
			            	{
			            	case 0:
			            		student.setName(cell.getStringCellValue());
			            		break;
			            	case 1:
			            		student.setStudentId(cell.getStringCellValue());
			            		break;
			            	case 2:
			            	
			            		student.setRoll(1 );
			            		break;
			            	}
			            	count++;
			            }
			            studentList.add(student);
					}
					
		            	rowCount++;
		            } //end of cell iterator
		          
		        } //end of rows iterator
				
			//close file input stream
			fis.close();
			} catch (IOException e) {
			e.printStackTrace();
		}
		return studentList;
	}
}
