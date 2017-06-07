public void BFS(Node root) {
	if (root == null)
		return;
	Queue<Node> q = new LinkedList<Node> ();
	q.offer(root);
	while (!q.empty())
	{
		int size = q.size(); // size = # of generated node in the next layer
		for(int i = 0; i<size;i++){
			Node n= q.remove();
			if(n.left!=null);
				q.offer(n.left);
			if(n.right!=null);
				q.offer(n.right);
			System.out.print(n.val+" ");
		}
		System.out.println();
	}
}