package Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import Models.RawObject;
import Models.RequiredDetails;
import Models.Results;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@RestController
@RequestMapping(value = "/main")
public class MainController {

	// @RequestMapping(value="/getDetails", method =RequestMethod.GET)
	@GetMapping("/getDetails/{mfr}")
	public ResponseEntity<List<RequiredDetails>>  getManufracturer(@PathVariable("mfr") String mfrName) {
		try { 	
			if(mfrName==null)
				return new ResponseEntity<List<RequiredDetails>>(HttpStatus.BAD_REQUEST);
		String url = "https://vpic.nhtsa.dot.gov/api/vehicles/GetManufacturerDetails/" + mfrName+"?format=json";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		ArrayList<RequiredDetails> reqDetails = new ArrayList<RequiredDetails>(); 
		
		  JSONParser parser = new JSONParser(); 
		  
			  JSONObject obj =		  (JSONObject)parser.parse(result);
			  ArrayList list = new ArrayList();
		  JSONArray obj2 = (JSONArray) parser.parse(obj.get("Results").toString());
		  System.out.println("Result = "+(obj.get("Results").toString()));
			  
		  for(int i=0;i<obj2.size();i++) {
			  RequiredDetails reqD = new RequiredDetails();
			  System.out.println(obj2.get(i));
			  JSONObject resObj = (JSONObject) obj2.get(i);
			  System.out.println(resObj.get("Address"));
			  reqD.setCity(resObj.get("City") == null? null: resObj.get("City").toString());
			  reqD.setCountry(resObj.get("Country") == null? null :resObj.get("Country").toString());
			  reqD.setMfr_id(resObj.get("Mfr_ID") == null? null :resObj.get("Mfr_ID").toString());
			  reqD.setMfr_name(resObj.get("Mfr_Name") == null? null :resObj.get("Mfr_Name").toString());
			  reqD.setState(resObj.get("StateProvince") == null? null :resObj.get("StateProvince").toString());
			  reqDetails.add(reqD);
		  }		  	  	 

		return new ResponseEntity<List<RequiredDetails>>(reqDetails, HttpStatus.OK);
		} catch (ParseException e) { // TODO Auto-generated catch block
			  e.printStackTrace(); 
			  return new ResponseEntity<List<RequiredDetails>>(HttpStatus.METHOD_FAILURE);
		}
	}
}
