package unionfind;

public class QuickUnion {

	private int [] id;
	
	public QuickUnion(int n) {
		id = new int[n];
		for (int i = 0; i < id.length; i++) {
			id[i] = 1;
			
		}
	}
	
	private int root(int i) {
		while(i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
		
	}
}
