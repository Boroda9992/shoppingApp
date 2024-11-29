package pro.sky.shoppingApp.service.Impl;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class shoppingCart {
    private final Set<Integer> goods = new HashSet<>();

    public Set<Integer> add (List<Integer> goods){
        this.goods.addAll(goods);
        return get();
    }

    public Set<Integer> get (){
        return Collections.unmodifiableSet(goods);
    }
}
