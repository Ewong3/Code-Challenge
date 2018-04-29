package feed;

import java.util.ArrayList;

/**
 * 
 * @author Eric
 *
 * Class FeedItem holds an ID, username, and a list of BodyItems.
 */

public class FeedItem {
	private int Id;
	private String username;
	private ArrayList<BodyItem> bodies;
	
	public FeedItem(int id, String username) {
		setId(id);
		setUsername(username);
		setBodies(new ArrayList<BodyItem>());
	}

	public void addBody(BodyItem bodyItem) {
		bodies.add(bodyItem);
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<BodyItem> getBodies() {
		return bodies;
	}

	public void setBodies(ArrayList<BodyItem> bodies) {
		this.bodies = bodies;
	}

	
}
