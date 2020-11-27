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
      this.next = first;
    }

    public boolean hasNext() {
      return next != null;
    }

    public T next() {
      T result = next.getData();
      next = next.getNext();
      return result;
    }

    public void remove() {
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
    
    // size += 1;

    // head = new Node<T>(elem, head);

    // return this;
  }

  @Override
  public ListInterface<T> insertLast(T elem) {
    return insertAt(size, elem);
  }

  @Override
  public ListInterface<T> insertAt(int index, T elem) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException();
    }


    // If we've made it this far, the index passed to this method
    // is a valid index.

    // If index is 0, we want to insert at the front of
    // the list. So, we simply call insertFirst and
    // return what that returns
    if (index == 0) {
      return insertFirst(elem);
    }

    // If we've made it this far, we are definitely adding a
    // new node to the list so we increment the size and
    // create a new node
    size += 1;
    Node<T> prev = findNode(index - 1, head);
    Node<T> newNode = new Node<T>(elem, prev.getNext());


    // If we've made it this far, we are inserting the
    // value somewhere within the list. This means we
    // are going to have to set the next value of some node
    // to be the new node. So, first we find the previous node.
    // Then, we set the next of the new node to be whatever that
    // previous node was pointing at (null in the case where we
    // are inserting at the end of the list). Then, we
    // set the previous node to point at the new node
    // finally we return this list.
    prev.setNext(newNode);
    return this;
  }

  @Override
  public T removeFirst() {
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    return removeAt(0);
  }

  @Override
  public T removeLast() {
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    return removeAt(size - 1);
  }

  @Override
  public T removeAt(int i) {
    if (i < 0 || i >= size) {
      throw new IndexOutOfBoundsException();
    }
    // If we've made it past the check above, we are definitely
    // going to be removing something so we decrement the size by 1
    size -= 1;

    // If we are removing the first element, we have a special case
    // where we have to update the reference to head to be the
    // node after head
    if (i == 0) {
      T val = head.getData();
      head = head.getNext();
      return val;
    }

    // Otherwise, we find the node right before the one to remove
    // do some patch work, then return its data
    Node<T> prev = findNode(i - 1, head);

    // The node we are removing is the node after the previous node
    Node<T> remove = prev.getNext();

    // The previous node should point at the node after the one we are
    // removing. We know for sure that remove is not null. If it is
    // the last element then remove.next is null and so prev.next will
    // be null. This means that prev is now the end of the list!
    prev.setNext(remove.getNext());

    // Finally, we return the value in remove
    return remove.getData();
  }

  @Override
  public T getFirst() {
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    return get(0);
  }

  @Override
  public T getLast() {
    if (isEmpty()) {
      throw new IllegalStateException();
    }
    return get(size - 1);
  }

  @Override
  public T get(int i) {
    if (i < 0 || i >= size) {
      throw new IndexOutOfBoundsException();
    }
    return findNode(i, head).getData();
  }

  @Override
  public boolean remove(T elem) {
    // An empty list will always return false because the
    // element won't be found
    if (head == null) {
      return false;
    }

    // We try to find the element
    int i = indexOf(elem);

    // If we didn't find it, we return false
    if (i == -1) {
      return false;
    }

    // Otherwise we remove it and return true.
    removeAt(i);
    return true;
  }

  @Override
  public int indexOf(T elem) {
    return indexOfHelper(elem, 0, head);
  }

  private int indexOfHelper(T elem, int index, Node<T> node) {
    // If node is null, we've reached the end of the list
    // and we didn't find the node so we return -1
    if (node == null) {
      return -1;
    }
    // Otherwise, we are not at the end so we check to see if
    // the element is here. If it is, we return the index we
    // are at
    if (node.getData().equals(elem)) {
      return index;
    }

    // Otherwise, we recur on the next element increasing the index
    // by 1.
    return indexOfHelper(elem, index + 1, node.getNext());
  }

  @Override
  public boolean isEmpty() {
    return head == null;
  }

  // Finds the node that is distance nodes after curr. That is,
  // if distance is 0, then curr is returned. Otherwise,
  // we recurse down the list.
  private final Node<T> findNode(int distance, Node<T> curr) {
    if (distance == 0) {
      return curr;
    }
    return findNode(distance - 1, curr.getNext());
  }

  public Iterator<T> iterator() {
    return new LinkedNodeIterator<T>(this.head);
  }
}
