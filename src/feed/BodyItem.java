package feed;

/**
 * 
 * @author Eric
 * 
 * Class BodyItem holds an ID, bodyType, and the source of the item
 */

public class BodyItem {
	private int Id;
	private String bodyType;
	private String source;
	
	public BodyItem(int id, String bodyType, String source) {
		setId(id);
		setBodyType(bodyType);
		setSource(source);
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
