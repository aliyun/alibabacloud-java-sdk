// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuthorizeProductListResult extends TeaModel {
    @NameInMap("authorizedProductList")
    public java.util.List<ProductInfo> authorizedProductList;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("total")
    public Long total;

    public static AuthorizeProductListResult build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeProductListResult self = new AuthorizeProductListResult();
        return TeaModel.build(map, self);
    }

    public AuthorizeProductListResult setAuthorizedProductList(java.util.List<ProductInfo> authorizedProductList) {
        this.authorizedProductList = authorizedProductList;
        return this;
    }
    public java.util.List<ProductInfo> getAuthorizedProductList() {
        return this.authorizedProductList;
    }

    public AuthorizeProductListResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthorizeProductListResult setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
