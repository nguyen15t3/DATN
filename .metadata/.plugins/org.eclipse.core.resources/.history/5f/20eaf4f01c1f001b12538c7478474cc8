package inputdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
	
	private static final String COMMA_DELIMITER = ","; // Split by comma
	 
    public static void main(String[] args) {
 
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\DATN_NguyenVanNguyen\\documents\\diemthi2020.csv"));
 
            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                printContry(parseCsvLine(line));
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }
 
    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<String>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
 
    private static void printContry(List<String> country) {
        System.out.println(
                "diem thi [stt= "
                + country.get(0) 
                + ", Dia= " + country.get(1) 
                + " , GDCD=" + country.get(2) 
                + " , Hoa="+country.get(3)
                +" , Ly="+country.get(4)
                +" , Ngoai_ngu="+country.get(5)
                +" , Sinh="+country.get(6)
                +" , Su="+country.get(7)
                +" , Toan="+country.get(8)
                +" , Van="+country.get(9)
                +" , SBD="+country.get(10));
        
    }

}
