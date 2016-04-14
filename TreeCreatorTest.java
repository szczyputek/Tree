package pl.javadev.tree;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class TreeCreatorTest {
	
	TreeCreator treeCreator;
	
	@Before
    public void init() {
        treeCreator = new TreeCreator();
    }

    @Test
    public void testSingleRow() {
        String tree = treeCreator.creator("x", 1);
        assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRow() {
        String tree = treeCreator.creator("x", 2);
        assertThat(tree, equalTo(
                " x\n" +
                "xxx"));
    }
    @Test
    public void testOddRow() {
        String tree = treeCreator.creator("x", 3);
        assertThat(tree, equalTo(
                "  x\n" +
                " xxx\n" +
                "xxxxx"));
    }

}
