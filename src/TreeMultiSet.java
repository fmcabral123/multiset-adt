public class TreeMultiSet extends MultiSet {

    // TODO add a Tree object as a private instance variable for this class.
    private Tree tree;
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        // TODO complete this method
        this.tree.insert(item);
    }
    // TODO write the rest of the implementation for this class so that it uses its private Tree
    //      object to provide the MultiSet functionality.
    void remove(Integer item) {
        this.tree.delete_item(item);
    }
    boolean contains(Integer item) {
        return
    }
}
