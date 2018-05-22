package me.fengmlo.dagger2test.di;

import dagger.Component;
import me.fengmlo.dagger2test.MainActivity;

//@Component()
@ActivitySingleton
@Component(modules = {ZhaiNanModule.class})
public interface ZhaiNanComponent {
    ZhaiNan get();

    void inject(MainActivity mainActivity);

    void inject(ZhaiNan zhaiNan);
}
