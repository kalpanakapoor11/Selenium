package utility;

import base.TestBase;

public class testutil extends TestBase {
	

	public static Object[][] getData(String sheetName){
		
	
		int row=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		Object[][] data=new Object[row-1][cols];
		
		for(int rownum=2;rownum<=row;rownum++){
			for(int colnum=0;colnum<cols;colnum++){
				data[rownum-2][colnum]=excel.getCellData(sheetName, colnum, rownum);
			}
		}
		System.out.println("Total rows are:"+row);
		System.out.println("Total cols are:"+cols);
			
		return data;

}
}
