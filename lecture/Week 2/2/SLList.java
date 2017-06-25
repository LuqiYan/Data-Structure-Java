public class SLList {
	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}

	private IntNode first;

	public SLList(int x) {
		first = new IntNode(x, null);
	}

	public void addFirst(int x) {
		first = new IntNode(x, first);
	}

	public int getFirst() {
		return first.item;
	}

	public void addLast(int x) {
		IntNode p = first;

		while (p.next != null) {
			p = p.next;	
		}

		p.next = new IntNode(x, null);
	}

	private static int size(IntNode p) {
		if (p.next == null) {
			return 1;
		} else {
			return 1 + size(p.next);
		}
	}

	public int size() {
		return size(first);
	}

	public static void main(String[] args) {
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		System.out.println(L.size());
		System.out.println(L.getFirst());
		L.addLast(20);
		System.out.println(L.size());
	}
}