package feed;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 
 * @author Eric
 *
 * Class BodyItemFactory is a factory class which, given a body in a JSON format, will create a BodyItem
 */

public class BodyItemFactory {
	public static BodyItem ParseBodyItem(JSONObject JSONBody) throws JSONException {
		int id = JSONBody.getInt("Id");
		String type = JSONBody.getString("bodyType");
		String source = null;
		
		switch (type) {
			case "text":
				source = JSONBody.getString("text");
				break;
			case "image":
				source = JSONBody.getString("mediaLocation");
				break;
			case "video":
				source = JSONBody.getString("mediaLocation");
				break;
			default:
				System.out.println("Error in bodyType");
		}
		
		BodyItem bodyItem = new BodyItem(id, type, source);
		
		return bodyItem;
		
	}
}
