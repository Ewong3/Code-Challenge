package parser;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import feed.BodyItem;
import feed.BodyItemFactory;
import feed.FeedItem;

/**
 * 
 * @author Eric
 * 
 * Class Parser is a class which parses various data
 */

public class Parser {

	/**
	 * 
	 * @param JSONdata 
	 * @return ArrayList<FeedItem>
	 * @throws JSONException
	 * 
	 * Method parseFeedItems() parses given JSON data into an ArrayList of FeedItems   
	 */
	
	public ArrayList<FeedItem> parseFeedItems(String JSONdata) throws JSONException {
		ArrayList<FeedItem> feedItems = new ArrayList<FeedItem>();
		JSONArray userArray = new JSONArray(JSONdata);
		
		for(int i = 0; i < userArray.length(); i++ ) {
			JSONObject user = userArray.getJSONObject(i);
			
			// Create a FeedItem
			int userID = user.getInt("Id");
			String username = user.getString("username");
			FeedItem feedItem = new FeedItem(userID, username);
			
			JSONArray bodyArray = user.getJSONArray("body");
			
			// Add BodyItems into FeedItem
			for(int j = 0; j < bodyArray.length(); j++) {
				JSONObject body = bodyArray.getJSONObject(i);
				
				BodyItem bodyItem = BodyItemFactory.ParseBodyItem(body);
				feedItem.addBody(bodyItem);
			}
			
			// Add FeedItem into the list
			feedItems.add(feedItem);
		}
		
		return feedItems;
	}
	
	public static void main(String[] args) throws JSONException {
		// Grab JSON feed
		String JSONdata = getFeed();
		
		// Parse JSON feed into a list of FeedItems
		Parser parser = new Parser();
		ArrayList<FeedItem> feedItems = parser.parseFeedItems(JSONdata);
		
		// Display FeedItems
		displayFeed(feedItems);
	}
}
