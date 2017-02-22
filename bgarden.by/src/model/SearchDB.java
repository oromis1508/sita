package model;

import java.util.ArrayList;

public class SearchDB extends ConnectDB{
	
	private String requestSearch;
	
	public SearchDB() {
		super();
		requestSearch="";
	}

	public ArrayList<String[]> getResponse(ArrayList<String[]> paramsValues) {
		
		for(int i=0; i<paramsValues.size(); i++)
			switch (paramsValues.get(i)[0]) {
			case "valueRegNum": 
				requestSearch += " AND nameplants.RegNumber " + paramsValues.get(i)[1];
				break;
			case "valueNumber":
				requestSearch += " AND numberplants.Value " + paramsValues.get(i)[1];			
				break;
			case "valueName":
				requestSearch += " AND nameplants.Name " + paramsValues.get(i)[1];
				break;
			case "valueFamily":
				requestSearch += " AND description.Family " + paramsValues.get(i)[1];
				break;
			case "plantType[]":
				requestSearch += " AND (";
				for(int j=1; j<paramsValues.get(i).length; j++)
					if(paramsValues.get(i)[j+1]!=null)
						requestSearch +="description.Type " + paramsValues.get(i)[j] + "OR ";
					else
					{
						requestSearch +="description.Type " + paramsValues.get(i)[j] + ")";
						break;
					}
				break;
			case "plantLife[]":
				requestSearch += " AND (";
				for(int j=1; j<paramsValues.get(i).length; j++)
					if(paramsValues.get(i)[j+1]!=null)
						requestSearch +="description.Life " + paramsValues.get(i)[j] + "OR ";
					else
					{
						requestSearch +="description.Life " + paramsValues.get(i)[j] + ")";
						break;
					}
				break;
			}
		return super.setQuery(requestSearch);
	}

	public ArrayList<String[]> getResponse(String requestString) {
		
		requestSearch+=
				 " AND (nameplants.RegNumber " + requestString
				+" OR numberplants.Value " + requestString
				+" OR nameplants.Name " + requestString
				+" OR description.Family " + requestString
				+" OR description.Type " + requestString
				+" OR description.Life " + requestString + ")";
		
		return super.setQuery(requestSearch);
	}

	
}
