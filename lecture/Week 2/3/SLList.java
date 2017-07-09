public class SLList<LochNess> {
	private class StuffNode {
		public LochNess item;
		public StuffNode next;

		public StuffNode(LochNess i, StuffNode n) {
			item = i;
			next = n;
		}
	}

	private StuffNode first;
	private int size;

	public SLList(LochNess x) {
		first = new StuffNode(x, null);
		size = 1;
	}

	public void addFirst(LochNess x) {
		first = new StuffNode(x, first); 
		size += 1;
	}

	public LochNess getFirst() {
		return first.item;
	}

	public void addLast(LochNess x) {
		size += 1;

		StuffNode p = first;

		while (p.next != null) {
			p = p.next;	
		}

		p.next = new StuffNode(x, null);
	}

	public int size() {
		return size;
	}
}