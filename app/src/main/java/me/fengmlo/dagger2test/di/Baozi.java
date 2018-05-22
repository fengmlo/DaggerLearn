package me.fengmlo.dagger2test.di;

import javax.inject.Inject;

public class Baozi {

    private static int count = 0;

    @Inject

    public Baozi() {
        count++;
    }

    @Override
    public String toString() {
        return "小笼包" + count;
    }
}
