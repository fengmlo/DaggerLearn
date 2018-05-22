package me.fengmlo.dagger2test.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ZhaiNanModule {

    @Provides
    public static ZhaiNan provideZaiNan() {
        return new ZhaiNan();
    }

    @Provides
    public static Noodle provideNoodle() {
        return new Noodle();
    }

    @Provides
    @ActivitySingleton
//    @Named("baozi")
    public static Baozi provideBaozi() {
        return new Baozi();
    }

    @Provides
    @Baozi1
    public static Baozi provideBaozi1() {
        return new Baozi();
    }

    @Provides
    @Named("baozi2")
    public static Baozi provideBaozi2() {
        return new Baozi();
    }
}
