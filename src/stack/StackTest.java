package stack;


import org.junit.Test;

import static junit.framework.TestCase.*;


public class StackTest {
    Stack stack = new Stack();

    @Test
    public void canCreateStack() throws Exception {
        assertTrue(stack.isEmpty());
        stack.push(0);
    }

    @Test
    public void afterOnePush_isNotEmpty() throws Exception{
        stack.push(0);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void afterOnePushAndOnePop_isEmpty() throws Exception {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterTwoPushs_sizeIsTwo() throws Exception {
        stack.push(0);
        stack.push(0);
        assertEquals(2, stack.getSize());
    }
}
