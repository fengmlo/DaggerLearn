package me.fengmlo.dagger2test.di;

import javax.inject.Inject;

public class ZhaiNan {

    @Inject
//    @Named("baozi")
    Baozi baozi;

    @Inject
    Noodle noodle;

    @Inject
    public ZhaiNan() {
    }

    public String eat() {
        StringBuilder sb = new StringBuilder();
        sb.append("我吃的是 ");
        if (baozi != null) {
            sb.append(baozi.toString());
        }

        if (noodle != null) {
            sb.append("  ");
            sb.append(noodle.toString());
        }
        return sb.toString();
    }

}
