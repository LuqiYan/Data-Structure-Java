public class SLList {
	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	// private IntNode first;
	private IntNode sentinel;
	private int size;

	public SLList() {
		// first = null;
		sentinel = new IntNode(77, null);
		size = 0;
	}

	public SLList(int x) {
		// first = new IntNode(x, null);
		sentinel = new IntNode(77, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	public void addFirst(int x) {
		// first = new IntNode(x, first); 
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}

	public int getFirst() {
		// return first.item;
		return sentinel.next.item;
	}

	public void addLast(int x) {
		size += 1;

		// if (first == null) {
		// 	first = new IntNode(x, n);
		// 	return;
		// }

		// IntNode p = first;
		IntNode p = sentinel;

		while (p.next != null) {
			p = p.next;	
		}

		p.next = new IntNode(x, null);
	}

	// private static int size(IntNode p) {
	// 	if (p.next == null) {
	// 		return 1;
	// 	} else {
	// 		return 1 + size(p.next);
	// 	}
	// }

	public int size() {
		// return size(first);
		return size;
	}

	public static void main(String[] args) {
		SLList M = new SLList();
		M.addLast(2);
		System.out.println(M.getFirst());

		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		System.out.println(L.size());
		System.out.println(L.getFirst());
		L.addLast(20);
		System.out.println(L.size());
	}
}