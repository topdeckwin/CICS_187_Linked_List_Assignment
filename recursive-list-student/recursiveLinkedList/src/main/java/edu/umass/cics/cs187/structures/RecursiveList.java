package edu.umass.cics.cs187.structures;

import java.util.Iterator;

public class RecursiveList<T> implements ListInterface<T> {

  private int size;
  private Node<T> head = null;
  
  class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
      this.data = data;
      this.next = next;
    }

    public T getData() { 
      return data; 
    }
    
    public Node<T> getNext() { 
      return next; 
    }

    public void setData(T data) { 
      this.data = data; 
    }
    
    public void setNext(Node<T> next) { 
      this.next = next; 
    }
  }

  class LinkedNodeIterator<T> implements Iterator<T> {
    private Node<T> next;

    public LinkedNodeIterator(Node<T> first) {
      // TODO: Initialize the iterator by assigning first to next (as the starting point)
      throw NotImplementedException(); // Remove `throw NotImplementedException()` statements before you go
    }

    public boolean hasNext() {
      // TODO: Hint, When the iterator does not have `next`, it will be false
      throw NotImplementedException();
    }

    public T next() {
      // TODO: Next should obtain the next node of current node and assign current `next` to the obtained node,
      //       then return the current node
      throw NotImplementedException();
    }

    public void remove() {
      // We don't need to support this because we have a single linked list
      throw new UnsupportedOperationException();
    }
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public ListInterface<T> insertFirst(T elem) {
    // At this point, we are definitely adding a node to
    // the list so we increase the size and create a new node
    throw NotImplementedException();
  }

  @Override
  public ListInterface<T> insertLast(T elem) {
    // TODO: Use `insertAt` to insert `elem` at the *last* element
    return insertAt(size, elem);
  }

  @Override
  public ListInterface<T> insertAt(int index, T elem) {
    // It is always a good practice to check boundaries before preceeding
    // Here we should check index to fall in the range. If not throw exception by `throw new IndexOutOfBoundsException();`   

    // TODO: Insert your code here

    // If we've made it this far, the index passed to this method
    // is a valid index.

    // If index is 0, we want to insert at the front of
    // the list. So, we simply call insertFirst and
    // return what that returns

    // TODO: Insert your code here

    // If we've made it this far, we are definitely adding a
    // new node to the list. So we increment the size and
    // create a new node by finding the node before the index

    // We are inserting the value somewhere within the list. 
    // This means we are going to have to set the next value of some node
    // to be the new node. So, first we find the previous node.
    // Then, we set the next of the new node to be whatever that
    // previous node was pointing at (null in the case where we
    // are inserting at the end of the list). Then, we
    // set the previous node to point at the new node
    // finally we return this list.
    
    // TODO: Insert your code here

    return this;
  }

  @Override
  public T removeFirst() {
    // TODO: Check the list actually have the `first` node (which is not empty). 
    // If not, throw `IllegalStateException` like what we did before

    // TODO: Remove by calling `removeAt`
  }

  @Override
  public T removeLast() {
    // TODO: Check the list actually have the `last` node (which is not empty). 
    // If not, throw `IllegalStateException` like what we did before

    // TODO: Remove by calling `removeAt`
  }

  @Override
  public T removeAt(int i) {
    // TODO: Check if `i` falls into the range. If not, throw exception like what we did before.

    // If we've made it past the check above, we are definitely
    // going to be removing something so we decrement the size by 1

    // TODO: Insert your code here

    // If we are removing the first element, we have a special case
    // where we have to update the reference to head to be the
    // node after head

    // TODO: Insert your code here

    // Otherwise, we find the node right before the one to remove
    // do some patch work, then return its data
    // TODO: Insert your code here

    // The node we are removing is the node after the previous node
    // TODO: Insert your code here

    // The previous node should point at the node after the one we are
    // removing. We know for sure that remove is not null. If it is
    // the last element then remove.next is null and so prev.next will
    // be null. This means that prev is now the end of the list!
    // TODO: Insert your code here

    // Finally, we return the value in remove
    // TODO: Insert your code here
  }

  @Override
  public T getFirst() {
    // TODO: Check the list actually have the `first` node (which is not empty). 
    // If not, throw `IllegalStateException` like what we did before

    // TODO: After passed the check, return the first node by `get`
  }

  @Override
  public T getLast() {
    // TODO: Check the list actually have the `last` node (which is not empty). 
    // If not, throw `IllegalStateException` like what we did before

    // TODO: After passed the check, return the first node by `get`
    // Note that the last node have index lesser than `size`
  }

  @Override
  public T get(int i) {
    // TODO: Check if `i` falls into the range. If not, throw exception like what we did before.
    // TODO: `get` by `findNode` and then `getData`
  }

  @Override
  public boolean remove(T elem) {
    // An empty list will always return false because the
    // element won't be found

    // TODO: Insert your code here

    // We try to find the element
    // TODO: Insert your code here

    // If we didn't find it, we return false
    // TODO: Insert your code here

    // Otherwise we remove it and return true.
    // TODO: Insert your code here
  }

  @Override
  public int indexOf(T elem) {
    return indexOfHelper(elem, 0, head);
  }

  private int indexOfHelper(T elem, int index, Node<T> node) {
    // If node is null, we've reached the end of the list
    // and we didn't find the node so we return -1
    
    // TODO: Insert your code here

    // Otherwise, we are not at the end so we check to see if
    // the element is here. If it is, we return the index we
    // are at

    // TODO: Insert your code here

    // Otherwise, we recur on the next element increasing the index
    // by 1.

    // TODO: Insert your recursion code here
  }

  @Override
  public boolean isEmpty() {
    // TODO: Check if head is null
  }

  // Finds the node that is distance nodes after curr. That is,
  // if distance is 0, then curr is returned. Otherwise,
  // we recurse down the list.
  private final Node<T> findNode(int distance, Node<T> curr) {
    // TODO: Insert your code here
  }

  public Iterator<T> iterator() {
    return new LinkedNodeIterator<T>(this.head);
  }
}
