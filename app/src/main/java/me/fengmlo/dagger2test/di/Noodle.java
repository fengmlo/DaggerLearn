package me.fengmlo.dagger2test.di;

import javax.inject.Inject;

public class Noodle {

    @Inject
    public Noodle() {
    }

    @Override
    public String toString() {
        return "面条";
    }
}
