
public class List {
	private Node Head;

	public List() {
		Head = null;
	}

	public Node getHead() {
		return Head;
	}

	public void setHead(Node head) {
		Head = head;
	}

	public void print() {
		if (Head == null)
			System.out.println("linked list is empty");
		else {
			Node temp = Head;

			while (temp != null) {

				System.out.println(temp.getO());

				temp = temp.getLink();

			}

		}
	}

	public int size() {
		int count = 0;
		if (Head == null)
			System.out.println("List already empty");
		else {
			Node temp = Head;
			while (temp != null) {
				count++;
				temp = temp.getLink();
			}
		}
		return count;
	}

	public void add(Object O) {
		Node previous = null;
		Node temp = Head;
		while (temp != null) {
			previous = temp;
			temp = temp.getLink();
		}
		Node newnode = new Node(O);
		if (previous == null) {
			Head = newnode;
		} else {
			previous.setLink(newnode);
		}
	}

	public boolean search(Object O) {
		Node temp = Head;
		boolean flag = true;
		while (temp != null && flag) {
			if (temp.getO().equals(O))
				flag = false;
			temp = temp.getLink();
		}

		return !flag;

	}

	public Node remove(Object O) {
		Node newnode = null;
		if (search(O)) {
			if (Head != null) {
				Node previous = null;
				Node temp = Head;
				Node next = Head.getLink();
				boolean flag = true;
				while (next != null && flag) {
					if (temp.getO().equals(O)) {
						flag = false;
						newnode = temp;
						if (previous == null)
							Head=next;
						else {
							previous.setLink(next);
						}
					}
					if (flag) {
						previous=temp;
						temp=next;
						next = next.getLink();
					}
					if (temp.getO().equals(O)) {
						flag = false;
						newnode = temp;
						if (previous == null)
							Head=next;
						else {
							previous.setLink(next);
						}
					}

				}
			} else {
				Head = null;
			}

		}
		return newnode;
	}
}
