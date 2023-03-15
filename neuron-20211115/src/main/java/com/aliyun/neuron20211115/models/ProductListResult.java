// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ProductListResult extends TeaModel {
    @NameInMap("products")
    public java.util.List<Product> products;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Integer total;

    public static ProductListResult build(java.util.Map<String, ?> map) throws Exception {
        ProductListResult self = new ProductListResult();
        return TeaModel.build(map, self);
    }

    public ProductListResult setProducts(java.util.List<Product> products) {
        this.products = products;
        return this;
    }
    public java.util.List<Product> getProducts() {
        return this.products;
    }

    public ProductListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProductListResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
