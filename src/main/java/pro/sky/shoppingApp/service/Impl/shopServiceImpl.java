package pro.sky.shoppingApp.service.Impl;

import org.springframework.stereotype.Service;
import pro.sky.shoppingApp.service.shopService;

import java.util.List;
import java.util.Set;

@Service
public class shopServiceImpl implements shopService {

    private final shoppingCart shoppingCart;

    public shopServiceImpl(pro.sky.shoppingApp.service.Impl.shoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public Set<Integer> add(List<Integer> goods) {
        return shoppingCart.add(goods);
    }

    @Override
    public Set<Integer> get() {
        return shoppingCart.get();
    }
}
