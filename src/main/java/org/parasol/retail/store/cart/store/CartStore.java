package org.parasol.retail.store.cart.store;

import org.parasol.retail.store.cart.model.Cart;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class CartStore {

    public static final Map<String, Cart> INSTANCE = new HashMap<>();

    public Cart getCart(String cartId) {
        return INSTANCE.get(cartId);
    }

    public void storeCart(Cart cart) {
        INSTANCE.put(cart.getCartId(), cart);
    }

    public void removeCart(String cartId) {
        INSTANCE.remove(cartId);
    }

}
