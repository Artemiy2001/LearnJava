package com.baraka.homeWork;

public class Pair<K, V>{

    private K firstVar;

    private V secondVar;


    public Pair(K firstVar, V secondVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
    }

    public K getFirstVar() {
        return firstVar;
    }

    public void setFirstVar(K firstVar) {
        this.firstVar = firstVar;
    }

    public V getSecondVar() {
        return secondVar;
    }

    public void setSecondVar(V secondVar) {
        this.secondVar = secondVar;
    }
}
