package com.company;

public class BST <K extends Comparable<K>, V> {

    private Node root;
    private class Node{
        private K key;
        private V val;
        private Node left, right;
        public Node(K key, V val){
            this.key = key;
            this.val = val;
        }
    }

    public void put(K key, V val){
        Node node = new Node(key, val);

        if (root == null){
            root = node;
        }else{
            Node newNode = root;
            Node top;

            while(true){

            }
        }
    }

    public V get (K key){

    }

    public void delete(K key){}

    public Iterable<K> iterator(){}
}
