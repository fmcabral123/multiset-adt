
public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py 1
    private Integer root = null;
    private Tree[] subtrees;
    public Tree(int root, Tree[] subtrees) {
        this.root = root;
        if (subtrees == null) {
            Tree[] subs = {};
            this.subtrees = subs;
        }
        else {
            this.subtrees = subtrees;
        }
    }
    public boolean isEmpty() {
        return this.root == null;
    }
}
