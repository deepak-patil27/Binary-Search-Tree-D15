package com.bridgelab;

public class BinaryNode<K extends Comparable<K>> {
	
	K key;
	BinaryNode<K> left;
	BinaryNode<K> right;
	
	public BinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
	
	@Override
	public String toString() {
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("{"+"Key = ").append(key).append('}');
		
		if(left != null) {
			myNodeString.append("->").append(left);
		}
		if(right != null) {
			myNodeString.append("->").append(right);
		}
		return myNodeString.toString();
	}
	
}
