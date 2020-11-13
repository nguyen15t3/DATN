package inputdata;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javax.management.loading.ClassLoaderRepository;
import javax.print.attribute.standard.NumberOfInterveningJobs;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonStreamParser;
import com.google.gson.stream.JsonReader;

public class ReadFileJson {

	public static void main(String[] args) {

		JSONParser jsonP = new JSONParser();
		try {
			
			Object obj = jsonP.parse(new FileReader("university"));
			System.out.println(obj);

			JSONArray empList = (JSONArray) obj;

			empList.forEach(emp -> parseEmpObject((JSONObject) emp));

		} catch (Exception e) {
			e.getLocalizedMessage();
		}

	}

	/*
	 * public static University_data[] readData(){ //university_meta =null;
	 * JSONParser jsonP = new JSONParser(); try(FileReader reader = new
	 * FileReader("university_diemchuan")){ Object obj = jsonP.parse(reader);
	 * JSONArray empList = (JSONArray) obj; int n=3; while(n-->0) {
	 * System.out.println(empList); }
	 * 
	 * }catch(Exception e) { e.getLocalizedMessage(); } Gson gson = new Gson();
	 * //University_data[] university_data = gson.fromJson(builder.toString(),
	 * University_data[].class);
	 * 
	 * return university_data; }
	 */

	public static void parseEmpObject(JSONObject emp) {
		JSONObject empObj = (JSONObject) emp.get("university_meta");
		String url = (String) empObj.get("url");
		System.out.println(url);

		String name = (String) empObj.get("university_name");
		System.out.println(name);
		String code = (String) empObj.get("university_code");
		System.out.println(code);
	}

}
