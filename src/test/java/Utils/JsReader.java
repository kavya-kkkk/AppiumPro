package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsReader {

public static JSONObject getJsonData() throws Exception {
	File filename = new File("C:\\Users\\HP\\eclipse-workspace\\Appium-mobile-test\\resources\\Test-data\\testData.json");
	String json = FileUtils.readFileToString(filename,"UTF-8");
	Object obj = new JSONParser().parse(json);
	JSONObject jsonObject  = (JSONObject) obj;
	return jsonObject;
	
}
 
 
public static String getTestData(String key) throws Exception {
	
	String testDatavalue;
	return testDatavalue = (String) getJsonData().get(key);
}
public static JSONArray getJsonArrayData(String key) throws Exception {
	
	JSONObject jsonObject = getJsonData();
	JSONArray jsonArray = (JSONArray) getJsonData().get(key);
	return jsonArray;
}
}
