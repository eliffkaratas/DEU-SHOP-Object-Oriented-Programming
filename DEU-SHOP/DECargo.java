
public class DECargo {
	private Stack storage;
	private CargoWorker[] workers;

	public DECargo(int workerCount) {
		super();
		storage = new Stack(workerCount);
		workers = new CargoWorker[workerCount];
	}

	public Stack getStorage() {
		return storage;
	}

	public void setStorage(Stack storage) {
		this.storage = storage;
	}

	public CargoWorker[] getWorkers() {
		return workers;
	}

	public void setWorkers(CargoWorker[] workers) {
		this.workers = workers;
	}

	public void ListWorkers() {
		for (int i = 0; i < workers.length; i++) {
			if(workers[i]!=null)
			System.out.println(workers[i].toString());
		}
	}

	public int SearchWorker(String name) {
		boolean flag = false;
		int index = -1;
		for (int i = 0; i < workers.length; i++) {
			if (workers[i].getName() == name) {
				System.out.println(workers[i].toString());
				index = i;
				flag = false;
				break;
			}
		}
		if (!flag)
			System.out.println("NOT FOUND");
		return index;
	}

	public void ListStorage() {
		int size = storage.size();
		Stack temp = new Stack(size);
		if (size == 0)
			System.out.println("Storage is empty.");
		else {
			for (int i = 0; i < size; i++) {
				Packet P = (Packet) storage.peek();
				System.out.println(P.toString());
				temp.push(storage.pop());
			}

			for (int i = 0; i < size; i++) {
				storage.push(temp.pop());
			}
		}
	}

	public int SearchPacket(int ID) {
		int index = -1;
		boolean flag = false;
		int size = storage.size();
		Stack temp = new Stack(size);
		if (size == 0)
			System.out.println("Storage is empty.");
		else {
			for (int i = 0; i < size; i++) {
				Packet P = (Packet) storage.peek();
				if (P.getId() == ID) {
					flag = true;
					index = i;
				}
				temp.push(storage.pop());
			}

			for (int i = 0; i < size; i++) {
				storage.push(temp.pop());
			}
		}

		if (!flag)
			System.out.println("NOT FOUND");

		return index;
	}

	public Packet deletePacket(int ID) {
		Packet P = null;
		if (SearchPacket(ID) != -1) {
			int size = storage.size();
			Stack temp = new Stack(size);
			for (int i = 0; i < size; i++) {
				P = (Packet) storage.peek();
				if (P.getId() == ID) {
					P = (Packet) storage.pop();
				}
				temp.push(storage.pop());
			}

			for (int i = 0; i < size - 1; i++) {
				storage.push(temp.pop());
			}
		} else {
			System.out.println("Packet does not exist.");
		}
		return P;
	}

}
