package com.leoIt.Link4;

/**
 * @author D N
 * @create 2018-06-21 15:30
 **/
public class MyLinkedList {
    private Node first;
    private Node last;
    private int size;

    public int size() {
        return size;
    }

    public void add(Object obj) {
        Node node = new Node();
        node.setObj(obj);
        if (first != null) {
            node.setNext(first);
            node.setPrious(last);
            last.setNext(node);
            last = node;
            if (size == 1) {
                first.setNext(node);
                first.setPrious(node);
            }
        } else {
            node.setPrious(node);
            node.setNext(node);
            first = node;
            last = node;
        }
        size++;
    }

    public void remove(int index) {
        Node node = node(index);
        if (node != null) {
            if (index == 0 && size == 1) {
                node.prious.next = null;
                first = null;
                last = null;
            }else {
                node.prious.next = node.next;
                node.next.prious = node.prious;
                first = node.next;
            }
//            if (index == 0 && size != 1) {
//
//            }
            if(index==(size-1)){
                last=node.prious;
                last.next=first;
            }
            size--;
        }

    }

    public Object get(int index) {
        Node node = node(index);
        if (node != null) {
            return node.obj;
        }
        ;
        return null;
    }

    private Node node(int index) {
        Node node = null;
        if (first != null) {
            node = first;
        }
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("1");
//        myLinkedList.add("2");
        myLinkedList.add("3");
        myLinkedList.remove(1);
//        myLinkedList.add("4");
        System.out.println(myLinkedList.size());
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println(myLinkedList.get(i));
        }
    }
}
