
public class Node {
	private Object O;
	private Node Link;

	public Node(Object O) {
		this.O = O;
		Link = null;
	}

	public Object getO() {
		return O;
	}

	public void setO(Object O) {
		this.O = O;
	}

	public Node getLink() {
		return Link;
	}

	public void setLink(Node link) {
		Link = link;
	}

}
