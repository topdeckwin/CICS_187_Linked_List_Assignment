package edu.umass.cics.cs187.structures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.gradescope.jh61b.grader.GradedTest;

public class PrivateListInterfaceTest {

	private ListInterface<String> list;

	@Before
	public void setup(){
          list = new RecursiveList<String>();
//          ListInterface<String> l2 = new RecursiveList<String>();
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstIsEmptySizeAndGetFirst1() {", max_score=1)
	public void testInsertFirstIsEmptySizeAndGetFirst1() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstIsEmptySizeAndGetFirst2() {", max_score=1)
	public void testInsertFirstIsEmptySizeAndGetFirst2() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());

	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstIsEmptySizeAndGetFirst3() {", max_score=1)
	public void testInsertFirstIsEmptySizeAndGetFirst3() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert First should return instance of self", list, list.insertFirst("hello"));

	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstIsEmptySizeAndGetFirst4() {", max_score=2)
	public void testInsertFirstIsEmptySizeAndGetFirst4() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert First should return instance of self", list, list.insertFirst("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstIsEmptySizeAndGetFirst5() {", max_score=2)
	public void testInsertFirstIsEmptySizeAndGetFirst5() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert First should return instance of self", list, list.insertFirst("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstIsEmptySizeAndGetFirst6() {", max_score=2)
	public void testInsertFirstIsEmptySizeAndGetFirst6() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert First should return instance of self", list, list.insertFirst("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
		assertEquals("First element should .equals \"hello\".", "hello", list.getFirst());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstIsEmptySizeAndGetFirst7() {", max_score=2)
	public void testInsertFirstIsEmptySizeAndGetFirst7() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert First should return instance of self", list, list.insertFirst("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
		assertEquals("First element should .equals \"hello\".", "hello", list.getFirst());
		list.insertFirst("world");
		assertEquals(2, list.size());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstIsEmptySizeAndGetFirst8() {", max_score=5)
	public void testInsertFirstIsEmptySizeAndGetFirst8() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert First should return instance of self", list, list.insertFirst("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
		assertEquals("First element should .equals \"hello\".", "hello", list.getFirst());
		list.insertFirst("world");
		assertEquals(2, list.size());
		list.insertFirst("foo");
		assertEquals(3, list.size());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstIsEmptySizeAndGetFirst9() {", max_score=5)
	public void testInsertFirstIsEmptySizeAndGetFirst9() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert First should return instance of self", list, list.insertFirst("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
		assertEquals("First element should .equals \"hello\".", "hello", list.getFirst());
		list.insertFirst("world");
		assertEquals(2, list.size());
		list.insertFirst("foo");
		assertEquals(3, list.size());
		assertEquals("First element should .equals \"foo\".", "foo", list.getFirst());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastIsEmptySizeAndGetLast1() {", max_score=1)
	public void testInsertLastIsEmptySizeAndGetLast1() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastIsEmptySizeAndGetLast2() {", max_score=1)
	public void testInsertLastIsEmptySizeAndGetLast2() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastIsEmptySizeAndGetLast3() {", max_score=1)
	public void testInsertLastIsEmptySizeAndGetLast3() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert Last should return instance of self", list, list.insertLast("hello"));
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastIsEmptySizeAndGetLast4() {", max_score=2)
	public void testInsertLastIsEmptySizeAndGetLast4() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert Last should return instance of self", list, list.insertLast("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastIsEmptySizeAndGetLast5() {", max_score=2)
	public void testInsertLastIsEmptySizeAndGetLast5() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert Last should return instance of self", list, list.insertLast("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastIsEmptySizeAndGetLast6() {", max_score=1)
	public void testInsertLastIsEmptySizeAndGetLast6() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert Last should return instance of self", list, list.insertLast("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
		assertEquals("Last element should .equals \"hello\".", "hello", list.getLast());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastIsEmptySizeAndGetLast7() {", max_score=2)
	public void testInsertLastIsEmptySizeAndGetLast7() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert Last should return instance of self", list, list.insertLast("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
		assertEquals("Last element should .equals \"hello\".", "hello", list.getLast());
		list.insertLast("world");
		assertEquals(2, list.size());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastIsEmptySizeAndGetLast8() {", max_score=2)
	public void testInsertLastIsEmptySizeAndGetLast8() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert Last should return instance of self", list, list.insertLast("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
		assertEquals("Last element should .equals \"hello\".", "hello", list.getLast());
		list.insertLast("world");
		assertEquals(2, list.size());
		list.insertLast("foo");
		assertEquals(3, list.size());;
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastIsEmptySizeAndGetLast9() {", max_score=5)
	public void testInsertLastIsEmptySizeAndGetLast9() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert Last should return instance of self", list, list.insertLast("hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
		assertEquals("Last element should .equals \"hello\".", "hello", list.getLast());
		list.insertLast("world");
		assertEquals(2, list.size());
		list.insertLast("foo");
		assertEquals(3, list.size());
		assertEquals("Last element should .equals \"foo\".", "foo", list.getLast());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertAtIsEmptySizeAndGetAt() {", max_score=10)
	public void testInsertAtIsEmptySizeAndGetAt() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		assertEquals("Newly constructed list should be size 0.", 0, list.size());
		assertEquals("Insert At should return instance of self", list, list.insertAt(0, "hello"));
		assertFalse("List should now have elements.", list.isEmpty());
		assertEquals("List should now have 1 element.", 1, list.size());
		assertEquals("0th element should .equals \"hello\".", "hello", list.get(0));
		list.insertAt(1, "world");
		assertEquals("1th element should .equalse \"world\".", "world", list.get(1));
		assertEquals(2, list.size());
		list.insertAt(0, "foo");
		assertEquals(3, list.size());
		assertEquals("0th element should .equals \"foo\".", "foo", list.get(0));
		assertEquals("1th element should .equals \"hello\".", "hello", list.get(1));
		assertEquals("2th element should .equals \"world\".", "world", list.get(2));
	}

	@Test (timeout = 500, expected = IllegalStateException.class)
	@GradedTest(name="public void testExceptionOnEmptyGetFirst() {", max_score=1)
	public void testExceptionOnEmptyGetFirst() {
		list.getFirst();
	}

	@Test (timeout = 500, expected = IllegalStateException.class)
	@GradedTest(name="public void testExceptionOnEmptyGetLast() {", max_score=1)
	public void testExceptionOnEmptyGetLast() {
		list.getLast();
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertFirstRemoveFirstSizeAndIsEmpty() {", max_score=10)
	public void testInsertFirstRemoveFirstSizeAndIsEmpty() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		list.insertFirst("hello").insertFirst("there").insertFirst("world");
		assertEquals("List should now have 3 elements", 3, list.size());
		assertEquals("world", list.removeFirst());
		assertEquals("List should now have 2 elements", 2, list.size());
		assertEquals("there", list.removeFirst());
		assertEquals("List should now have 1 elements", 1, list.size());
		assertEquals("hello", list.removeFirst());
		assertEquals("List should now have 0 elements", 0, list.size());
		assertTrue("All elements removed, list should be empty.", list.isEmpty());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertLastRemoveLastSizeAndIsEmpty() {", max_score=10)
	public void testInsertLastRemoveLastSizeAndIsEmpty() {
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		list.insertLast("hello").insertLast("there").insertLast("world");
		assertEquals("List should now have 3 elements", 3, list.size());
		assertEquals("world", list.removeLast());
		assertEquals("List should now have 2 elements", 2, list.size());
		assertEquals("there", list.removeLast());
		assertEquals("List should now have 1 elements", 1, list.size());
		assertEquals("hello", list.removeLast());
		assertEquals("List should now have 0 elements", 0, list.size());
		assertTrue("All elements removed, list should be empty.", list.isEmpty());
	}

	@Test (timeout = 500, expected = IllegalStateException.class)
	@GradedTest(name="public void testExceptionOnEmptyRemoveFirst() {", max_score=1)
	public void testExceptionOnEmptyRemoveFirst() {
		list.removeFirst();
	}

	@Test (timeout = 500, expected = IllegalStateException.class)
	@GradedTest(name="public void testExceptionOnEmptyRemoveLast() {", max_score=1)
	public void testExceptionOnEmptyRemoveLast() {
		list.removeLast();
	}

	@Test (timeout = 500, expected = IndexOutOfBoundsException.class)
	@GradedTest(name="public void testExceptionOnOutOfBounds1() {", max_score=1)
	public void testExceptionOnOutOfBounds1() {
		list.removeAt(0);
	}

	@Test (timeout = 500, expected = IndexOutOfBoundsException.class)
	@GradedTest(name="public void testExceptionOnOutOfBounds2() {", max_score=1)
	public void testExceptionOnOutOfBounds2() {
		list.insertFirst("hello");
		list.removeAt(1);
	}

	@Test (timeout = 500, expected = IndexOutOfBoundsException.class)
	@GradedTest(name="public void testExceptionOnOutOfBounds3() {", max_score=1)
	public void testExceptionOnOutOfBounds3() {
		list.removeAt(-5);
	}

	@Test (timeout = 500, expected = IndexOutOfBoundsException.class)
	@GradedTest(name="public void testExceptionOnOutOfBounds4() {", max_score=1)
	public void testExceptionOnOutOfBounds4() {
		list.insertFirst("hello");
		list.removeAt(5);
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertsGetsRemovesSize(){", max_score=5)
	public void testInsertsGetsRemovesSize(){
		assertTrue("Newly constructed list should be empty.", list.isEmpty());
		list.insertLast("Hello").insertLast("World!");
		assertEquals("Insert at should return an instance of the list.", list, list.insertAt(1, "There"));
		assertEquals("Size should be 3", 3, list.size());
		assertEquals("0th element should .equals \"Hello\"", "Hello", list.get(0));
		assertEquals("Last element should .equals \"World!\"", "World!", list.getLast());
		list.insertAt(0, "foo").insertAt(4, "bar");
		assertEquals("foo", list.get(0));
		assertEquals("bar", list.get(4));
		assertEquals("Size should be 5", 5, list.size());
		assertEquals("The third element should have been \"World!\"", "World!", list.removeAt(3));
		assertEquals("Size should be 4", 4, list.size());
		assertEquals("Last element should be \"bar\"", "bar", list.getLast());
	}

	@Test (timeout = 500)
	@GradedTest(name="public void testInsertsRemoveAndIndexOf(){", max_score=5)
	public void testInsertsRemoveAndIndexOf(){
		list.insertLast("Hello").insertLast("World");
		assertEquals("Hello is at index 0", 0, list.indexOf("Hello"));
		assertEquals("World is at index 1", 1, list.indexOf("World"));
		assertEquals("Foo is not in the list.", -1, list.indexOf("Foo"));
		assertTrue("Hello can be removed.", list.remove("Hello"));
		assertEquals("Size should now be 1", 1, list.size());
		list.insertLast("Hello").insertLast("There").insertLast("Hello");
		assertEquals("World is at index 0", 0, list.indexOf("World"));
		assertEquals("First Hello is at index 1", 1, list.indexOf("Hello"));
		assertTrue("Hello can be removed.", list.remove("Hello"));
		assertEquals("First Hello is at index 2", 2, list.indexOf("Hello"));
		assertTrue("Hello can be removed.", list.remove("Hello"));
		assertEquals("Size of list should now be 2", 2, list.size());
		assertFalse("Foo cannot be removed.", list.remove("Foo"));
		assertEquals("Size of list should now be 2", 2, list.size());
		assertFalse("Hello cannot be removed.", list.remove("Hello"));
	}

	@Test (timeout = 1000)
	@GradedTest(name="public void testSpeed() {", max_score=10)
	public void testSpeed() {
		for(int i = 0; i < 500000; i++){
			assertEquals(i, list.size());
			list.insertFirst("MORE!");
			list.getFirst();
		}

		while(!list.isEmpty())
			list.removeFirst();
	}



}
