public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	public int get(int i) {
		if (i == 0) {
			return this.first;
		}
		return this.rest.iterativeGet(i - 1);
	}

	public int iterativeGet(int i) {
		IntList p = this;
		while (i != 0) {
			i -= 1;
			p = p.rest;
		}
		return p.first;
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);
		System.out.println(L.size());
		System.out.println(L.iterativeSize());
		System.out.println(L.get(0));
		System.out.println(L.get(1));
		System.out.println(L.get(2));
		System.out.println(L.iterativeGet(0));
		System.out.println(L.iterativeGet(1));
		System.out.println(L.iterativeGet(2));
	}
}