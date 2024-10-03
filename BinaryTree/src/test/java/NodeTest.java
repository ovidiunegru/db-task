import org.example.model.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {


    private BinaryTree tree;

    @BeforeEach
    void setUp() {
        tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(2);
        tree.insert(10);
        tree.insert(11);
    }

    @Test
    void getMaxTest() {
        assertEquals(11, this.tree.findMaxValue());
    }

    @Test
    void calculateDepthTest() {
        assertEquals(3, this.tree.findTreeDepth());
    }

    @Test
    void emptyTreTest() {
        BinaryTree tree = new BinaryTree();
        assertEquals(0, tree.findTreeDepth());
    }

    @Test
    void oneNodeTest() {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);

        assertEquals(10, tree.findMaxValue());
        assertEquals(1, tree.findTreeDepth());
    }
}