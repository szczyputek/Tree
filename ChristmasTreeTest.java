package pl.pgs.tree;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ChristmasTreeTest {

    TreeCreator treeCreator;

    @Before
    public void init() {
        treeCreator = new TreeCreator();
    }
//up
    @Test
    public void testSingleRowUp() {
        String tree = treeCreator.tree(1, "x","up");
        assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRowUp() {
        String tree = treeCreator.tree(2, "x", "up");
        assertThat(tree, equalTo(
                " x\n" +
                "xxx"));
    }

    @Test
    public void testOddRowUp() {
        String tree = treeCreator.tree(3, "x", "up");
        assertThat(tree, equalTo(
                "  x\n" +
                " xxx\n" +
                "xxxxx"));
    }
    
 //down   
    @Test
    public void testSingleRowDown() {
        String tree = treeCreator.tree(1, "x","down");
        assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRowDown() {
        String tree = treeCreator.tree(2, "x", "down");
        assertThat(tree, equalTo(
                "xxx\n" +
                " x"));
    }

    @Test
    public void testOddRowDown() {
        String tree = treeCreator.tree(3, "x", "down");
        assertThat(tree, equalTo(
                "xxxxx\n" +
                " xxx\n" +
                "  x"));
    }
    
    
//left
    @Test
    public void testSingleRowLeft() {
        String tree = treeCreator.tree(1, "x","left");
        assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRowLeft() {
        String tree = treeCreator.tree(2, "x", "left");
        assertThat(tree, equalTo(
                " x\n" +
                "xx\n" +
                " x"));
    }

    @Test
    public void testOddRowLeft() {
        String tree = treeCreator.tree(3, "x", "left");
        assertThat(tree, equalTo(
                "  x\n" +
                " xx\n" +
                "xxx\n" +
                " xx\n" +
                "  x"));
    }
    
    
//right
    @Test
    public void testSingleRowRight() {
        String tree = treeCreator.tree(1, "x","right");
        assertThat(tree, equalTo("x"));
    }

    @Test
    public void testEvenRowRight() {
        String tree = treeCreator.tree(2, "x", "right");
        assertThat(tree, equalTo(
                "x\n" +
                "xx\n" +
                "x"));
    }

    @Test
    public void testOddRowRight() {
        String tree = treeCreator.tree(3, "x", "right");
        assertThat(tree, equalTo(
                "x\n" +
                "xx\n" +
                "xxx\n" +
                "xx\n" +
                "x"));
    }    
	

/*	@Test
	public void test() {
		fail("Not yet implemented");
	} */

}
