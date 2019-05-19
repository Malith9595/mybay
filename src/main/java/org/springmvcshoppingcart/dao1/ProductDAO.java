package org.springmvcshoppingcart.dao1;
import org.springmvcshoppingcart.entity.Product;
import org.springmvcshoppingcart.model.PaginationResult;
import org.springmvcshoppingcart.model.ProductInfo;

public interface ProductDAO {
    public Product findProduct(String code);

    public ProductInfo findProductInfo(String code) ;


    public PaginationResult<ProductInfo> queryProducts(int page,
                                                       int maxResult, int maxNavigationPage  );

    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                                                       int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);

}
