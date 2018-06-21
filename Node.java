package com.leoIt.Link4;

/**
 * @author D N
 * @create 2018-06-21 15:29
 **/
public class Node {
    public Object obj;
    public Node next;
    public Node prious;
    public Node(){

    }

    public Node(Object obj, Node next, Node prious) {
        this.obj = obj;
        this.next = next;
        this.prious = prious;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrious() {
        return prious;
    }

    public void setPrious(Node prious) {
        this.prious = prious;
    }
}
