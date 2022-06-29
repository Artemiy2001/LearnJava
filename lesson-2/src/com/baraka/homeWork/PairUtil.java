package com.baraka.homeWork;

import com.baraka.oopPractic.Archer;
import com.baraka.oopPractic.Enemy;

public final class PairUtil<K, V> extends Pair<K, V>{

    private PairUtil(K firstVar, V secondVar) {
        super(firstVar, secondVar);
    }

    public static void main(String[] args) {
        Pair<Boolean, String > pair = new Pair<>(true, "sdad");

        Pair newPair =  swap(pair);

        System.out.println(newPair.getFirstVar());
        System.out.println(newPair.getSecondVar());
    }

    public static Pair swap(Pair pair){
        Pair<String, Boolean> NewPair = new Pair(pair.getSecondVar(), pair.getFirstVar());

        return NewPair;
    }
}
