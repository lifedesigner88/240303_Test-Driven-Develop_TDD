package stack;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


public class StackTest {
    @Test
    public void canCreateStack() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }
}
