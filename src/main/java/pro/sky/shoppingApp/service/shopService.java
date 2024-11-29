package pro.sky.shoppingApp.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface shopService {
    Set<Integer> add(List<Integer>goods);
    Set<Integer> get();
}
