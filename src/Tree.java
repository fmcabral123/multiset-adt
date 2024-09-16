import org.w3c.dom.Node;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py 1
    private int root;
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
}
